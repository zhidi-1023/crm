package com.zhidisoft.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.zhidisoft.crm.entity.TbSystemUser;
import com.zhidisoft.crm.service.TbSystemUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestSystemUserService {

	@Autowired
	TbSystemUserService userService;
	@Autowired
	StandardPasswordEncoder pEncoder;

	@Test
	public void save() {
		TbSystemUser user;
		long begin = System.currentTimeMillis();
		// for (int i = 0; i < 10000; i++) {
		// 	user = new TbSystemUser();
		// 	user.setUsername("adminguo" + i);
		// 	user.setPassword(pEncoder.encode("admin"));
		// 	userService.save(user);
		// }

		user = new TbSystemUser();
		user.setUsername("admin");
		user.setPassword(pEncoder.encode("admin"));
		userService.save(user);
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}
    
}
