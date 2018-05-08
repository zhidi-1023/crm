package com.zhidisoft.crm.vo;

import javax.validation.constraints.NotEmpty;
import com.zhidisoft.crm.entity.TbCrmLeads;

public class LeadsVO extends TbCrmLeads{
	
	private String username;
	@NotEmpty(message = "公司名不能为空")
	private String name;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
