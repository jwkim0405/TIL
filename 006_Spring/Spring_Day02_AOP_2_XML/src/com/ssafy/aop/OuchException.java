package com.ssafy.aop;

public class OuchException extends RuntimeException {
	private static final long serialVersionUID = 1L; // OuchException에 노란줄이 거슬린다면!

	public void handleException() {
		System.out.println("병원이나 가자 😭");
	}
}
