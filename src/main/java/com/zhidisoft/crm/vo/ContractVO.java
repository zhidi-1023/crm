package com.zhidisoft.crm.vo;

import com.zhidisoft.crm.entity.TbCrmContract;

public class ContractVO extends TbCrmContract{
	private String name;
	private String   contactsname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactsname() {
		return contactsname;
	}
	public void setContactsname(String contactsname) {
		this.contactsname = contactsname;
	}
	 
	 
	
}
