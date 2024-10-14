package com.ssafy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
// 공통 관심사항을 한 방에 저장할 클래스(단위)
public class MyAspect {
	
	@Pointcut("execution(* com.ssafy.aop.*.coding())")
	public void mypt() {}
	
	
//	@Before(value="mypt()")
	// 메서드 명은 중요하지 않음(직관적으로 보여주기 위함)
	public void before() {
		System.out.println("컴퓨터를 부팅한다.");
	}
	
//	@AfterReturning(value="mypt()", returning = "num")
	public void afterReturning(int num) {
		System.out.println("Git에 Commit한다. " + num + "줄을(시간을)");
	}
	
//	@AfterThrowing(value = "mypt()", throwing = "th")
	public void afterThrowing(Throwable th) {
		System.out.println("조퇴를 한다.");
		if(th instanceof OuchException) {
			((OuchException)th).handleException();
		}
	}
//	@After("mypt()")
	public void after() {
		System.out.println("침대와 한 몸이 된다.");
	}
	
	//////////////////////////////////////////////////
	@Around("mypt()")
	public int around(ProceedingJoinPoint pjt) {
		int num = 0;
		
		this.before();
		
		try {
			num = (int) pjt.proceed();
			this.afterReturning(num);
		} catch(Throwable e) {
			this.afterThrowing(e);
		} finally {
			this.after();
		}
		
		return num;
	}
	
}
