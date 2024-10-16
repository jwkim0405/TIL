package com.ssafy.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;


public class MyFilter extends HttpFilter implements Filter {
  
	private static final long serialVersionUID = 1L;
	private FilterConfig fConfig;
	
    public MyFilter() {
        super();
    }

	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		/////////////////// 서블릿에게 가기 전 코드
		System.out.println("서블릿 전1(JW)");
		
		// 필터는 체이닝이 가능. doFilter를 통해 다음으로 간다!
		// 더 이상 갈 필터가 없음 => 서블릿으로 보냄
		String encoding = fConfig.getInitParameter("encoding");
		request.setCharacterEncoding(encoding);
		chain.doFilter(request, response);
		/////////////////// 사용자에게 가기 전 코드
		System.out.println("서블릿 후1(JW)");
	}

	// 필터 초기화
	public void init(FilterConfig fConfig) throws ServletException {
		this.fConfig = fConfig;
		System.out.println("MyFilter 초기화");
	}
}
