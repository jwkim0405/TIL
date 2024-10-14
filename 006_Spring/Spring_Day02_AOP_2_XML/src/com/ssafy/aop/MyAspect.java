package com.ssafy.aop;

// 공통 관심사항을 한 방에 저장할 클래스(단위)
public class MyAspect {
	
	// 메서드명은 중요치 않아(직관적으로 보여주려고!)
	// 보안모듈, findPassword 등으로 원래는 메서드명 작성
	public void before() {
		System.out.println("컴퓨터를 부팅한다."); // 이전에 수행해야 할 기능
	}
	
	public void afterReturning(int num) {
		System.out.println("Git에 Commit한다. " + num + "줄을 (시간을)"); // 정상 마무리			
	}
	
	public void afterThrowing(Throwable th) { // 예외가 던져질 때 객체가 만들어짐
		System.out.println("조퇴를 한다.");
		if (th instanceof OuchException) {
			((OuchException)th).handleException();
		}
	}
	
	public void after() {
		System.out.println("침대와 한 몸이 된다.");
	}
	
	public int around(ProceedingJoinPoint pjt) {
		int num = 0;
		
		this.before();
		try {
			num = (int) pjt.proceed();
			this.afterReturning(num);
		} catch (Throwable e){
			this.afterThrowing(e);
		} finally {
			this.after();
		}
		return num;
	}
}
