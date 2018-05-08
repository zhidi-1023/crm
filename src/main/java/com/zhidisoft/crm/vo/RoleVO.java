package com.zhidisoft.crm.vo;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

import com.zhidisoft.crm.entity.TbSystemRole;

public class RoleVO {

	@NotEmpty(message = "角色名不能为空")
	private String rolename;
	private String rolenote;
	private Date createtime;

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getRolenote() {
		return rolenote;
	}

	public void setRolenote(String rolenote) {
		this.rolenote = rolenote;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public TbSystemRole toRole() {
		TbSystemRole role = new TbSystemRole();
		role.setRolename(rolename);
		role.setRolenote(rolenote);
		role.setCreatetime(createtime);
		return role;
	}

}
