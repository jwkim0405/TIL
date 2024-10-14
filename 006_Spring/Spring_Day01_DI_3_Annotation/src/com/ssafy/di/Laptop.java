package com.ssafy.di;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
	// 필드...
	
	public String getInfo() {
		return "랩톱";
	}
}
