package com.zhidisoft.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhidisoft.crm.entity.TbCrmBusinessStatus;
import com.zhidisoft.crm.entity.TbCrmBusinessStatusExample;
import com.zhidisoft.crm.entity.TbCrmContacts;
import com.zhidisoft.crm.entity.TbCrmContactsExample;
import com.zhidisoft.crm.mapper.TbCrmBusinessStatusMapper;
import com.zhidisoft.crm.mapper.TbCrmContactsMapper;
@Service
@Transactional
public class TbCrmBusinessContactsService {
	@Autowired
	TbCrmContactsMapper Contactsmapper;
	
	
	public List<TbCrmContacts> All(){
		
		return Contactsmapper.selectByExample(new TbCrmContactsExample());
		
	}
}
