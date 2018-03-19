package com.cks.j2ee.study.listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AnnoAttributeListener implements ServletContextAttributeListener {
	
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("Attribute Added");
	}

	public void attributeRemoved(ServletContextAttributeEvent event) {
		System.out.println("Attribute Removed");
	}

	public void attributeReplaced(ServletContextAttributeEvent event) {
		System.out.println("Attribute Replaced");
	}

}
