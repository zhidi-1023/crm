package com.zhidisoft.crm.vo;



import com.zhidisoft.crm.entity.TbCrmTask;

public class TaskStatusVO extends TbCrmTask{
	private String username;
	private int allcount;
	private int not_start;
	private int delays;
	private int running;
	private int finished;
	private int closed;

	public int getDelays() {
		return delays;
	}
	public void setDelays(int delays) {
		this.delays = delays;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAllcount() {
		return allcount;
	}
	public void setAllcount(int allcount) {
		this.allcount = allcount;
	}
	public int getNot_start() {
		return not_start;
	}
	public void setNot_start(int not_start) {
		this.not_start = not_start;
	}
	
	public int getRunning() {
		return running;
	}
	public void setRunning(int running) {
		this.running = running;
	}
	public int getFinished() {
		return finished;
	}
	public void setFinished(int finished) {
		this.finished = finished;
	}
	public int getClosed() {
		return closed;
	}
	public void setClosed(int closed) {
		this.closed = closed;
	}
	
}
