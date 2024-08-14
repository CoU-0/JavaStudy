package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test/Member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void processRequset(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter(); // 출력? 
		
		
		out.println("<html><body>");
		
		Enumeration<String> enu =request.getParameterNames();
		
		while (enu.hasMoreElements()) {
			String name = enu.nextElement();
			String value = request.getParameter(name);
			
			out.println(name+":" + value+"<br>");
			
		}
		
		
		
		out.println("</html></body>");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequset(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequset(request, response);
		
		
	}

}
