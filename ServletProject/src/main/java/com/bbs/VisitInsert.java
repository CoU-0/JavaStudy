package com.bbs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

//@WebServlet("/VisitInsert")
public class VisitInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		String writer = request.getParameter("writer");
		String memo = request.getParameter("memo");

		// System.out.println("작성자 : " +writer );
		// System.out.println("내용 : " +memo );

		// 바인딩 - 모르는내용은 일단 냅두고 작성
		String sql = "insert into Visit(no, writer, memo, regdate) values(visit_seq.nextval, ?,?,sysdate)";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, writer);
			pstmt.setString(2, memo);

			pstmt.executeUpdate();

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();

		} catch (SQLException ss) {
			ss.printStackTrace();

		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException s) {
				s.printStackTrace();
			}
			
			try {
				if (con != null)
					con.close();
			} catch (SQLException s) {
				s.printStackTrace();
			}
		}
		response.sendRedirect("VisitList"); // 목록보여주는 부분인데 이것과 다르면 페이지를 못찾
		
		
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		processRequest(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		processRequest(request, response);
	}

}
