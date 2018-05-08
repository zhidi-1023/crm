package com.zhidisoft.crm.service;

import com.zhidisoft.crm.entity.TbCrmBusiness;

import com.zhidisoft.crm.entity.TbCrmBusinessExample;
import com.zhidisoft.crm.entity.TbCrmBusinessStatus;
import com.zhidisoft.crm.entity.TbCrmBusinessStatusExample;
import com.zhidisoft.crm.entity.TbCrmCustomer;
import com.zhidisoft.crm.entity.TbSystemUser;
import com.zhidisoft.crm.entity.TbCrmBusinessExample.Criteria;
import com.zhidisoft.crm.mapper.TbCrmBusinessMapper;
import com.zhidisoft.crm.mapper.TbCrmCustomerMapper;
import com.zhidisoft.crm.mapper.TbSystemUserMapper;
import com.zhidisoft.crm.util.DateUtil;
import com.zhidisoft.crm.vo.PageVO;
import com.zhidisoft.crm.vo.TbCrmBusinessVO;
import com.zhidisoft.crm.vo.FourVO;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class TbCrmBusinessService {
	@Autowired
	TbCrmBusinessMapper businessMapper;

	/**
	 * 总条数
	 * 
	 * @return
	 */
	public Long count(String searchText) {
		TbCrmBusinessExample example = new TbCrmBusinessExample();
		Criteria c = example.createCriteria();
		if (StringUtils.isNotBlank(searchText)) {
			c.andNameLike("%" + searchText + "%");
		}
		return businessMapper.countByExample(example);
	}

	/**
	 * 自己封装的Page
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param searchText
	 * @return
	 */
	public PageVO<TbCrmBusinessVO> findPage(Integer pageNum, Integer pageSize, String searchText ,String where1) {
		Date now = null, first = null;
		if("week".equals(where1)){
			 now=new Date();
			//TODO jdk8日期处理
			 first= DateUtil.firstDayOfWeek();
		}
		
		PageVO<TbCrmBusinessVO> page = new PageVO<>();
		page.setList(businessMapper.findPage((pageNum - 1) * pageSize, pageNum * pageSize, searchText,where1,first,now));
		page.setPageNum(pageNum);
		page.setPageSize(pageSize);
		page.setTotalCount(count(searchText));
		return page;
	}
	
	/**
	 * 根据id删除一条数据
	 * @param id
	 */
	public void deleteById(String id){
		businessMapper.deleteByPrimaryKey(id);
	}
	/**
	 * 批量删除
	 * @param ids
	 */
	public void deleteByIds(String[] ids){
		for(String id:ids){
			businessMapper.deleteByPrimaryKey(id);
		}
	}
	
	/**
	 * 根据id查询一条数据
	 * @param id
	 * @return
	 */
	public TbCrmBusiness findFuncById(String businessid) {
		return businessMapper.selectByPrimaryKey(businessid);
	}
	/**
	 * 修改一条数据
	 * @param role
	 */
	public void update(TbCrmBusiness business){
		businessMapper.updateByPrimaryKeySelective(business);
	}
	
	/**
	 * 保存一条数据
	 * 
	 * @param function
	 */
	public void save(TbCrmBusiness business) {
		businessMapper.insertSelective(business);
	}
	
	/*关联四张表查询*/
	public FourVO findfourById(String businessid) {
		return  businessMapper.fourById(businessid);
	}
	
	/*查询TbCrmBusinessStatus所有字段*/
	public List<TbCrmBusiness> All(){
		return businessMapper.selectByExample(new TbCrmBusinessExample());
	}
}
