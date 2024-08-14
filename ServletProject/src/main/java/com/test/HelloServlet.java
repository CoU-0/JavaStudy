package com.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 ## ★Container

- 컨테이너는 웹서버와 servlet 사이의 통신을 지원한다.
- 컨터이너는 서블릿의 생명주기를 관리한다.
- 컨테이너는 새로운 요청이 들어올때 마다 자바 스레드를 생성해서 사용자의 요청을 처리한다.
- 컨테이너는 선언적인 방법으로 보안관련 내용을 설정할 수 있다.

 

## ★Servlet

- 서블릿은 웹 서버에서 실행되는 자바 프로그램임
- 서블릿은 사용자의 요구에 따라서 동적으로 웹 컨텐츠를 생산해서 클라이언트 측에 전송하는 자바의 기술이다.
- javax.servlet.http.HttpServlet 클래스를 상속받아서 사용자 정의 프로그램을 작성

## ★GET 방식과 POST방식★

### 1. GET방식

- 서버에 있는 정보를 가져오기 위해 설계됨
- 240바이트까지 전달할 수 있음
- Query_String 환경 변수를 통해서 전달함
- 형식 : https//www.globalin.co.kr/servlet/login?id=aa&name=hh <이런식으로>
- URL노출로 보안성이 요구되는 경우에는 사용x
- 검색엔진에서 검색단어 전송에 많이 사용

### 2.POST방식

- 서버로 정보를 올리기 위해서 설계됨
- 데이터크기의 제한이 없다.
- URL에 파라미터가 표시되지 않는다.
 * 
*/

//@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("HelloServlet 요청..");
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	
	}

}
