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

import com.zhidisoft.crm.entity.TbCrmBusiness;
import com.zhidisoft.crm.service.TbCrmBusinessService;
import com.zhidisoft.crm.service.TbCrmBusinessStatusService;
import com.zhidisoft.crm.service.TbCrmBusinessContactsService;
import com.zhidisoft.crm.service.TbCrmBusinessCustomerService;
import com.zhidisoft.crm.service.TbBusinessSystemUserService;
import com.zhidisoft.crm.vo.BusinessVO;

@Controller
@RequestMapping("business")
public class BusinessController {
	
	@Autowired
	TbCrmBusinessService businessService;
	@Autowired
	TbBusinessSystemUserService userservice;
	@Autowired
	TbCrmBusinessCustomerService customerservice;
	@Autowired
	TbCrmBusinessStatusService businessstatusservice;
	@Autowired
	TbCrmBusinessContactsService contactsservice;
	//分页
	@GetMapping("listPage")
	public ModelAndView listPage(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, String searchText,
			@RequestParam(name="where1",defaultValue="")String where1) {
		ModelAndView mav=new ModelAndView("business/listPage", "businlist", businessService.findPage(pageNum, pageSize, searchText, where1));
		mav.addObject("searchText",searchText);
		return mav;
	}
	@GetMapping("businlist")
	public ModelAndView businlist(){
		return new ModelAndView("business/businlist");
	}
	//删除
	@DeleteMapping("delete/{businessid}")
	@ResponseBody
	public String delete(@PathVariable("businessid")String businessid){
		businessService.deleteById(businessid);
		return "success";
	}
	//批量删除
	@DeleteMapping("deleteAll")
	@ResponseBody
	public String deleteAll(@RequestBody String ids){
		String[] idArr = ids.split(",");
		businessService.deleteByIds(idArr);
		return "success";
	}
	
	/*修改*/
	@GetMapping("update/{businessid}")
	public ModelAndView updateUI(@PathVariable("businessid")String businessid){
		return new ModelAndView("business/form","business",businessService.findfourById(businessid)).addObject("method", "update").addObject("userList",userservice.All()).
																			addObject("customerList",customerservice.All()).
																			addObject("businessstatusList",businessstatusservice.All()).
																			addObject("contactssList",contactsservice.All());
															};
	
	@PostMapping("update/{businessid}")
	public ModelAndView update(@PathVariable("businessid")String businessid, BusinessVO bvo){
		TbCrmBusiness business=bvo.tobusiness();
		business.setBusinessid(businessid);
		businessService.update(business);
		return new ModelAndView("redirect:/business/listPage");
	}
		
	/*保存*/
	@GetMapping("save")
	public ModelAndView saveUI(){
		return new ModelAndView("business/businesssava").addObject("userList",userservice.All()).
																addObject("customerList",customerservice.All()).
																addObject("businessstatusList",businessstatusservice.All()).
																addObject("contactssList",contactsservice.All());
	}
	
	@PostMapping("save")
	public ModelAndView save(@Valid BusinessVO bvo,BindingResult result){
		if(result.hasErrors()){
			return new ModelAndView("business/sava","errorMsg",result.getAllErrors().get(0).getDefaultMessage());
		}
		TbCrmBusiness business=bvo.tobusiness();
		
		businessService.save(business);
		return new ModelAndView("redirect:/business/listPage");
	}
	
	/*查看*/
	@GetMapping("check/{businessid}")
	public ModelAndView check(@PathVariable("businessid")String businessid){
		return new ModelAndView("business/check","business",businessService.findfourById(businessid));
	}
	
	
	@GetMapping("boost")
	public ModelAndView boost(){
		return new ModelAndView("business/boost");
	}
	
}
