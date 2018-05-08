package com.zhidisoft.test;

import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yunpian.sdk.YunpianClient;
import com.yunpian.sdk.model.Result;
import com.yunpian.sdk.model.SmsSingleSend;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-quartz.xml")
public class SmsTest {

	@Autowired
	YunpianClient clnt;
	
	@Test
	public void test(){
		Map<String, String> param = clnt.newParam(2);
		param.put(YunpianClient.MOBILE, "13523092673");
		param.put(YunpianClient.TEXT, "【蓝蓝的海】您的验证码是1234");
		Result<SmsSingleSend> r = clnt.sms().single_send(param);
		System.out.println(r);
	}
	
}
