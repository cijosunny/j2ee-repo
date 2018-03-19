package com.cks.j2ee.study.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddAttribute")
public class AnnoServletOne extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		getServletContext().setAttribute("King", "Kohli");
		
		resp.setContentType("text/html");  
        PrintWriter out=resp.getWriter();  
          
        out.print("<html><body>");  
        out.print("<h3>Hello Servlet</h3>");  
        out.print("</body></html>");  
        
        System.out.println(getServletConfig().getInitParameterNames());
	}

}
