package com.zhidisoft.crm.vo;

import javax.validation.constraints.NotEmpty;

import com.zhidisoft.crm.entity.TbSystemUser;

public class UserFormVO {
	@NotEmpty(message = "用户名不能为空")
	private String username;
	private String password;
	private String password1;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public TbSystemUser toUser() {
		TbSystemUser user = new TbSystemUser();
		user.setUsername(username);
		user.setPassword(password);
		return user;

	}
}
