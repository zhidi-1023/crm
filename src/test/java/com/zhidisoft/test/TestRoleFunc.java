package com.zhidisoft.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhidisoft.crm.entity.TbSystemRoleFunctionKey;
import com.zhidisoft.crm.service.TbSystemRoleFunctionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestRoleFunc {

	@Autowired
	TbSystemRoleFunctionService roleFunctionService;
	
	@Test
	public void testFuncIds(){
		List<TbSystemRoleFunctionKey> roleFunctionKeys = roleFunctionService.selectByRoleId("395E42B31006449F93116CD63DE06EFF");
	    for (TbSystemRoleFunctionKey func : roleFunctionKeys) {
			System.out.println(func.getFuncid());
		}
	}
	
}
