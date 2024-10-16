package com.ssafy.mvc.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor{
	 @Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		 System.out.println("prehandle 초기");
		 if (request.getSession().getAttribute("userId") == null) {
			 System.out.println("작동했니ㅣ?");
			 response.sendRedirect("/login");
			 return false;
		 }
		 
		 return true;
		 
	 
	 }
}
