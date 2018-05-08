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
	//客户功能区域
	/**
	 * 分页展示数据
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param searchText
	 * @return
	 */
	@GetMapping("listPage")
	public ModelAndView listPage(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, String searchText) {
		ModelAndView mav = new ModelAndView("customer/listPage", "customerList",
				CustomerService.findPage(pageNum, pageSize, searchText));
		mav.addObject("searchText", searchText);
		return mav;
	}

	/**
	 * 跳转保存页面
	 * 
	 * @param tbCrmCustomer
	 * @return
	 */
	@GetMapping("save")
	public ModelAndView toSavePage(TbCrmCustomer tbCrmCustomer) {
		return new ModelAndView("customer/form", "method", "save");
	}

	/**
	 * 添加数据
	 * 
	 * @param customerVO
	 * @param result
	 * @return
	 */
	@PostMapping("save")
	public ModelAndView save(@Valid CustomerFromVO customerVO, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("customer/form", "errorMsg", result.getAllErrors().get(0).getDefaultMessage());
		}
		TbCrmCustomer crmCustomer = customerVO.toCustomer();
		CustomerService.save(crmCustomer);
		return new ModelAndView("redirect:/customer/listPage");
	}

	/**
	 * 批量删除
	 * 
	 * @param ids
	 * @return
	 */
	@DeleteMapping("delete")
	@ResponseBody
	public String deleteByIds(@RequestBody String ids) {
		String[] idsArr = ids.split(",");
		CustomerService.deleteByIds(idsArr);
		return "success";
	}

	/**
	 * 修改
	 * @param customerId
	 * @param NMAE
	 * @return
	 */
	@PostMapping("updates/{id}")
	public ModelAndView update(@PathVariable("id")String CUSTOMERID,String NAME){
		TbCrmCustomer customer = new TbCrmCustomer();
		customer.setCustomerid(CUSTOMERID);
		customer.setName(NAME);
		CustomerService.update(customer);
		return new ModelAndView("redirect:/customer/listPage");
	}
	
	/**
	 * 查看数据
	 * @param customerId
	 * @return
	 */
	@GetMapping("lists/{id}")
	public ModelAndView ToPagelist(@PathVariable("id") String customerId) {
		return new ModelAndView("customer/lists", "customerlist", CustomerService.findById(customerId));
	}

}
