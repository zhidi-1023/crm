package com.zhidisoft.crm.vo;

import java.util.Date;

import com.zhidisoft.crm.entity.TbCrmTask;


public class TaskVO {
	private String taskid;
      private String subject;
      private String owneruserid;
      private String aboutUser;
      /*private String subject;*/
      private String status;
      private String priority;
      private Date duedate;
      private byte[] description;
	 
	public String getTaskid() {
		return taskid;
	}

	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getOwneruserid() {
		return owneruserid;
	}

	public void setOwneruserid(String owneruserid) {
		this.owneruserid = owneruserid;
	}

	public String getAboutUser() {
		return aboutUser;
	}

	public void setAboutUser(String aboutUser) {
		this.aboutUser = aboutUser;
	}

	

	public String getStatus() {
		if(status=="not_start"){
			status="未启动";
		}
		return status;
	}

	public void setStatus(String status) {
		if(status=="not_start"){
			status="未启动";
		}
		this.status = status;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public Date getDuedate() {
		return duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	public byte[] getDescription() {
		return description;
	}

	public void setDescription(byte[] description) {
		this.description = description;
	}

	public TbCrmTask totask() {
		TbCrmTask task = new TbCrmTask();
		task.setTaskid(taskid);
		task.setSubject(subject);
		task.setOwneruserid(owneruserid);
		task.setAboutUser(aboutUser);;
		task.setStatus(status);
		task.setPriority(priority);
	    task.setDuedate(duedate);;
	   task.setDescription(description);
	    
		
		return task;
	}
}
