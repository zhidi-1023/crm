package com.zhidisoft.crm.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.zhidisoft.crm.entity.TbSystemRoleFunctionExample;
import com.zhidisoft.crm.entity.TbSystemRoleFunctionKey;
import com.zhidisoft.crm.mapper.TbSystemRoleFunctionMapper;

@Service
@Transactional
public class TbSystemRoleFunctionService {
	
	@Autowired
	TbSystemRoleFunctionMapper roleFunctionMapper;
	
	TbSystemRoleFunctionKey roleFunctionKey;
	TbSystemRoleFunctionExample example;

	public void saveFunction(String roleId, String[] ids){
		//先删除已选的菜单
		example = new TbSystemRoleFunctionExample();
		example.createCriteria().andRoleidEqualTo(roleId);
		roleFunctionMapper.deleteByExample(example);
		//添加菜单
		roleFunctionKey = new TbSystemRoleFunctionKey();
		for (String funcId : ids) {
			roleFunctionKey.setRoleid(roleId);
			roleFunctionKey.setFuncid(funcId);
			roleFunctionMapper.insertSelective(roleFunctionKey);
		}
	}
	
	public List<TbSystemRoleFunctionKey> selectByRoleId(String roleId){
		example = new TbSystemRoleFunctionExample();
		example.createCriteria().andRoleidEqualTo(roleId);
		return roleFunctionMapper.selectByExample(example);
	}
	
}
