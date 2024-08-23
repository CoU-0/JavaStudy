<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	session.invalidate(); // 로그아웃시키는 매소드 - 이거 하나면 끝
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" http-equiv="refresh" content="3;url =Login.jsp">
<title>로그아웃</title>
</head>
<body>

	<div align="center">
		<font size="5" face="굴림">
		성공적으로 로구아웃되었습니다.<br>
	 		3초 후 Login 페이지로 이동합니다.
		</font>
	</div>


</body>
</html>