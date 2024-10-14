package com.ssafy.di;

// 컴퓨터 필요해!
public class Programmer {
	private Computer computer;
	
	public Programmer() {};
	
	// 생성자 주입
	public Programmer(Computer computer) {
		// 가지고 있는 데스크탑 한 개 줘!
		this.computer = computer;
	}
	
	// 설정자를 이용해서 주입
	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	// 메서드를 통해서 주입할수도 있다! (중간에 바꾸거나...)
	

	public void coding() {
		System.out.println(computer.getInfo() + "으로 개발을 합니다.");
	}
}
