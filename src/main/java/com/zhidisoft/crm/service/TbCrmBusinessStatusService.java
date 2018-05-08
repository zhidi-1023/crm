package com.zhidisoft.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhidisoft.crm.entity.TbCrmBusiness;
import com.zhidisoft.crm.entity.TbCrmBusinessStatus;
import com.zhidisoft.crm.entity.TbCrmBusinessStatusExample;
import com.zhidisoft.crm.mapper.TbCrmBusinessMapper;
import com.zhidisoft.crm.mapper.TbCrmBusinessStatusMapper;
@Service
@Transactional
public class TbCrmBusinessStatusService {
	@Autowired
	TbCrmBusinessStatusMapper BusinessStatusmapper;
	
	/*查询TbCrmBusinessStatus所有字段*/
	public List<TbCrmBusinessStatus> All(){
		return BusinessStatusmapper.selectByExample(new TbCrmBusinessStatusExample());
	}
	
	/**
	 * 修改一条数据
	 * @param role
	 */
	public void update(TbCrmBusinessStatus status){
		BusinessStatusmapper.updateByPrimaryKeySelective(status);
	}
	

}
