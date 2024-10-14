package com.ssafy.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

// 스프링 컨테이너 맛보기
public class Test2 {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext2.xml");
		
		Programmer p = context.getBean("programmer", Programmer.class);
		
		p.coding();

	}
}
