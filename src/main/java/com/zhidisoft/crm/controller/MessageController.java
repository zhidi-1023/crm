package com.zhidisoft.crm.controller;

import java.util.Date;

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

import com.zhidisoft.crm.entity.TbCrmMessage;
import com.zhidisoft.crm.service.TbCrmMessageService;
import com.zhidisoft.crm.service.TbSystemUserService;
import com.zhidisoft.crm.vo.MessVO;

@Controller
@RequestMapping("message")
public class MessageController {

	@Autowired
	TbCrmMessageService messageService;
	@Autowired
	TbSystemUserService userService;
	
	@GetMapping("/list")
	public ModelAndView list(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, String searchText) {
		
		ModelAndView mav = new ModelAndView("message/listPage", "messageList", messageService.findPage(pageNum, pageSize, searchText))
				.addObject("users",userService.findAll());
		mav.addObject("searchText", searchText);
		return mav;
	}

	
	@GetMapping("save")
	public ModelAndView saveUI(){
		return new ModelAndView("message/form","method","save").addObject("users",userService.findAll());
	}
	
	@PostMapping("save")
	public ModelAndView save(@Valid MessVO messVO,BindingResult result){
		if(result.hasErrors()){
			return new ModelAndView("message/form","errorMsg",result.getAllErrors().get(0).getDefaultMessage())
					.addObject("method", "save").addObject("users", userService.findAll());
		}
		TbCrmMessage message = messVO.toMess();
		message.setStatus((short)1);//"1":已发送"2"已读
		messageService.save(message);
		return new ModelAndView("redirect:/message/list");
	}
	@DeleteMapping("delete/{id}")
	@ResponseBody
	public String delete(@PathVariable("id")String id){
		messageService.deleteById(id);
		return "success";
	}
	@DeleteMapping("deleteAll")
	@ResponseBody
	public String deleteAll(@RequestBody String ids){
		String[] idArr = ids.split(",");
		messageService.deleteByIds(idArr);
		return "success";
	}
	@GetMapping("update/{id}")
	public ModelAndView updateUI(@PathVariable("id")String id){
		return new ModelAndView("message/form","message",messageService.finduser(id))
				.addObject("method", "update")
				.addObject("users", userService.findAll());
	}
	
	@PostMapping("update/{id}")
	public ModelAndView update(@PathVariable("id")String id,@Valid MessVO messVO,BindingResult result,
			String content,String fromuserid,String touserid ,Date readtime,Date sendtime){
		if(result.hasErrors()){
			return new ModelAndView("message/form","errorMsg",result.getAllErrors().get(0).getDefaultMessage())
					.addObject("method", "update").addObject("message",messageService.findMessById(id));
		}
		TbCrmMessage message = messVO.toMess();
		message.setStatus((short)1);//"1":已发送"2"已读
		message.setMessageid(id);
		message.setContent(content);
		message.setFromuserid(fromuserid);
		message.setTouserid(touserid);
		message.setReadtime(readtime);
		message.setSendtime(sendtime);
		messageService.update(message);
		
		return new ModelAndView("redirect:/message/list");
	}
	
}
