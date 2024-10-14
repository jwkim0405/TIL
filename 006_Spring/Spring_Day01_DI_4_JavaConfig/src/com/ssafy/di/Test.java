package com.ssafy.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


// 스프링 컨테이너 맛보기
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig2.class);
//		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
	
		Programmer p = context.getBean("program", Programmer.class);
		p.coding();
	}
}
