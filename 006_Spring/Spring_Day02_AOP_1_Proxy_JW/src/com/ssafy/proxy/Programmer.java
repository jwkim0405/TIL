package com.ssafy.proxy;

import java.util.Random;

public class Programmer {
	// 필드는 생략
	
	// 프로그래머의 일상
	public void coding() {
		
		System.out.println("이전에 수행해야 할 기능"); // 이전에 수행해야 할 기능
		
		try {
			System.out.println("핵심 관심사항(프로그래머)"); // 핵심관심사항
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
