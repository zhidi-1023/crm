package com.zhidisoft.crm.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;

public class DateConvert implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		String format;
		if (source.contains(":")) {
			format = "yyyy-MM-dd HH:mm:ss";
		} else {
			format = "yyyy-MM-dd";
		}
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.parse(source);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
