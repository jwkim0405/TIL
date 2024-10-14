package com.ssafy.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Desktop desktop() {
		return new Desktop(); // new라고 쓰여 있지만 항상 새로 생기는 것 아님!
	}
	
	@Bean
	public Programmer program() {
		// 생성자 주입
		Programmer p = new Programmer(desktop());
		return p;
	}
}