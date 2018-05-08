package com.zhidisoft.crm.controller;

import java.io.IOException;
import java.util.UUID;

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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.zhidisoft.crm.entity.TbCrmProduct;
import com.zhidisoft.crm.service.TbCrmProductCategoryService;
import com.zhidisoft.crm.service.TbCrmProductService;
import com.zhidisoft.crm.service.TbSystemUserService;
import com.zhidisoft.crm.vo.ProductFormVO;

@Controller
@RequestMapping("product")
public class ProductController {
	/**
	 * 产品表
	 */
	@Autowired
	TbCrmProductService productService;
	/**
	 * 产品工具表
	 */
	@Autowired
	TbCrmProductCategoryService   categoryService;
	@Autowired
	TbSystemUserService    userService;
	
	@Autowired
	OSSClient  ossclient;
	
	/**
	 * 分页查询
	 * @param pageNum	
	 * @param pageSize
	 * @param searchText
	 * @param where1
	 * @return
	 */
	@GetMapping("/list")
	public ModelAndView list(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, String searchText,
			
			@RequestParam(name="where1",defaultValue="") String where1) {
		ModelAndView mav = new ModelAndView("product/list", "productList",
				productService.page(pageNum, pageSize, searchText,where1));
		Long totalCount = productService.count(searchText);
		mav.addObject("totalCount", totalCount);
		mav.addObject("pageNum", pageNum);
		mav.addObject("searchText", searchText);
		if (totalCount % pageSize == 0) {
			mav.addObject("totalPage", totalCount / pageSize);
		} else {
			mav.addObject("totalPage", totalCount / pageSize + 1);
		}

		return mav;

	}

	/**
	 * 跳转页面的方法命名 xxUI xxView xxPage
	 * 
	 * @return
	 */
	@GetMapping("save")
	public ModelAndView saveUI() {
		return new ModelAndView("product/form", "method", "save").addObject("userList", userService.All());
	}

	/**
	 * @Valid 标识我们要验证后面的对象 BindingResult 接受验证的结果 两者样放在一块,顺序不可乱 用户管理添加
	 * @param userVO
	 * @param result
	 * @return
	 */
	@PostMapping("save")
	public ModelAndView save(@Valid ProductFormVO proVO, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("product/form", "errorMsg", result.getAllErrors().get(0).getDefaultMessage());
		}
		TbCrmProduct pro = proVO.toProduct();
		productService.save(pro);
		// 重定向,防止表单重复提交
		return new ModelAndView("redirect:/product/list");

	}
	
	/**
	 * 根据ID删除
	 * 
	 * @param roleid
	 * @return
	 */
	@DeleteMapping("delete/{id}")
	@ResponseBody
	public String delete(@PathVariable("id") String productid) {
		productService.deleteById(productid);
		return "success";

	}
	/**
	 * 根据ID批量删除
	 * 
	 * @param roleid
	 * @return
	 */
	@DeleteMapping("deleteAll")
	@ResponseBody
	public String deleteAll(@RequestBody String ids) {
		String[] idAll = ids.split(",");
		productService.deleteByIds(idAll);
		return "success";

	}
	/**
	 * 根据ID修改
	 * @param productid
	 * @return
	 */
	@GetMapping("update/{id}")
	public ModelAndView updateUI(@PathVariable("id")String productId){
		return new ModelAndView("product/form","product",productService.findById(productId)).addObject("method", "update").addObject("userList", userService.All());
	}
	
	@PostMapping("update/{id}")
	public ModelAndView update(@PathVariable("id") String productId,ProductFormVO proVO){
		TbCrmProduct pro = proVO.toProduct();
		pro.setProductid(productId);
		productService.update(pro);
		return new ModelAndView("redirect:/product/list");
	}
	/**
	 * 根据ID查询单条数据
	 * @param productId
	 * @return
	 */
	@GetMapping("check/{id}")
	public ModelAndView check(@PathVariable("id")String productId){
		return new ModelAndView("product/check","product",productService.findVOById(productId)).addObject("userList", userService.All());
	}
	
	
	@PostMapping("upload")
	@ResponseBody
	public  String  upload(MultipartFile file) throws OSSException, ClientException, IOException {
		//获取文件名
		String uploadName = file.getOriginalFilename();
		//截取文件名后缀
		String ext = uploadName.substring(uploadName.lastIndexOf("."));
		//uuid生成一个随机文件名
		String filename = UUID.randomUUID().toString()+ext;
		//阿里云Bucket名称（crm-oss-1023）文件名（filename）获取文件输入流（file.getInputStream()）
		ossclient.putObject("crm-oss-1023", filename, file.getInputStream());

		return filename;
	}
	
	
	
	
	
	/**
	 * 分页查询
	 * @param pageNum	
	 * @param pageSize
	 * @param searchText
	 * @param where1
	 * @return
	 */
	@GetMapping("/lista")
	public ModelAndView lista(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
			@RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize, String searchText,
			
			@RequestParam(name="where1",defaultValue="") String where1) {
		ModelAndView mav = new ModelAndView("product/lista", "cateLista",
				categoryService.page(pageNum, pageSize, searchText,where1));
		Long totalCount = categoryService.count(searchText);
		mav.addObject("totalCount", totalCount);
		mav.addObject("pageNum", pageNum);
		mav.addObject("searchText", searchText);
		if (totalCount % pageSize == 0) {
			mav.addObject("totalPage", totalCount / pageSize);
		} else {
			mav.addObject("totalPage", totalCount / pageSize + 1);
		}

		return mav;

	}

}
