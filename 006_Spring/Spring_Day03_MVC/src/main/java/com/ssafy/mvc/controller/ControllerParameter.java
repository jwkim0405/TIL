package com.ssafy.mvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class ControllerParameter {
	
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	// 데이터도 같이 보내고 싶다.
	// 사실 반환타입을 MaV로 바꾸면 됨... 하지만 싫어
//	@GetMapping("/test2-1")
//	public String test2_1(Model model) {
//		model.addAllAttributes("msg", "data입니다.");
//		
//		return "test2"; // WEB-INF/view/test2.jsp
//	}

	@GetMapping("/test2-1")
	public String test2_2(Map<String, Object> model) {
		model.put("msg",  "map data");		
		return "test2"; // WEB-INF/view/test2.jsp
	}
	
	@GetMapping("/test3")
	public String test3(Model model, HttpServletRequest request) {
		String id = request.getParameter("id");
		
		model.addAttribute("id", id);
		return "test3";
	}
	
	
	// 파라미터 값을 가지고 오고 싶다.
	@GetMapping("/test3-1")
	public String test3_1(Model model, @RequestParam("id") String id, @RequestParam("pw") String pw) {
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "test3-1";
	}

}
