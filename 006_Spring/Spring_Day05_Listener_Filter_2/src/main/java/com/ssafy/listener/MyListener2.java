package com.ssafy.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;


// annotation방식으로 Listener 등록
@WebListener
public class MyListener2 implements ServletContextListener {

    public MyListener2() { }

    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("웹 애플리케이션 시작2(JW)");
    }


    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("웹 어플리케이션 종료2(JW)");	
    }
	
}
