package com.zhidisoft.crm.vo;


import com.zhidisoft.crm.entity.TbCrmTask;

public class TbCrmTaskVO extends TbCrmTask {

	private String username;
	private String status;
	private String priority;
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		if(priority.equals("0")){
			priority="低";
			this.priority = priority;
		}else if(priority.equals("1")){
			priority="普通";
			this.priority = priority;
		}else if(priority.equals("2")){
			priority="高";
			this.priority = priority;
		}
		
	}

	public String getStatus() {
	
		return status;
	}

	public void setStatus(String status) {
		
		if (status.equals("not_start")) {
			status = "未启动";
			
			
			
			this.status = status;
		} else if (status.equals("delay")) {

			status = "推迟";
			
		
			this.status = status;
		} else if (status.equals("running")) {

			status = "进行中";
			
			this.status = status;
		} else if (status.equals("finished")) {

			status = "已完成";
		
			this.status = status;
		} else if (status.equals("closed")) {

			status = "关闭的";
			
			
			this.status = status;
		}
		}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
