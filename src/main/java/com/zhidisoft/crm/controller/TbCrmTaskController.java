package com.zhidisoft.crm.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.zhidisoft.crm.entity.TbCrmTask;

import com.zhidisoft.crm.service.TbCrmTaskService;
import com.zhidisoft.crm.vo.TaskVO;



@Controller
@RequestMapping("task")
public class TbCrmTaskController {
     @Autowired
     TbCrmTaskService crmTaskService;
     
     
     /**
      * 任务模糊查询
      * @param pageNum
      * @param pageSize
      * @param searchText
      * @return
      */
     @GetMapping("/index")
     public ModelAndView listPage(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
 									@RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, String searchText ,
 									@RequestParam(name = "date1", defaultValue = "") String date1,String status,String where1,
 									@RequestParam(name = "username", defaultValue = "")String username) {
 		ModelAndView mav = new ModelAndView("task/index", "taskPage",
 				crmTaskService.findPage(pageNum, pageSize, searchText,status,date1,where1,username));
 		mav.addObject("searchText", searchText);
 		return mav;
 	}
     /**
      * 
      * @param pageNum
      * @param pageSize
      * @param searchText
      * @return
      */
       @GetMapping("/list")
     public ModelAndView list(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
				                     @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, String searchText) {
 		                ModelAndView mav = new ModelAndView("task/list", "taskPage",
 		                		crmTaskService.listPage(pageNum, pageSize, searchText));
 		               mav.addObject("searchText", searchText);
 		return mav;
 	}
     /**
      * 任务添加
      * @return
      */
     @GetMapping("/save")
     public ModelAndView saveUI(){
    	 
		return new ModelAndView("task/form", "method", "save");
    	 
     }
 
     @PostMapping("save")
 	public ModelAndView save(@Valid TaskVO taskVO,BindingResult result){
 		if (result.hasErrors()) {
 			return new ModelAndView("task/form", "errorMsg", result.getAllErrors().get(0).getDefaultMessage());
 		}
 		TbCrmTask task = taskVO.totask();
 				crmTaskService.save(task);
 		
 		return new ModelAndView("redirect:/task/index"); 
 	}
     /**
      * 任务修改
      * 跳转
      * @param Id
      * @return
      */
     @GetMapping("update/{id}")
 	public ModelAndView updateUI(@PathVariable("id") String Id) {
 		return new ModelAndView("task/form", "task", crmTaskService.findById(Id)).addObject("method", "update");
 	}
 	/**
 	 * 
 	 * 
 	 * @param userId
 	 * @param username
 	 * @return
 	 */
 	@PostMapping("update/{id}")
 	public ModelAndView update(@PathVariable("id") String id,@Valid TaskVO taskVO) {
 		TbCrmTask task = taskVO.totask();
 		task.setTaskid(id);
 		crmTaskService.update(task);
 		return new ModelAndView("redirect:/task/index");
 	}
 	/**
 	 * 删除
 	 * @param id
 	 * @return
 	 */
 	@DeleteMapping("delete/{id}")
	@ResponseBody
	public String delete(@PathVariable("id") String id){
 		crmTaskService.deleteById(id);
		return "/task/index";
 	}
 	@GetMapping("distribution")
 	public String distribution(){
		return "/task/Distribution";
 		
 	}
}
