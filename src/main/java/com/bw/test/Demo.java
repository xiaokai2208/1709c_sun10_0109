package com.bw.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.mapper.BookMapper;
import com.bw.utils.IOUtils;
import com.bw.utils.StringUtil;

public class Demo {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookMapper bean = ac.getBean(BookMapper.class);
		
		List<Object[]> list = IOUtils.readFile("a.txt", "\\|");
		for (Object[] objects : list) {
			
			//要求使用正则验证价格是否为空     格式是否正确
			if(StringUtil.isEmpty(objects[2]+"")){
				objects[2] ="0.0";
			}
			Book book = new Book(Integer.parseInt(objects[0]+""), objects[1]+"", Double.parseDouble(objects[2]+""), objects[3]+"");

			Type type = bean.queryTypeByName(objects[4]+"");
			
			if(type != null ){
				book.setTid(type.getTid());
			}
			
			
			bean.insert(book);
			
		}
		
		
	}
}
