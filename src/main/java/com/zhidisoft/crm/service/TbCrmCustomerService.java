package com.zhidisoft.crm.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhidisoft.crm.entity.TbCrmCustomer;
import com.zhidisoft.crm.entity.TbCrmCustomerExample;
import com.zhidisoft.crm.entity.TbCrmCustomerExample.Criteria;
import com.zhidisoft.crm.mapper.TbCrmCustomerMapper;
import com.zhidisoft.crm.vo.CustomerUserNameVO;


@Service
@Transactional
public class TbCrmCustomerService {
	@Autowired
	TbCrmCustomerMapper  customerMapper;
	/**
	 * 查询�?�?
	 * @return
	 */
	public List<TbCrmCustomer> findAll(){
		
		return customerMapper.selectByExample(new TbCrmCustomerExample());
	}
	
	/**
	 * 
	 * @param pageNum
	 *            �?1�?�?
	 * @param pageSize
	 * @return
	 */
	public List<TbCrmCustomer> page(Integer pageNum, Integer pageSize, String searchText) {
		return customerMapper.findPage((pageNum - 1) * pageSize, pageNum * pageSize, searchText);
	}


	/**
	 * 总条�?
	 * 
	 * @return
	 */
	public Long count(String searchText) {
		TbCrmCustomerExample example = new TbCrmCustomerExample();
		Criteria  c = example.createCriteria();
		if (StringUtils.isNotBlank(searchText)) {
			c.andNameLike("%" + searchText + "%");
		}
		return customerMapper.countByExample(example);
	}
	/**
	 * 通过ID查询�?条数�?
	 * @param customerid
	 * @return
	 */
	public CustomerUserNameVO ByIdUsername(String customerid){
		return customerMapper.ByIdUsername(customerid);
	}
	/**
	 * 通过ID修改
	 * @param record
	 * @return
	 */
	public int  ByIdAllUpdate(TbCrmCustomer record){
		
		return customerMapper.updateByPrimaryKey(record);
	}
	/**
	 * 通过ID动�?�修�?
	 * @param record
	 * @return
	 */
	public int  ByIdUpdate(TbCrmCustomer record){
		
		return customerMapper.updateByPrimaryKeySelective(record);
	}
	/**
	 * �?customer存一条数�?
	 * @param record
	 * @return
	 */
	public int CustomerSave(TbCrmCustomer record){
		return customerMapper.insert(record);
	}
}
