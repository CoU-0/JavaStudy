package com.login;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");

		PrintWriter out = response.getWriter(); // 출력처리

		try {
			HttpSession session = request.getSession(false);
			if (session != null) {// 아이디로 이미 로그인이 된 상태
				String sessionId = session.getId();
				System.out.println("세션 아이디 : " + sessionId);
				String user = (String) session.getAttribute("user");
				out.println("<html>");
				out.println("<body>");
				out.println("<table border = '1' width ='300'>");
				out.println("<tr>");
				out.println("<td width = '300' align = center>" + user + "님이 로그인되었습니다.");
				out.println("</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td  align = center>");
				out.println("<a href ='#'>회원정보</a>");
				out.println("<a href ='Logout'>로그아웃</a>");
				out.println("</td>");
				out.println("</tr>");
				out.println("</table>");
				out.println("</body>");
				out.println("</html>");

			} else {// 아이디가 없는 경우 아이디로 로그인이 안된 상태 //

				out.println("<html>");
				out.println("<body>");
				out.println("<form action = 'LoginChenck' method = 'post'>"); //폼형태 -> 메소드는 post 
				out.println("<table border = '1' width ='300' align ='center'>");
				out.println("<tr>");
				out.println("<th width ='100'>아이디</th>");
				out.println("<td width ='200'> &nbsp<input type = 'text' name = 'id'>");
				out.println("</td>");
				
				out.println("</tr>");
			
				out.println("<tr>");
				out.println("<th width ='100'>비밀번호</th>");
				out.println("<td width ='200'> &nbsp<input type = 'password' name = 'pwd'>");
				out.println("</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td align = 'center' colspan = '2' >");
				out.println("<input type = 'button' value = '회원가입'>");
				out.println("<input type = 'submit' value = '로그인'>");
				out.println("</td>");
				out.println("</tr>");
				out.println("</table>");
				out.println("<form>");
				out.println("</body>");
				out.println("</html>");

			}

		} finally {
			out.close();

		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);

	}

}
