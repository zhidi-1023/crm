package com.zhidisoft.crm.controller;

import java.io.IOException;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;

@Controller
@RequestMapping("demoload")
public class WebUploaderController {
	
	@Autowired
	OSSClient ossclient;
	
	@GetMapping("into")
	public ModelAndView into(){
		return new ModelAndView("common/upload");
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
		ossclient.putObject("crm-chang", filename, file.getInputStream());
		return filename;
	}

}
