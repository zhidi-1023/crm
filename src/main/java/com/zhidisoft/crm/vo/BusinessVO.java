package com.zhidisoft.crm.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.zhidisoft.crm.entity.TbCrmBusiness;

public class BusinessVO {
	private String name;//商机名
	private String owneruserid;//负责人
	private Date createtime;//创建时间
	private String customerid;//客户
	private BigDecimal totalprice;//商机金额
	private String contactsid;//联系人
	private String type;//上积类型
	private String statusid;//状态
	private String origin;//商机来源
	private Short gainrate;//赢单率
	private Long estimateprice;//预成交价
	private Date nextsteptime;//下次联系时间
	private String nextstep;//下次联系内容
	private String contractaddress;//地址
	
	public String getContractaddress() {
		return contractaddress;
	}
	public void setContractaddress(String contractaddress) {
		this.contractaddress = contractaddress;
	}
	private String description;//备注
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwneruserid() {
		return owneruserid;
	}
	public void setOwneruserid(String owneruserid) {
		this.owneruserid = owneruserid;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public BigDecimal getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(BigDecimal totalprice) {
		this.totalprice = totalprice;
	}
	public String getContactsid() {
		return contactsid;
	}
	public void setContactsid(String contactsid) {
		this.contactsid = contactsid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatusid() {
		return statusid;
	}
	public void setStatusid(String statusid) {
		this.statusid = statusid;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Short getGainrate() {
		return gainrate;
	}
	public void setGainrate(Short gainrate) {
		this.gainrate = gainrate;
	}
	public Long getEstimateprice() {
		return estimateprice;
	}
	public void setEstimateprice(Long estimateprice) {
		this.estimateprice = estimateprice;
	}
	public Date getNextsteptime() {
		return nextsteptime;
	}
	public void setNextsteptime(Date nextsteptime) {
		this.nextsteptime = nextsteptime;
	}
	public String getNextstep() {
		return nextstep;
	}
	public void setNextstep(String nextstep) {
		this.nextstep = nextstep;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public TbCrmBusiness tobusiness(){
		TbCrmBusiness business=new TbCrmBusiness();
		business.setName(name);//商机名
		business.setOwneruserid(owneruserid);//负责人
		business.setCreatetime(createtime);//创建时间
		business.setCustomerid(customerid);//客户
		business.setTotalprice(totalprice);//商机金额
		business.setContactsid(contactsid);//联系人
		business.setType(type);//上积类型
		business.setStatusid(statusid);//状态
		business.setOrigin(origin);//商机来源
		business.setGainrate(gainrate);//赢单率
		business.setEstimateprice(estimateprice);//预成交价
		business.setNextsteptime(nextsteptime);//下次联系时间
		business.setContractaddress(contractaddress);//地址
		business.setNextstep(nextstep);//下次联系内容
		business.setDescription(description);//备注
		return  business;
	}
	
}
