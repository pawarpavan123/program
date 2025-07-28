package com.micro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		demo demo = (com.micro.demo) context.getBean("demo");
		System.out.println(demo);
	}

}
