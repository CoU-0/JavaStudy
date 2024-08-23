<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- usebean  -->
<jsp:useBean id="dao" class="com.memberone.StudentDAO" />

<%
String id = request.getParameter("id");
boolean check = dao.idCheck(id);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ID중복체크</title>
<link herf="style.css" rel="stylesheet" type="text/css">
<script src="script.js"></script>


</head>
<body bgcolor="#FFFFCC">
	<br>
	<div align="center">
		<b><%=id%></b>
		<%
		if (check) {
			out.println("는 이미 존재하는 ID 입니다.<br>"); // true 이면 

		} else {
			out.println("는 사용가능한 아이디입니다."); // false 이
		}
		%>
		<a herf="#" onclick="javascript:self.close()">닫기</a>
	</div>


</body>
</html>