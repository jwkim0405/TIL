package com.ssafy.aop;

public class OuchException extends RuntimeException {
	public void handleException() {
		System.out.println("!!!exception 발생!!!");
	}
}
