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
import com.zhidisoft.crm.entity.TbSystemFunction;
import com.zhidisoft.crm.service.TbSystemFunctionService;
import com.zhidisoft.crm.vo.FuncVO;

@Controller
@RequestMapping("func")
public class SystemFunctionController {
	
	@Autowired
	TbSystemFunctionService functionService;
	
	@GetMapping("list")
	public ModelAndView list(@RequestParam(name = "pageNum",defaultValue = "1")Integer pageNum,
			@RequestParam(name = "pageSize",defaultValue = "10")Integer pageSize,String searchText){
		ModelAndView mav = new ModelAndView("system/funclist","funcPage",functionService.findFunctionsByPage(pageNum,pageSize,searchText));
		mav.addObject("searchText",searchText);
		return mav;		
	}
	
	@GetMapping("save")
	public ModelAndView save(){
		return new ModelAndView("system/funcform","method","save");
	}
	
	@PostMapping("save")
	public ModelAndView save(@Valid FuncVO funcCVO,BindingResult result){
		if (result.hasErrors()) {
			return new ModelAndView("system/funcform","errorMsg",result.getAllErrors().get(0).getDefaultMessage());
		}
		TbSystemFunction function = funcCVO.toFunction();
		functionService.save(function);
		return new ModelAndView("redirect:/func/list");
	}
	@GetMapping("update/{id}")
	public ModelAndView update(@PathVariable("id")String id){
		return new ModelAndView("system/funcform","func",functionService.selectById(id)).addObject("method","update");
	}
	
	@PostMapping("update/{id}")
	public ModelAndView update(@PathVariable("id")String id,@Valid FuncVO funcVO){
		TbSystemFunction function = funcVO.toFunction();
		function.setId(id);
		function.setUpdatetime(new Date());
		functionService.update(function);
		return new ModelAndView("redirect:/func/list");
	}
	@GetMapping("delete/{id}")
	public ModelAndView delete(@PathVariable("id")String id){
		functionService.delete(id);
		return new ModelAndView("redirect:/func/list");
	}
	
	@DeleteMapping("deleteAll")
	@ResponseBody
	public String deleteAll(@RequestBody String idsStr){
		String [] ids = idsStr.split(",");
		functionService.deleteByIds(ids);
		return "success";	
	}

}
