package com.login;


import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



//@WebServlet("/LoginChenck")
public class LoginChenck extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String dbID = "admin";
		String dbPWD = "1234";
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		if(dbID.equals(id) && dbPWD.equals(pwd)) {
		HttpSession session = request.getSession();
		// 사용자 정보를 섹션에 httpsession 객체에 저장
		session.setAttribute("user", id);
	}
		response.sendRedirect("Login");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

}
