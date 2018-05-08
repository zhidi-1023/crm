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
import com.zhidisoft.crm.entity.TbSystemRole;
import com.zhidisoft.crm.service.TbSystemFunctionService;
import com.zhidisoft.crm.service.TbSystemRoleFunctionService;
import com.zhidisoft.crm.service.TbSystemRoleService;
import com.zhidisoft.crm.vo.RoleVO;

@Controller
@RequestMapping("role")
public class SystemRoleController {

	@Autowired
	TbSystemRoleService roleService;
	
	@Autowired
	TbSystemFunctionService funcService;
	
	@Autowired
	TbSystemRoleFunctionService roleFuncService;
	
	@GetMapping("list")
	public ModelAndView roleList(@RequestParam(name = "pageNum",defaultValue = "1") Integer pageNum,
			@RequestParam(name = "pageSize",defaultValue = "10")Integer pageSize,String searchText){
		ModelAndView mav = new ModelAndView("system/rolelist","rolePage",roleService.findRolesByPage(pageNum,pageSize,searchText));
		mav.addObject("searchText",searchText);
		return mav;
	}
	
	@GetMapping("save")
	public ModelAndView save(){
		return new ModelAndView("system/roleform","method","save");
	}
	@PostMapping("save")
	public ModelAndView save(@Valid()RoleVO roleVO,BindingResult result){
		if (result.hasErrors()) {
			return new ModelAndView("system/roleform","errorMsg",result.getAllErrors().get(0).getDefaultMessage());
		}
		TbSystemRole role = roleVO.toRole();
		roleService.save(role);
		return new ModelAndView("redirect:/role/list");
	}
	
	@GetMapping("update/{id}")
	public ModelAndView update(@PathVariable("id")String id){
		return new ModelAndView("system/roleform","role",roleService.selectById(id)).addObject("method","update");
	}
	@PostMapping("update/{id}")
	public ModelAndView update(@PathVariable("id")String id,String rolename){
		TbSystemRole role = new TbSystemRole();
		role.setId(id);
		role.setRolename(rolename);
		roleService.update(role);
		return new ModelAndView("redirect:/role/list");
	}
	
	@GetMapping("delete/{id}")
	public ModelAndView delete(@PathVariable("id")String id){
		roleService.delete(id);
		return new ModelAndView("redirect:/role/list");
	}
	
	@DeleteMapping("deleteAll")
	@ResponseBody
	public String deleteAll(@RequestBody String idsStr){
		String [] ids = idsStr.split(",");
		roleService.deleteByIds(ids);
		return "success";	
	}
	@GetMapping("func/{roleId}")
	public ModelAndView funcUI(@PathVariable("roleId")String roleId){
		return new ModelAndView("system/_func","funcList",funcService.selectAll())
				.addObject("role",roleService.selectById(roleId))
				.addObject("funcBySelect",roleFuncService.selectByRoleId(roleId));
	}
	
	@PostMapping("func/{roleId}")
	@ResponseBody
	public String func(@PathVariable("roleId") String roleId,String funcIds){
		String[] ids = funcIds.split(",");
		roleFuncService.saveFunction(roleId,ids);
		return "success";
	}
}
