package com.zongdw.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/com/zongdw/xml/testaaa.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		System.out.println(userService.getName());
		System.out.println(userService.getAge());
		
	}

}
