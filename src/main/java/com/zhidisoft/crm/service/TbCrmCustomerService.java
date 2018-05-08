package com.zhidisoft.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhidisoft.crm.entity.TbCrmCustomer;
import com.zhidisoft.crm.entity.TbCrmCustomerExample;
import com.zhidisoft.crm.mapper.TbCrmCustomerMapper;

@Service
@Transactional
public class TbCrmCustomerService {
	@Autowired
	TbCrmCustomerMapper customermapper;
	
	
	public List<TbCrmCustomer> All(){
		
		return customermapper.selectByExample(new TbCrmCustomerExample());
		
	}
}
