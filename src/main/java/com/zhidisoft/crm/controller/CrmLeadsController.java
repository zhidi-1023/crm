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
import com.zhidisoft.crm.service.TbCrmLeadsService;
import com.zhidisoft.crm.service.TbSystemUserService;
import com.zhidisoft.crm.vo.LeadsVO;

@Controller
@RequestMapping("leads")
public class CrmLeadsController {
	
	@Autowired
	TbCrmLeadsService leadsService;
	
	@Autowired
	TbSystemUserService userService;
	
	/*@GetMapping("into")
	public ModelAndView leadsList(){
		return new ModelAndView("crm/alist");
	} 
	
	@GetMapping("alist")
	@ResponseBody
	public LayUITableVO clientPage(Integer page,Integer limit,String searchText) {
		long count=leadsService.totalCount(searchText);
		return new LayUITableVO().setCode(0).setCount(count).setData(leadsService.findByPage(page, limit, searchText));
	}*/
	
	@GetMapping("list")
	public ModelAndView roleList(@RequestParam(name = "pageNum",defaultValue = "1") Integer pageNum,
			@RequestParam(name = "pageSize",defaultValue = "10")Integer pageSize,String searchText,
			@RequestParam(name = "where1",defaultValue="")String where1){
		ModelAndView mav = new ModelAndView("crm/leadslist","leadPage",leadsService.selectByPage(pageNum,pageSize,searchText,where1));
		mav.addObject("searchText",searchText);
		return mav;
	}
	
	@GetMapping("save")
	public ModelAndView save(){
		return new ModelAndView("crm/leadsform").addObject("method","save");
	}
	
	@PostMapping("save")
	public ModelAndView save(@Valid LeadsVO leadsVO,BindingResult result){
		if (result.hasErrors()) {
			return new ModelAndView("crm/leadsform","errorMsg",result.getAllErrors().get(0).getDefaultMessage());
		}
		leadsService.save(leadsVO);
		return new ModelAndView("redirect:/leads/list");
	}
	
	@GetMapping("update/{id}")
	public ModelAndView updateUI(@PathVariable("id") String LeadsId) {
		return new ModelAndView("crm/leadsform", "leads", leadsService.selectById(LeadsId))
				.addObject("method", "update");
	}

	@PostMapping("update/{id}")
	public ModelAndView save(@PathVariable("id") String leadsId,@Valid LeadsVO leadsVO) {
		leadsService.update(leadsId,leadsVO);
		return new ModelAndView("redirect:/leads/list");
	}
	
	@GetMapping("info/{id}")
	public ModelAndView info(@PathVariable("id") String LeadsId) {
		return new ModelAndView("crm/leadsinfo", "leads", leadsService.selectById(LeadsId))
				.addObject("method", "info");
	}
	
	@DeleteMapping("deleteAll")
	@ResponseBody
	public String deleteAll(@RequestBody String idsStr){
		String [] ids = idsStr.split(",");
		leadsService.deleteByIds(ids);
		return "success";	
	}

}
