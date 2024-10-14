package com.ssafy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	// GET, POST 다 여기 들어갈 수 있음.
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
//	@RequestMapping(value="/home", method = RequestMethod.GET )
//	public ModelAndView homeHandle1() {
//		ModelAndView mav = new ModelAndView();
//		
//		// 데이터를 심어서 보내보자
//		mav.addObject("msg", "Welcome to Spring MVC (GET)");
//		
//		// view 이름을 결정해야됨. 
//		// 포워딩 한 거랑 같음
//		mav.setViewName("home");
//		
//		
//		return mav;
//	}
//
//	@RequestMapping(value="/home", method = RequestMethod.POST )
//	public ModelAndView homeHandle2() {
//		ModelAndView mav = new ModelAndView();
//		
//		// 데이터를 심어서 보내보자
//		mav.addObject("msg", "Welcome to Spring MVC (POST)");
//		
//		// view 이름을 결정해야됨. 
//		// 포워딩 한 거랑 같음
//		mav.setViewName("home");
//		
//		
//		return mav;
//	}
	
	
}
