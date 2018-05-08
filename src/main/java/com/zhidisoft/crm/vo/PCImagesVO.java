package com.zhidisoft.crm.vo;

import com.zhidisoft.crm.entity.TbCrmProduct;

public class PCImagesVO extends TbCrmProduct{
//	private  String productName;
	private  String cname;
	private  String username;
//	private String productid;
//	private String costprice;
	
	
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
