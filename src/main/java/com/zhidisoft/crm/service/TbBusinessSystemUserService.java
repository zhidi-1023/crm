package com.zhidisoft.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhidisoft.crm.entity.TbSystemUser;
import com.zhidisoft.crm.entity.TbSystemUserExample;
import com.zhidisoft.crm.mapper.TbSystemUserMapper;
@Service
@Transactional
public class TbBusinessSystemUserService {
	
	@Autowired
	TbSystemUserMapper usermapper;
	
	
	public List<TbSystemUser> All(){
		
		return usermapper.selectByExample(new TbSystemUserExample());
		
	}
}
