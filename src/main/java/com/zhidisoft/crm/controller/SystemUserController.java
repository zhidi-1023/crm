package com.zhidisoft.crm.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.zhidisoft.crm.entity.TbSystemUser;
import com.zhidisoft.crm.service.TbSystemRoleService;
import com.zhidisoft.crm.service.TbSystemUserService;
import com.zhidisoft.crm.vo.UserVO;

@Controller
@RequestMapping("user")
public class SystemUserController {

	
	@Autowired
	TbSystemUserService userService;

	@Autowired
	TbSystemRoleService roleService;

	@GetMapping("list")
	public ModelAndView listPage(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, String searchText) {
		ModelAndView mav = new ModelAndView("system/userlist", "userPage",
				userService.selectByPage(pageNum, pageSize, searchText));
		mav.addObject("searchText", searchText);
		return mav;
	}

	@GetMapping("save")
	public ModelAndView save() {
		return new ModelAndView("system/userform", "method", "save");
	}

	@PostMapping("save")
	public ModelAndView save(@Valid UserVO userVO, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("system/userform", "errorMsg", result.getAllErrors().get(0).getDefaultMessage());
		}
		TbSystemUser user = userVO.toUser();
		userService.save(user);
		return new ModelAndView("redirect:/user/list");
	}

	@GetMapping("update/{id}")
	public ModelAndView updateUI(@PathVariable("id") String userId) {
		return new ModelAndView("system/userform", "user", userService.selectById(userId)).addObject("method", "update");
	}

	@PostMapping("update/{id}")
	public ModelAndView save(@PathVariable("id") String userId, String username) {
		TbSystemUser user = new TbSystemUser();
		user.setId(userId);
		user.setUsername(username);
		userService.update(user);
		return new ModelAndView("redirect:/user/list");
	}

	@DeleteMapping("deleteAll")
	@ResponseBody
	public String deleteAll(@RequestBody String idsStr) {
		String[] ids = idsStr.split(",");
		userService.deleteByIds(ids);
		return "success";
	}

	@DeleteMapping("delete/{id}")
	@ResponseBody
	public String delete(@PathVariable("id") String id) {
		userService.deleteById(id);
		return "success";
	}
    
	//为用户分配角色
	@GetMapping("role/{userId}")
	public ModelAndView roleUI(@PathVariable("userId") String userId) {
		return new ModelAndView("system/_role", "roleList", roleService.selectAll()).addObject("user",
				userService.selectRoleByUserId(userId));
	}

	@PostMapping("role/{userId}")
	@ResponseBody
	public String role(@PathVariable("userId") String userId, String roleId) {
		TbSystemUser user = new TbSystemUser();
		user.setId(userId);
		user.setRoleId(roleId);
		userService.update(user);
		return "success";
	}

}
