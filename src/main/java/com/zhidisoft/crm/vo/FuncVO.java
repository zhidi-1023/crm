package com.zhidisoft.crm.vo;

import java.util.Date;
import javax.validation.constraints.NotEmpty;
import com.zhidisoft.crm.entity.TbSystemFunction;

public class FuncVO {
	
	@NotEmpty(message = "方法代号不能为空")
	private String funccode;
	@NotEmpty(message = "方法名不能为空")
	private String funcname;
	private Date createtime;
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
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	public TbSystemFunction toFunction(){
		TbSystemFunction function = new TbSystemFunction();
		function.setCreatetime(createtime);
		function.setFunccode(funccode);
		function.setFuncname(funcname);
		return function;
	}

}
