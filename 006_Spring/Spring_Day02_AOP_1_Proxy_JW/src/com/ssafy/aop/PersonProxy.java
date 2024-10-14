package com.ssafy.aop;

import java.util.Random;

public class PersonProxy implements Person {

	// 프록시 객체에 주입한 인간
	private Person person;
	
	// 설정자 주입
	public void setPerson(Person person) {
		this.person = person;
	}
	
	@Override
	public void coding() {
		
		System.out.println("이전에 수행해야 할 기능"); // 이전에 수행해야 할 기능
		
		try {
			person.coding();
			System.out.println("정상 마무리 기능");
			if (new Random().nextBoolean())
				throw new OuchException();
		} catch (OuchException e) {
			e.handleException();
			System.out.println("==비정상 마무리==");
		} finally {
			System.out.println("모든 게 마무리 됨");
		}
	}
	
}
