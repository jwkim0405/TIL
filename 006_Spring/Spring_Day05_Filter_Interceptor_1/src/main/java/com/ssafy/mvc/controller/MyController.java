package com.ssafy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("msg", "오늘의 운세: 공기가 좋네요");
		
		return "hello";
	}
	
	@GetMapping("/regist")
	public String regist() {
		return "regist";
	}
}
