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
	 * æŸ¥è¯¢æ‰?æœ?
	 * @return
	 */
	public List<TbCrmCustomer> findAll(){
		
		return customerMapper.selectByExample(new TbCrmCustomerExample());
	}
	
	/**
	 * 
	 * @param pageNum
	 *            ä»?1å¼?å§?
	 * @param pageSize
	 * @return
	 */
	public List<TbCrmCustomer> page(Integer pageNum, Integer pageSize, String searchText) {
		return customerMapper.findPage((pageNum - 1) * pageSize, pageNum * pageSize, searchText);
	}


	/**
	 * æ€»æ¡æ•?
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
	 * é€šè¿‡IDæŸ¥è¯¢ä¸?æ¡æ•°æ?
	 * @param customerid
	 * @return
	 */
	public CustomerUserNameVO ByIdUsername(String customerid){
		return customerMapper.ByIdUsername(customerid);
	}
	/**
	 * é€šè¿‡IDä¿®æ”¹
	 * @param record
	 * @return
	 */
	public int  ByIdAllUpdate(TbCrmCustomer record){
		
		return customerMapper.updateByPrimaryKey(record);
	}
	/**
	 * é€šè¿‡IDåŠ¨æ?ä¿®æ”?
	 * @param record
	 * @return
	 */
	public int  ByIdUpdate(TbCrmCustomer record){
		
		return customerMapper.updateByPrimaryKeySelective(record);
	}
	/**
	 * å¾?customerå­˜ä¸€æ¡æ•°æ?
	 * @param record
	 * @return
	 */
	public int CustomerSave(TbCrmCustomer record){
		return customerMapper.insert(record);
	}
}
