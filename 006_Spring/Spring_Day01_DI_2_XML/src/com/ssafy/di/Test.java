package com.ssafy.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

// 스프링 컨테이너 맛보기
public class Test {
	public static void main(String[] args) {
		System.out.println("0");
		
		// #1. 이때 기본생성자를 만들어두었다가!
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		System.out.println("1");
		
		// #2. getBean하면 만들어둔 것을 가져다주겠다!
		Programmer p = context.getBean("programmer", Programmer.class);
		Desktop d = (Desktop) context.getBean("desktop");
		Desktop d2 = context.getBean("desktop", Desktop.class);
		
		p.setComputer(d);
		System.out.println("2");
		p.coding();
		
		
		
		System.out.println(d == d2); // 기본적으로 싱글턴으로 관리한다!
		
	}
}
