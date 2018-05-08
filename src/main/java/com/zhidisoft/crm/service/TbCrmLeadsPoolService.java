package com.zhidisoft.crm.service;


import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhidisoft.crm.entity.TbCrmLeadsPool;
import com.zhidisoft.crm.entity.TbCrmLeadsPoolExample;
import com.zhidisoft.crm.entity.TbCrmLeadsPoolExample.Criteria;
import com.zhidisoft.crm.mapper.TbCrmLeadsPoolMapper;
import com.zhidisoft.crm.vo.PageVO;
import com.zhidisoft.crm.vo.TbCrmLeadsPoolVO;

@Service
@Transactional
public class TbCrmLeadsPoolService {
	@Autowired
	TbCrmLeadsPoolMapper crmLeadsMapper;
	@Autowired
	TbSystemUserService systemUserService;
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @param searchText
	 * @return
	 */
	public PageVO<TbCrmLeadsPoolVO> findPage(Integer pageNum, Integer pageSize, String searchText) {
		PageVO<TbCrmLeadsPoolVO> page = new PageVO<>();
		page.setList(crmLeadsMapper.findPage((pageNum - 1) * pageSize, pageNum * pageSize, searchText));
		page.setPageNum(pageNum);
		page.setPageSize(pageSize);
		page.setTotalCount(count(searchText));
		return page;
	}
	/**
	 * 总条数
	 * @param searchText
	 * @return
	 */
	public Long count(String searchText){
		TbCrmLeadsPoolExample example=new TbCrmLeadsPoolExample();
		Criteria c=example.createCriteria();
		if(StringUtils.isNotBlank(searchText)){
			c.andAddressLike("%"+searchText+"%");
		}
		return crmLeadsMapper.countByExample(example);
	}
	/**
	 * 新增一条线索
	 * @param leads
	 */
	public void save(TbCrmLeadsPoolVO leads){
		leads.setCreatetime(new Date());
		leads.setUpdatetime(new Date());
		leads.setIsdeleted((short)1);
		leads.setHavetime(new Date());
		crmLeadsMapper.insertSelective(leads);
	}
	/**
	 * 根据Id查找一条线索
	 * @param leadsId
	 * @return
	 */
	public TbCrmLeadsPool findLeadsByLeadsId(String leadsId){
		return crmLeadsMapper.selectByPrimaryKey(leadsId);
	}
	/**
	 * 修改一条线索
	 * @param leads
	 */
	public void update(String leadsId,TbCrmLeadsPool leads){
		leads.setUpdatetime(new Date());
		leads.setLeadsid(leadsId);
		crmLeadsMapper.updateByPrimaryKeySelective(leads);
	}
	/**
	 * 通过ID修改
	 * @param record
	 * @return
	 */
	public int  ByIdUpdate(TbCrmLeadsPool leads){
		return crmLeadsMapper.updateByPrimaryKeySelective(leads);
	}
	/**
	 * 批量删除
	 * @param ids
	 */
	public void deleteByIds(String[] ids){
		for (String id : ids) {
			crmLeadsMapper.deleteByPrimaryKey(id);
		}
	}
}
