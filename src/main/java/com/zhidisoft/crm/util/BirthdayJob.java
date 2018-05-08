package com.zhidisoft.crm.util;

import java.util.Map;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import com.yunpian.sdk.YunpianClient;
import com.yunpian.sdk.model.Result;
import com.yunpian.sdk.model.SmsSingleSend;

public class BirthdayJob {

	@Autowired
	YunpianClient clnt;

	public void send() {
		Map<String, String> param = clnt.newParam(2);
		param.put(YunpianClient.MOBILE, "13523092673");
		param.put(YunpianClient.TEXT, "【蓝蓝的海】您的验证码是1234");
		Result<SmsSingleSend> r = clnt.sms().single_send(param);
		System.out.println(r);
	}

}
