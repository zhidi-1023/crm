package com.zhidisoft.crm.vo;

import java.util.Date;
import javax.validation.constraints.NotEmpty;
import com.zhidisoft.crm.entity.TbSystemUser;

public class UserVO {
	
	@NotEmpty(message = "用户名不能为空")
	private String username;
	@NotEmpty(message = "密码不能为空")
	private String password;
	private String email;
	private String phone;
	private String usernote;
	private Date   createtime;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsernote() {
		return usernote;
	}
	public void setUsernote(String usernote) {
		this.usernote = usernote;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public TbSystemUser toUser(){
		TbSystemUser user = new TbSystemUser();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		user.setPhone(phone);
		user.setCreatetime(createtime);
		user.setUsernote(usernote);
		return user;
	}

}
