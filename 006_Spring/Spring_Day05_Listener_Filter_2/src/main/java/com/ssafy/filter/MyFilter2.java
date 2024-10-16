package com.ssafy.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter
public class MyFilter2 extends HttpFilter implements Filter {
  
	private FilterConfig fConfig;
	
    public MyFilter2() {
        super();
    }

	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		/////////////////// 서블릿에게 가기 전 코드
		System.out.println("서블릿 전2(JW)");

		chain.doFilter(request, response);
		
		/////////////////// 사용자에게 가기 전 코드
		System.out.println("서블릿 후2(JW)");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		this.fConfig = fConfig;
	}

}
