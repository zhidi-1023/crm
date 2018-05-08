package com.zhidisoft.crm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zhidisoft.crm.entity.TbSystemFunction;
import com.zhidisoft.crm.entity.TbSystemUser;
import com.zhidisoft.crm.service.TbSystemFunctionService;
import com.zhidisoft.crm.service.TbSystemUserService;

@Controller()
@RequestMapping("login")
public class LoginController {

	@Autowired
	TbSystemUserService userService;
	@Autowired
	StandardPasswordEncoder pEncoder;
	@Autowired
	TbSystemFunctionService funcService;

	@GetMapping
	public ModelAndView index() {
		return new ModelAndView("login");
	}

	@PostMapping
	public ModelAndView login(String username, String password, HttpSession session) {
        
		List<TbSystemFunction> functions = funcService.selectFuncsByUsername(username);
		
		if (StringUtils.isEmpty(username)) {
			return new ModelAndView("login", "errorMsg", "用户名不能为空");
		}

		if (StringUtils.isEmpty(password)) {
			return new ModelAndView("login", "errorMsg", "密码不能为空");
		}

		TbSystemUser dbUser = userService.selectUserByUsername(username);
		if (dbUser == null) {
			return new ModelAndView("login", "errorMsg", "用户名不存在");
		}

		if (!pEncoder.matches(password, dbUser.getPassword())) {
			return new ModelAndView("login", "errorMsg", "密码错误");
		}
		
		if (functions.size() < 0) {
			return new ModelAndView("redirect:/role/list");
		} 
		session.setAttribute("username", dbUser.getUsername());
		session.setAttribute("functions", functions);
		return new ModelAndView("index");
	}

}
