package com.zhidisoft.crm.vo;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

import com.zhidisoft.crm.entity.TbSystemRole;

public class RoleFormVO {
	@NotEmpty(message = "用户名不能为空")
	private String rolename;
	private String rolenote;
	private Date createtime;
	private Date addDate1;

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	

	

	

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getAddDate1() {
		return addDate1;
	}

	public void setAddDate1(Date addDate1) {
		this.addDate1 = addDate1;
	}

	public String getRolenote() {
		return rolenote;
	}

	public void setRolenote(String rolenote) {
		this.rolenote = rolenote;
	}

	public TbSystemRole toRole() {
		TbSystemRole role = new TbSystemRole();
		role.setRolenote(rolenote);
		role.setRolename(rolename);
		role.setCreatetime(createtime);
		return role;

	}
}
