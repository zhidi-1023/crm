package com.zhidisoft.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zhidisoft.crm.entity.TbCrmBusiness;
import com.zhidisoft.crm.service.TbCrmBusinessService;
import com.zhidisoft.crm.service.TbCrmBusinessStatusService;
import com.zhidisoft.crm.vo.BusinessVO;

@Controller
@RequestMapping("status")
public class BusinessStatusController {
	@Autowired
	TbCrmBusinessService businessService;
	@Autowired
	TbCrmBusinessStatusService businessstatusservice;
	
	

	/*修改*/
	@GetMapping("update/{businessid}")
	public ModelAndView updateUI(@PathVariable("businessid")String businessid){
		return new ModelAndView("business/boostsava","business",businessService.findfourById(businessid)).
															addObject("businessstatusList",businessstatusservice.All());
															};
	
	@PostMapping("update/{businessid}")
	public ModelAndView update(@PathVariable("businessid")String businessid, BusinessVO bvo){
		TbCrmBusiness business=bvo.tobusiness();
		business.setBusinessid(businessid);
		businessService.update(business);
		return new ModelAndView("redirect:/business/listPage");
	}
	
}
