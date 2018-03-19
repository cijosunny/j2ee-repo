package com.cks.j2ee.study;

import java.util.Optional;

public class Main {
	public static final Optional<String> port = Optional.ofNullable(System.getenv("PORT"));

//	public static void main(String[] args) throws LifecycleException, ServletException {
//		String contextPath = "/";
//        String appBase = ".";
//        Tomcat tomcat = new Tomcat();     
//        tomcat.setPort(Integer.valueOf(port.orElse("8080") ));
//        tomcat.getHost().setAppBase(appBase);
//        tomcat.addWebapp(contextPath, appBase);
//        tomcat.start();
//        tomcat.getServer().await();
//	}

}
