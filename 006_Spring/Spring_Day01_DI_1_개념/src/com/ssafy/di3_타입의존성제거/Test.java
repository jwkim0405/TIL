package com.ssafy.di3_타입의존성제거;

// 스프링 컨테이너 맛보기
public class Test {
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		Laptop laptop = new Laptop();
		
		// 프로그래머가 데스크톱에 대한 의존성을 가지고 있다.
		Programmer p = new Programmer(laptop);
		
		p.coding();
	}
}
