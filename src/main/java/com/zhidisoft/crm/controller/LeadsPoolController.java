package com.zhidisoft.crm.controller;


import java.util.List;

import javax.servlet.http.HttpSession;
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

import com.zhidisoft.crm.entity.TbCrmLeadsPool;
import com.zhidisoft.crm.entity.TbSystemUser;
import com.zhidisoft.crm.service.TbCrmLeadsPoolService;
import com.zhidisoft.crm.service.TbSystemUserService;
import com.zhidisoft.crm.vo.TbCrmLeadsPoolVO;

@Controller
@RequestMapping("lead")
public class LeadsPoolController {
	@Autowired
	TbCrmLeadsPoolService crmLeadsService;
	@Autowired
	TbSystemUserService userService;

	@GetMapping("listPage")
	public ModelAndView Leads(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, String searchText) {
		ModelAndView mav = new ModelAndView("leads/listPage", "leadsPage",
				crmLeadsService.findPage(pageNum, pageSize, searchText));
		mav.addObject("searchText", searchText);
		return mav;
	}

	/**
	 * url访问修改页面
	 * 
	 * @return
	 */
	@GetMapping("update/{id}")
	public ModelAndView updateUI(@PathVariable("id") String leadsId) {
		List<TbSystemUser> userlist=userService.findAll();
		return new ModelAndView("leads/form", "leads", crmLeadsService.findLeadsByLeadsId(leadsId)).addObject("method",
				"update").addObject("userlist", userlist);
	}
	/**
	 * 线索详情
	 * @param leadsId
	 * @return
	 */
	@GetMapping("info/{id}")
	public ModelAndView infoUI(@PathVariable("id") String leadsId) {
		List<TbSystemUser> userlist=userService.findAll();
		return new ModelAndView("leads/leadsInfo", "leads", crmLeadsService.findLeadsByLeadsId(leadsId)).addObject("method",
				"update").addObject("userlist", userlist);
	}
	@PostMapping("info/{id}")
	public ModelAndView info(@PathVariable("id") String leadsId){
		return new ModelAndView("redirect:/lead/listPage");
	}
	/**
	 * 在页面中修改
	 * @param leadsId
	 * @param leadsVO
	 * @return
	 */
	@PostMapping("update/{id}")
	public ModelAndView update(@PathVariable("id") String leadsId, @Valid TbCrmLeadsPool leadsVO) {
		//TbCrmLeads leads=leadsVO.toLeads();
		//leads.setLeadsid(leadsId);
		crmLeadsService.update(leadsId,leadsVO);
		return new ModelAndView("redirect:/lead/listPage");
	}
	/**
	 * url访问增加
	 * @return
	 */
	@GetMapping("save")
	public ModelAndView saveUI(){
		List<TbSystemUser> userlist=userService.findAll();
		return new ModelAndView("leads/save","method","save").addObject("userlist", userlist);
	}
	/**
	 * 表单中的增加
	 * @param leadsVO
	 * @param result
	 * @return
	 */
	@PostMapping("save")
	public ModelAndView save(@Valid TbCrmLeadsPoolVO leadsVO,BindingResult result,HttpSession session){
		if(result.hasErrors()){
			return new ModelAndView("leads/form","errorMsg",result.getAllErrors().get(0).getDefaultMessage());
		}
		TbSystemUser dbUser = (TbSystemUser)session.getAttribute("dbUser");
		leadsVO.setCreatoruserid(dbUser.getId());
		leadsVO.setOwneruserid("null");
		crmLeadsService.save(leadsVO);
		return new ModelAndView("redirect:/lead/listPage");
	}
	/**
	 * 新增线索页面放入线索池
	 * @param leadsVO
	 * @param username
	 */
	@PostMapping("putLeadsPoor")
	@ResponseBody
	public ModelAndView put(@Valid TbCrmLeadsPoolVO leadsVO,HttpSession session){
		TbSystemUser dbUser = (TbSystemUser)session.getAttribute("dbUser");
		leadsVO.setCreatoruserid(dbUser.getId());
		leadsVO.setOwneruserid("null");
		crmLeadsService.save(leadsVO);
		return new ModelAndView("redirect:/lead/listPage");
	}
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@DeleteMapping("deleteAll")
	@ResponseBody
	public String deleteAll(@RequestBody String ids){
		String[] idsArr=ids.split(",");
		crmLeadsService.deleteByIds(idsArr);
		return "success";
	}
	/**
	 * 线索领取功能
	 * @param id
	 * @param userid
	 * @return
	 */
	@PostMapping("assign")
	@ResponseBody
	public String  assign(String id, String  userid){
		TbCrmLeadsPool leads=new TbCrmLeadsPool();
		leads.setLeadsid(id);
		leads.setOwneruserid(userid);
		crmLeadsService.ByIdUpdate(leads);
		return "success";
	}
	/**
	 * 线索分配,跳转到分配页面
	 * @param leadsId
	 * @return
	 */
	@GetMapping("allocation/{leadsId}")
	public ModelAndView allocationUI( @PathVariable("leadsId") String leadsId){
		List<TbSystemUser> userlist=userService.findAll();
		TbCrmLeadsPool leads=crmLeadsService.findLeadsByLeadsId(leadsId);
		return new ModelAndView("leads/allocation","leads",leads).addObject("userlist", userlist);
	}
	/**
	 * 在分配页面给用户分配线索
	 * @param id
	 * @param userid
	 * @return
	 */
	@PostMapping("allocation/{leadsId}")
	@ResponseBody
	public ModelAndView  allocation(@PathVariable("leadsId")String id, String  userid){
		TbCrmLeadsPool leads=new TbCrmLeadsPool();
		leads.setLeadsid(id);
		leads.setOwneruserid(userid);
		crmLeadsService.update(id,leads);
		return new ModelAndView("redirect:/lead/listPage");
	}
}
