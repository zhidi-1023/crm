package com.zhidisoft.crm.vo;

import java.util.Date;

import com.zhidisoft.crm.entity.TbCrmLeadsPool;

public class LeadsPoolVO {
	private String name;
	private String source;
	private String contactsName;
	private String position;
	private String saltName;
	private String mobile;
	private String email;
	private String address;
	private String nextStep;
	private Date nextStepTime;
	private String leadNote;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getContactsName() {
		return contactsName;
	}
	public void setContactsName(String contactsName) {
		this.contactsName = contactsName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getSaltName() {
		return saltName;
	}
	public void setSaltName(String saltName) {
		this.saltName = saltName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getNextStepTime() {
		return nextStepTime;
	}
	public void setNextStepTime(Date nextStepTime) {
		this.nextStepTime = nextStepTime;
	}
	public String getNextStep() {
		return nextStep;
	}
	public void setNextStep(String nextStep) {
		this.nextStep = nextStep;
	}
	public String getLeadNote() {
		return leadNote;
	}
	public void setLeadNote(String leadNote) {
		this.leadNote = leadNote;
	}
	
	public TbCrmLeadsPool toLeads(){
		TbCrmLeadsPool leads=new TbCrmLeadsPool();
		leads.setName(name);
		leads.setSource(source);
		leads.setContactsname(contactsName);
		leads.setPosition(position);
		leads.setSaltname(saltName);
		leads.setMobile(mobile);
		leads.setEmail(email);
		leads.setAddress(address);
		leads.setNextsteptime(new Date());
		leads.setNextstep(nextStep);
		leads.setLeadnote(leadNote);
		return leads;
	}
}
