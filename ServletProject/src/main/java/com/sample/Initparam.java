package com.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*초기 파라미터 
 * 컨테이너 -> 서블릿 받아 해석해서 다시 브라우저로 전송해주는 애 
 *
 * 1. Servlet paramete <지역변수라고 생각하면됨>
 *  - 컨테이너가 서블릿에 생성할때 생성되는 객체임 
 *  - DD ( web.xml)를 읽어서 이름/ 값의 쌍으로 된 초기화를 파라미터를 읽어서 저장한다 
 *  - Servlet 객체당 한개 씩 생성됨 
 *  - servlet에서는 getServletConfig()를 이용해서 servlet과 관련된 ServletConfig객체를 얻을 수 있다. 
 * 
 * 
 * 
 * 2. Servlet contact
 * - Web 어플리케이션당 하나씩 생성 <전역변수라고 생각하면됨 >
 * - wep application 전체에서 참조 할 수 있는 초기화 파라미터를 저장할 수 있음 
 * - Servlet에서는 getServletContext()를 이용해서 ServletContext객체를 얻을 수 있음 
 * 
 * 
 * 서블릿 콘피그 -> 객체를 초기화 한다는것 -> 객체 만들때 =0이라고 하는것과 같은것인지? 
 * 값을 비워야지 기본값을 가지고 시작해야한다는것 
 * 파라미터값을 가져온다는 의미는 객체 초기화 파라미터 또는 설정값을 객체를 통해서 가져온다는 의미임 
 * 파라미터를 설정해서 매소드로 끌어옴 -> 
 * */



//@WebServlet("/Initparam")
public class Initparam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String company;
	private String manager;
	private String tel;
	private String email;
	
	
	public void init() throws ServletException {
		
		System.out.println("초기화 매소드를 수행합니다.");
		
		// ServletContext의 초기 파라미터 값 읽어옴 --> 전체에서 읽어옴  <전역>
		company = getServletContext().getInitParameter("company");
		manager = getServletContext().getInitParameter("manager");
		
		// servlet config 이용해서 파라미터값을 가져올것임 --> 서블릿에서만 읽어오는 것 가능 <지역 >
		tel =getServletConfig().getInitParameter("tel");
		email = getServletConfig().getInitParameter("email");
		
	}
protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html;charset=utf-8");
	PrintWriter out = response.getWriter();
// try- catch 굳이 안써도 되는이유 void - throws 가 붙어있기 떄문에 
		try {
			out.println("<html><body><ul>");
			out.println("<li>회사명: "+company+"</li>");
			out.println("<li>관리자: "+manager+"</li>");
			out.println("<li>전화번호: "+tel+"</li>");
			out.println("<li>이메일: "+email+"</li>");
			out.println("</ul></body></html>");
			
		}finally {
			out.close();
			
			
		}


}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 processRequest(request, response);

	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 processRequest(request, response);
	

	}
	
	

}
