package com.zhidisoft.crm.service;

import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zhidisoft.crm.entity.TbCrmLeads;
import com.zhidisoft.crm.entity.TbCrmLeadsExample;
import com.zhidisoft.crm.entity.TbCrmLeadsExample.Criteria;
import com.zhidisoft.crm.mapper.TbCrmLeadsMapper;
import com.zhidisoft.crm.util.DateUtil;
import com.zhidisoft.crm.vo.LeadsVO;
import com.zhidisoft.crm.vo.PageVO;

@Service
@Transactional
public class TbCrmLeadsService {

	@Autowired
	TbCrmLeadsMapper leadsMapper;

	@Autowired
	TbSystemUserService userService;

	public Long totalCount(String searchText,String where1) {
		Date now = null;
		TbCrmLeadsExample example = new TbCrmLeadsExample();
		Criteria cri = example.createCriteria();
		if (StringUtils.isNotBlank(searchText)) {
			cri.andNameLike("%" + searchText + "%");
		}
		if (StringUtils.isNotBlank(where1) && where1.equals("week")) {
			cri.andCreatetimeBetween(DateUtil.firstDayOfWeek(),new Date());
		}
		if (StringUtils.isNotBlank(where1) && where1.equals("today")) {
			cri.andNextsteptimeEqualTo(new Date());
		}
		if (StringUtils.isNotBlank(where1) && where1.equals("thisweek")) {
			cri.andNextsteptimeBetween(DateUtil.firstDayOfWeek(),DateUtil.lastDayOfWeek());
		}
		
		if (StringUtils.isNotBlank(where1) && where1.equals("thismonth")) {
			cri.andNextsteptimeBetween(DateUtil.firstDayOfMonth(),DateUtil.LastDayOfMonth());
		}
		if (StringUtils.isNotBlank(where1) && where1.equals("nocontact7")) {
			cri.andNextsteptimeBetween(new Date(),DateUtil.getAddDaysDate(new Date(),7));
		}	
		if (StringUtils.isNotBlank(where1) && where1.equals("nocontact15")) {
			cri.andNextsteptimeBetween(new Date(),DateUtil.getAddDaysDate(new Date(),15));
		}
		if (StringUtils.isNotBlank(where1) && where1.equals("nocontact30")) {
			cri.andNextsteptimeBetween(new Date(),DateUtil.getAddDaysDate(new Date(),30));
		}
		if (StringUtils.isNotBlank(where1) && where1.equals("update")) {
			cri.andUpdatetimeBetween(DateUtil.firstDayOfWeek(),new Date());
		}
		return leadsMapper.countByExample(example);
	}

	/*public List<LeadsVO> findByPage(Integer pageNum, Integer pageSize, String searchText) {
		return leadsMapper.selectByPage((pageNum - 1) * pageSize, pageNum * pageSize, searchText);
	}*/

	// 查询展示的用户信息
	public PageVO<LeadsVO> selectByPage(Integer pageNum, Integer pageSize, String searchText,String where1) {
		PageVO<LeadsVO> page = new PageVO<>();
		Date beginDate = null,endDate = null;
		if ("week".equals(where1)) {
			endDate = new Date();
			beginDate = DateUtil.firstDayOfWeek();
		}
		if ("today".equals(where1)) {
			endDate = new Date();
		}
		if ("thisweek".equals(where1)) {
			beginDate = DateUtil.firstDayOfWeek();
			endDate = DateUtil.lastDayOfWeek();
		}
		if ("thismonth".equals(where1)) {
			beginDate = DateUtil.firstDayOfMonth();
			endDate = DateUtil.LastDayOfMonth();
		}
		
		if ("nocontact7".equals(where1)) {
			beginDate = new Date();
			endDate = DateUtil.getAddDaysDate(beginDate,7);
		}
		
		if ("nocontact15".equals(where1)) {
			beginDate = new Date();
			endDate = DateUtil.getAddDaysDate(beginDate,15);
		}
		
		if ("nocontact30".equals(where1)) {
			beginDate = new Date();
			endDate = DateUtil.getAddDaysDate(beginDate,30);
		}
		
		if ("update".equals(where1)) {
			beginDate = DateUtil.firstDayOfWeek();
			endDate = new Date();
		}
		
		page.setList(leadsMapper.selectByPage((pageNum - 1) * pageSize, pageNum * pageSize, searchText,where1,beginDate,endDate));
		page.setPageNum(pageNum);
		page.setPageSize(pageSize);
		page.setTotalCount(totalCount(searchText,where1));
		return page;
	}

	public void save(LeadsVO leads) {
		String userId = userService.selectUserByUsername(leads.getUsername()).getId();
		leads.setOwneruserid(userId);
		leads.setCreatoruserid(userId);
		leads.setCreatetime(new Date());
		leads.setUpdatetime(new Date());
		leads.setIsdeleted((short) 1);
		leads.setHavetime(new Date());
		leadsMapper.insertSelective(leads);
	}

	public void update(String leadsId,LeadsVO leads) {
		leads.setUpdatetime(new Date());
		leads.setLeadsid(leadsId);
		leadsMapper.updateByPrimaryKeySelective(leads);
	}

	public TbCrmLeads selectById(String id) {
		return leadsMapper.selectByPrimaryKey(id);
	}

	public void deleteByIds(String[] ids) {
		for (String id : ids) {
			TbCrmLeads leads = new TbCrmLeads();
			leads.setIsdeleted((short)1);
			leads.setLeadsid(id);
			leadsMapper.updateByPrimaryKeySelective(leads);
		}
	}

}
