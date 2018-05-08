package com.zhidisoft.crm.vo;

public class AjaxVO {
	private String errorCode;
	private String errorMsg;
	private Object data;

	public String getErrorCode() {
		return errorCode;
	}

	public AjaxVO setErrorCode(String errorCode) {
		this.errorCode = errorCode;
		return this;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public AjaxVO setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
		return this;
	}

	public Object getData() {
		return data;
	}

	public AjaxVO setData(Object data) {
		this.data = data;
		return this;
	}

}
