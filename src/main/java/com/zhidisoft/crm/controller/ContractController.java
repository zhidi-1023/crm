package com.zhidisoft.crm.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
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
import com.zhidisoft.crm.entity.TbCrmContract;
import com.zhidisoft.crm.service.TbCrmBusinessService;
import com.zhidisoft.crm.service.TbCrmContractService;
import com.zhidisoft.crm.service.TbSystemUserService;
import com.zhidisoft.crm.vo.ContractVO;
import com.zhidisoft.crm.vo.PageVO;

@Controller
@RequestMapping("contract")
public class ContractController {
	@Autowired
	TbCrmContractService contractService;
	@Autowired
	TbSystemUserService userService;
	@Autowired
	TbCrmBusinessService businessService;

	/**
	 * 添加数据
	 */
	@GetMapping("save")
	public ModelAndView saveUI() {
		 
		// 添加合同中的商机来源
		List<TbCrmBusiness> business = businessService.All();
		ModelAndView model = new ModelAndView();
		 
		model.addObject("business", business);
		model.addObject("method", "save");
		model.setViewName("contract/form");
		return model;
	}

	@PostMapping("save")
	public ModelAndView save(TbCrmContract contract, Errors result,HttpSession session) {
		if (result.hasErrors()) {
			return new ModelAndView("contract/form", "errorMsg", result.getAllErrors().get(0).getDefaultMessage());
		}
		
 		/*contract.setOwneruserid(session.getAttribute("userId").toString());*/
		contractService.insert(contract);
		return new ModelAndView("redirect:/contract/listPage");
	}
	@GetMapping("form/{id}")
	public ModelAndView form(@PathVariable("id") String  businessid){
		 
		ContractVO contractvo= contractService.form(businessid);
		System.out.println(contractvo.getContName());
	      ModelAndView model = new ModelAndView();
		 
	return model.addObject("contractvo", contractvo);
		
	}

	/**
	 * 删除数据
	 */
	@DeleteMapping("deleteId/{id}")
	@ResponseBody
	public String delete(@PathVariable("id") String contractid) {
		contractService.delete(contractid);
		return "success";

	}
	@DeleteMapping("deleteAll")
	@ResponseBody
	public String deleteAll(@RequestBody String ids){
		String[] idArr=ids.split(",");
		contractService.deleteByIds(idArr);
		return "/user/listPage";
	}

	/**
	 * 修改数据
	 */
	@GetMapping("update/{id}")
	public ModelAndView updateUI(@PathVariable("id") String contractid) {
		ModelAndView model = new ModelAndView();
		// 添加合同中的商机来源
		model.addObject("business", businessService.All());
		// 确定是修改页面
		model.addObject("method", "update");
		// 查询一条数据
		model.addObject("contract", contractService.findContractById(contractid));
		model.addObject("contractnumber", contractService.findContractById(contractid).getContractnumber());
		// 查询所有的用户名
	/*	model.addObject("userList", userService.findAll());*/
		// 修改跳转的页面
		model.setViewName("contract/update");
		return model;
	}
	@PostMapping("update/{id}")
	public ModelAndView update(@PathVariable("id")String contractid, TbCrmContract contract) {
	 
		contract.setContractid(contractid);
		contractService.update(contract);
		return new ModelAndView("redirect:/contract/listPage");
	}
	/**
	 * 分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param searchText
	 * @return
	 */
	@GetMapping("listPage")
	public ModelAndView listPage(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, String searchText) {
		List<ContractVO> contractVO = contractService.listPage(pageNum, pageSize, searchText);
		PageVO<ContractVO> page = new PageVO<>();
		page.setList(contractVO);
		page.setPageNum(pageNum);
		page.setPageSize(pageSize);
		page.setTotalCount(contractService.count(searchText));
		return new ModelAndView("contract/listPage", "page", page);
	}
}
