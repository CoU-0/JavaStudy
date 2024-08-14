package com.sample;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * ## 페이지 이동방법

1. 메소드를 호출을 통해서 페이지를 이동할 수 있는 방법 2가지 
2. forward / redirect
구분					forward	redirect
url						url바뀐다	url바뀌지 않는다 
요청객체와 응답객체		유지 됨	유지 안됨 
속도						빠름	느림
소속					요청(request)	응답(reponse)

 */

//@WebServlet("/Source")
public class Source extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// 페이지 이동방식 
		// 1. forward방식으로 이동 
		RequestDispatcher view = request.getRequestDispatcher("Destination"); // url이 고정으로 들어가서 url이 바뀌지 않음 
		
		view.forward(request, response);
		// 2. redirect 방식으로 
		//response.sendRedirect("Destination");
		
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
