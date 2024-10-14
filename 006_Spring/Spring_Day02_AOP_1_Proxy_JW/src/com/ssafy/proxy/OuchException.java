package com.ssafy.proxy;

public class OuchException extends RuntimeException {
	public void handleException() {
		System.out.println("!!!exception 발생!!!");
	}
}
