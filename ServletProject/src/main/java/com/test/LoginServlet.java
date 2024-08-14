package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/test/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	
	}
	protected void  processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid"); //폼에 있는 애들을 가져옴 
		String passwd = request.getParameter("passwd"); //폼에 있는 애들을 가져옴 
		
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();		
		
		out.println("<html><body>");
		
		out.println("아이디 :"+userid + "<br>");
		out.println("비밀번호 :"+passwd + "<br>");
		
		
		out.println("</body></html>");
		
	}
	
}
