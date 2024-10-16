package com.ssafy.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

// web.xml 방식으로 Listener 등록

public class MyListener implements ServletContextListener {

 
    public MyListener() { }

    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("웹 애플리케이션 시작(JW)");
    	ServletContext context = sce.getServletContext();
    	System.out.println(context.getInitParameter("welcome"));
    }


    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("웹 어플리케이션 종료(JW)");	
    }
	
}
