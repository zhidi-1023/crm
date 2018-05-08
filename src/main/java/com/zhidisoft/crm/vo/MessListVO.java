package com.zhidisoft.crm.vo;

import java.util.Date;

import com.zhidisoft.crm.entity.TbCrmMessage;


public class MessListVO {

	private String messageid;
	private String content;
	private Date readtime;
	private Date sendtime;
	private String username;
	private String fromuserid;
	private String touserid;
	
	
public String getTouserid() {
		return touserid;
	}


	public void setTouserid(String touserid) {
		this.touserid = touserid;
	}


public String getMessageid() {
		return messageid;
	}


	public void setMessageid(String messageid) {
		this.messageid = messageid;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Date getReadtime() {
		return readtime;
	}


	public void setReadtime(Date readtime) {
		this.readtime = readtime;
	}


	public Date getSendtime() {
		return sendtime;
	}


	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	public String getFromuserid() {
		return fromuserid;
	}


	public void setFromuserid(String fromuserid) {
		this.fromuserid = fromuserid;
	}


	public TbCrmMessage toMess(){
		TbCrmMessage mes=new TbCrmMessage();
		mes.setContent(content);
		mes.setReadtime(readtime);
		mes.setSendtime(sendtime);
		mes.setFromuserid(fromuserid);
		mes.setTouserid(touserid);
		return mes;
	}
}
