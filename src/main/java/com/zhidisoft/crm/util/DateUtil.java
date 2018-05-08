package com.zhidisoft.crm.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	static Calendar c = Calendar.getInstance();
	//获取本周的第一天
	public static Date firstDayOfWeek() {
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.setMinimalDaysInFirstWeek(7);
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		return c.getTime();

	}
	
	//获取本周的最后一天
	public static Date lastDayOfWeek(){
		c.setFirstDayOfWeek(Calendar.MONDAY);
		c.setMinimalDaysInFirstWeek(7);
		c.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
		return c.getTime();	
	}
	
	//获取当前月的第一天
	public static Date firstDayOfMonth(){
		c.add(Calendar.MONTH,0);
		c.set(Calendar.DAY_OF_MONTH,1);
		return c.getTime();
	}
	
	//获取当前月的最后一天
	public static Date LastDayOfMonth(){
		c.set(Calendar.DAY_OF_MONTH,c.getActualMaximum(Calendar.DAY_OF_MONTH));
		return c.getTime();
	}
	
	//获取两个日期之间的天数
	public static Integer days(Date future){
		Date date = new Date();
		Integer days = (int) ((future.getTime() - date.getTime())/86400000);
		return days;
	}
	
	//获取距离特定日期特定天数的日期
	public static Date getAddDaysDate(Date date,int days){
		c.setTime(date);
		c.add(c.DATE,days);
		return c.getTime();
	}
	
}
