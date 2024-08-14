<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<%
Date date = new Date();
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
home | <a href ="/test/loginForm.jsp">login</a> | <a href ="/test/Memberform.jsp" >member</a> | board

top.jsp 페이지의 내용입니다.<br><br>
<%=date.toString() %><br><br>
<hr color = "Red">



</body>
</html>