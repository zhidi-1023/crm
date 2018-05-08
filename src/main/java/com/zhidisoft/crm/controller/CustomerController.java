package com.zhidisoft.crm.controller;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zhidisoft.crm.entity.TbCrmCustomer;
import com.zhidisoft.crm.entity.TbSystemUser;
import com.zhidisoft.crm.service.TbCrmCustomerService;
import com.zhidisoft.crm.service.TbSystemUserService;
import com.zhidisoft.crm.vo.AjaxVO;
import com.zhidisoft.crm.vo.CustomerUserNameVO;
import com.zhidisoft.crm.vo.LayUITableVO;

@RequestMapping("customer")
@Controller
public class CustomerController {
	@Autowired
	TbCrmCustomerService customerService;
	@Autowired
	TbSystemUserService userService;
	/**
	 *   利用LayUI进行数据表格查询
	 *   自己封装返回数据,需要什么就返回什么
	 * @param page
	 * @param limit
	 * @return
	 */
	@GetMapping("list")
	@ResponseBody
	public LayUITableVO clientPage(Integer page,Integer limit,@Param("keyword")String keyword) {
		 long count=customerService.count(keyword);
		return new LayUITableVO().setCode(0).setCount(count).setData(customerService.page(page, limit, keyword));
	}

	@GetMapping("all")
	public ModelAndView clientAll() {

		return new ModelAndView("customer/list");
	}
	/**
	 * 通过ID查询到一条数据
	 * @param customerid
	 * @return
	 */
	@GetMapping("query/{customerid}")
	@ResponseBody
	public ModelAndView clientQuery(@PathVariable("customerid")String customerid){
		CustomerUserNameVO customer=customerService.ByIdUsername(customerid);
		return new ModelAndView("customer/query","customer",customer);
	}
	
	/**
	 * 通过ID查询到一条数据
	 * @param customerid
	 * @return
	 */
	@GetMapping("update/{customerid}")
	@ResponseBody
	public ModelAndView clientUpdate(@PathVariable("customerid")String customerid){
		CustomerUserNameVO customer=customerService.ByIdUsername(customerid);
		List<TbSystemUser>userlist=userService.findAll();
		return new ModelAndView("customer/update","customer",customer).addObject("userlist", userlist);
	}
	/**
	 * 客户池信息编辑功能
	 * @param customer
	 * @return
	 */
	@PostMapping("update")
	@ResponseBody
	public AjaxVO customerUpdate(TbCrmCustomer customer){
		if(customerService.ByIdUpdate(customer)<1){
			return new AjaxVO().setErrorCode("400001").setErrorMsg("修改失败");
		}
		return new AjaxVO().setErrorCode("4000000");
	}
	/**
	 * 客户领取功能
	 * @param id
	 * @param userid
	 * @return
	 */
	@PostMapping("assign")
	@ResponseBody
	public AjaxVO  clientAssign(String id, String  userid){
		TbCrmCustomer record=new TbCrmCustomer();
		record.setCustomerid(id);
		record.setOwneruserid(userid);
		if(customerService.ByIdUpdate(record)<1){
			return new AjaxVO().setErrorCode("400001").setErrorMsg("领取失败");
		}
		return new AjaxVO().setErrorCode("400000");
	}
	/**
	 * 客户分配功能
	 * @param customerid
	 * @return
	 */
	@GetMapping("allocation/{customerid}")
	public ModelAndView clientAllocation(@PathVariable("customerid")String customerid){
		List<TbSystemUser>userlist=userService.findAll();
		CustomerUserNameVO customer=customerService.ByIdUsername(customerid);
		return new ModelAndView("customer/allocation","customer",customer).addObject("userlist", userlist);
	}
	
	/**
	 * 客户分配功能
	 * @param customerid
	 * @return
	 */
	@PostMapping("allocation")
	@ResponseBody
	public AjaxVO clientSave(String id,String userid){
		TbCrmCustomer record=new TbCrmCustomer();
		record.setCustomerid(id);
		record.setOwneruserid(userid);
		if(customerService.ByIdUpdate(record)<1){
			return new AjaxVO().setErrorCode("400001").setErrorMsg("分配失败");
		}
		return new AjaxVO().setErrorCode("400000");
	}
	/**
	 * 跳转添加客户页面
	 * @return
	 */
	@GetMapping("save")
	public ModelAndView clientSaveUI(){
		return new ModelAndView("customer/save");
	}
	/**
	 * 添加客户功能
	 * @param customer
	 * @return
	 */
	@PostMapping("save")
	@ResponseBody
	public AjaxVO clientSave(TbCrmCustomer customer){
		if(customerService.CustomerSave(customer)<0){
			return new AjaxVO().setErrorCode("400001").setErrorMsg("添加失败");
		}
		return new AjaxVO().setErrorCode("400000");
	}
}
