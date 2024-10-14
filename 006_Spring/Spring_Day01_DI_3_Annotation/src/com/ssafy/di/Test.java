package com.ssafy.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

// 스프링 컨테이너 맛보기
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
//		Desktop d = (Desktop) context.getBean("desktop");
//		
		Programmer p = context.getBean("p", Programmer.class);
		p.coding();
	}
}
