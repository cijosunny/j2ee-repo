package com.cks.j2ee.study.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AnnoContextListener implements ServletContextListener{

	public void contextInitialized(ServletContextEvent sce) {
		System.out.println(sce.getServletContext().getClassLoader());
		System.out.println("Context Initialized!!!");
	}

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Context Destroyed!!!");
	}
	
}
