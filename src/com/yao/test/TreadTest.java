package com.yao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TreadTest {
public static void main(String[] args) {
	System.out.println(getSumDays("20161117")	);
}
public static int getSumDays(String now) {
	SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	Date d1 = null;
	Date d2 = null;
	int result = 0;
	try {
		d1 = format.parse(now);
		Calendar calendar = Calendar.getInstance();
		calendar.clear();
		calendar.setTime(d1);
		int month = calendar.get(Calendar.MONTH);// calendar是从0开始计算月份
		int year = calendar.get(Calendar.YEAR);
		if (month > 5) {
			year = year + 1;
		}
		calendar.clear();
		calendar.set(year, 5, 30);
		d2 = calendar.getTime();
		result = (int) ((d2.getTime() - d1.getTime()) / 86400000);// 计算两个日期时间的毫秒数值差

	} catch (ParseException e) {
		e.printStackTrace();
		throw new RuntimeException("日期格式输入错误");
	}
	return result;

}
}
