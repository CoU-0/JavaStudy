<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP File</title>
</head>
<body>
<h2>JSP Script</h2>
<%// Scriptlet - 연산, 처리 
	String scriptlet ="스크립트릿입니다.";
	String comment = "주석문입니다.";
	out.println("내장 객체를 이용한 출력 :"+ declation+"<br><br>");


%>

<%! // delclation - 변수선언 
String declation = "선언문 입니다.";

%>


선언문 출력하기(변수) : <%=declation %><br><br>
선언문 출력하기 (매소드) : <%=declationMethod() %><br><br>
스크립트릿 출력하기 : <%=scriptlet %><br><br>
<!-- jsp에서 사용하는 html 주석 -->
<!-- html 주석 : <%=comment%> --><br><br>
<%-- jsp 주석 <%=comment%>  --%><br><br>

<%! 
	public String declationMethod(){
		return declation;
	
}
%>




</body>
</html>