package com.sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/MyFirst") // 서블릿 매핑만 지정해서 사용함 
//@WebServlet (name = "MyFirst", urlPatterns = {"/mm","/my","/xx"} ) 


public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProcessRequest(request,response);
	// 겟에서도, 포스트에서도 호출 둘다 가능 
	

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProcessRequest(request,response);
		// 겟에서도, 포스트에서도 호출 둘다 가능 
		
	}
	protected void ProcessRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//myfirst 가 요청하면 응답하는 애 
		response.setContentType("text/html;charset=UTF-8"); // html이고 utf8로 코딩할꺼다 라는 뜻 
		PrintWriter out = response.getWriter();
		
		try {
		//response.setContentType("text/html;charset=UTF-8"); //둘중에 하나만 써도 되고 둘다 가져가도 됨 
		
			
	    Date date = new Date();
		out.println("<html>");
		out.println("<body>");
		out.println("MY First Servlet Program !!!");
		out.println("<br>");
		out.println(date.toString());
		out.println("</body>");
		out.println("</html>");
		
		}finally {
			out.close();
		}
		
	}

}
