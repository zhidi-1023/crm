package com.zhidisoft.crm.vo;

import javax.validation.constraints.NotEmpty;

import com.zhidisoft.crm.entity.TbSystemFunction;

public class FunctionVO {
	@NotEmpty(message = "菜单权限不能为空")
	 private String funccode;
	@NotEmpty(message = "菜单名不能为空")
	 private String funcname;
	 private Long functype;
	 private String funcnote;
	 private String funcurl;
	public String getFunccode() {
		return funccode;
	}
	public void setFunccode(String funccode) {
		this.funccode = funccode;
	}
	public String getFuncname() {
		return funcname;
	}
	public void setFuncname(String funcname) {
		this.funcname = funcname;
	}
	
	
	public Long getFunctype() {
		return functype;
	}
	public void setFunctype(Long functype) {
		this.functype = functype;
	}
	public String getFuncnote() {
		return funcnote;
	}
	public void setFuncnote(String funcnote) {
		this.funcnote = funcnote;
	}
	public String getFuncurl() {
		return funcurl;
	}
	public void setFuncurl(String funcurl) {
		this.funcurl = funcurl;
	}
	public TbSystemFunction toFunction() {
		TbSystemFunction function = new TbSystemFunction();
		function.setFuncname(funcname);
		function.setFunccode(funccode);
		function.setFuncnote(funcnote);
		function.setFunctype(functype);
		function.setFuncurl(funcurl);
		return function;

	}
}
