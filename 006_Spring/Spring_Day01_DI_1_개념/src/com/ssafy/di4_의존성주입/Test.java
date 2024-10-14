package com.ssafy.di4_의존성주입;

import java.util.Scanner;

// 스프링 컨테이너 맛보기
public class Test {
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		Laptop laptop = new Laptop();
		
		// 프로그래머가 데스크톱에 대한 의존성을 가지고 있다.
//		Programmer p = new Programmer(laptop);
		
		// #1. 생성자 이용
		Programmer p = new Programmer(laptop);
		p.coding();
		
		// #2. 설정자 이용(기본 생성자를 만들어줘야 함)
		Programmer p2 = new Programmer();
		p2.setComputer(laptop);
		
		p2.coding();
		
		
		// #3. 메서드를 통해서 주입할 수 있다.(중간에 바꾸거나...그런 작업을 할 때)
		// 생략

		// 새로운 공장 만드자!
		Scanner sc = new Scanner(System.in);
		Programmer p3 = new Programmer();
		
		while(true) {
			p3.setComputer(ComputerFactory.getComputer(sc.next()));
			p3.coding(); // 이상한 걸 넣으면 NullPointerException
		}
		
		
		
		
	}
}
