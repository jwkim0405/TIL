package com.ssafy.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.mvc.model.dto.User;
import com.ssafy.mvc.model.service.UserService;

import jakarta.servlet.http.HttpSession;


@Controller
public class UserController {
	// 정석! Service를 의존성 주입 받아야 한다.
	
//	@Autowired
//	private final UserService userService;
//	
//	@Autowired
//	public void setUserService(UserService userService) {
//		this.userService = userService;
//	}
//	
//	@Autowired
//	public UserController(UserService userService) {
//		this.userService = userService;
//	}
	
	///////////////////////////////////////////////////////////////////
	
	// 1. 로그인의 GET 매핑
	@GetMapping("/login")
	public String loginForm() {
		return "/user/loginForm";
	}
	
	
	// 2. 로그인의 POST 매핑
//	@PostMapping("/login")
//	public String login(@RequestParam("id")String id, @RequestParam("pw")String pw) {
//		// userService라는 친구를 통해서 실제로 id/pw를 이용하여 DB까지 확인하고 실제 유저가 맞는지 확인해야됨
//		// 세션에 정보를 저장해야 됨.
//		System.out.println(id);
//		System.out.println(pw);
//		
//		return "hello";
//	}

	
	@PostMapping("/login")
	public String login(@ModelAttribute User user, HttpSession session) {
		// userService라는 친구를 통해서 실제로 id/pw를 이용하여 DB까지 확인하고 실제 유저가 맞는지 확인해야됨
		// 세션에 정보를 저장해야 됨.
		System.out.println(user);
		
		// 지금 서비스를 구현하지 않아서 user의 id를 냅다 넣었다
		session.setAttribute("loginUser", user.getId());
		
		return "redirect:hello";
	}
	
	// 로그아웃의 GET 매핑
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		// 로그아웃을 하는 방법 2가지!
		// 1. 세션에서 유저 속성을 지우는 작업
		session.removeAttribute("loginUser");
		
		// 2. 세션 자체를 초기화
//		session.invalidate();
		
		return "redirect:/";
	}
	
	
	
}
