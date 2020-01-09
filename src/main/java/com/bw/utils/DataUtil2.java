package com.bw.utils;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class DataUtil2 {
	public static int getAge (String src) {//年龄
		String substring = src.substring(0,4);//街区年份
		int parseInt = Integer.parseInt(substring);//截取年份
		int pp = 2020-parseInt;//找到年龄
		return pp;//返回值
	}
	public static String getDateByMonthInit (String src) {//初始值
		String substring = src.substring(0,10);//截取日期
		return substring+" 00:00:00";//返回值
	}
	public static String getDateByMonthLast(String src) {//结束值
		String substring = src.substring(0,8);//截取日期
		return substring+"30 23:59:59";//返回值
	}
	public static int getDaysByFuture (String future) {//当前到以前的日期
		//TODO
		String substring = future.substring(8,10);//截取日期
		int parseInt = Integer.parseInt(substring);//转化字符
		int pp = 30-parseInt;//获取日期
		return pp;//返回值
	}
	public static int getDaysByDeparted (String future) {//当前到以后的日期
		String substring = future.substring(8,10);//截取日期
		int parseInt = Integer.parseInt(substring);//转化字符
		int pp = parseInt-30;//获取日期
		return pp;//返回值
		//TODO
		}
	
	public static void main(String[] args) {//方法测试
		int age = getAge("2001-01-02");//年龄查询
		System.out.println(age);//输出
		String dateByMonthInit = getDateByMonthInit("2001-11-15 12:23:56");//初始值查询
		System.out.println(dateByMonthInit);//输出
		String dateByMonthLast = getDateByMonthLast("2001-11-15 12:54:26");//结束值查询
		System.out.println(dateByMonthLast);//输出
		int daysByFuture = getDaysByFuture("2001-11-15 12:54:26");//以前的日期查询
		System.out.println(daysByFuture);//输出
		int daysByDeparted = getDaysByDeparted("2001-11-15 12:54:26");//以后的日期查询
		System.out.println(daysByDeparted);//输出
;	}
}
