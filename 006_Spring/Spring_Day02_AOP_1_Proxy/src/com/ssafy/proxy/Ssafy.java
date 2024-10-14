package com.ssafy.proxy;

import java.util.Random;

public class Ssafy {
	// 필드는 생략!
	
	// 프로그래머의 일상
	public void coding() {		
		System.out.println("컴퓨터를 부팅한다."); // 이전에 수행해야 할 기능
		
		try {
			System.out.println("열심히 공부를 한다."); // 핵심관심사항!
			if(new Random().nextBoolean())
				throw new OuchException();
			System.out.println("Git에 Commit한다."); // 정상 마무리			
		} catch (OuchException e) {
			e.handleException();
			System.out.println("조퇴를 한다."); // 비정상 마무리
		} finally {
			System.out.println("침대와 한 몸이 된다.");
		}
		
	}
}
