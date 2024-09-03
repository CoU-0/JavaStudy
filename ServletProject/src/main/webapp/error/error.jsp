<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isErrorPage = "true" %>
    <% response.setStatus(HttpServletResponse.SC_OK); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예외발생</title>
</head>
<body>
요청처리 과정에서 예외가 발생하였습니다. <br><br>
빠른 시간안에 문제를 해결하도록 하겠습니다.<br><br> 
에러의 타입 : <%=exception.getClass().getName() %><br><br>
에러 메시지 : <b><%=exception.getMessage() %> </b>


</body>
</html>