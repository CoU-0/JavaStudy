<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.memberone.*" %>
    <jsp:useBean id="dao" class= "com.memberone.StudentDAO"></jsp:useBean>
    
    <%
	String id = (String)session.getAttribute("loginID");
    String pass = request.getParameter("pass");
    
    int check = dao.deleteMember(id, pass);
    
    if(check ==1) {
    	session.invalidate(); 	
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" http-equiv="refresh" content="3;url =Login.jsp">
<title>회원탈퇴</title>
</head>
<body>
<div align ="center">
<font size = "5" face = "굴림">
회원정보가 삭제 되었습니다. <br>
안녕 <br>
</font>
</div>
<% } else{%>
<script type="text/javascript">
alert("비밀번호가 맞지 않습니다.");
history.go(-1);
</script>


<%} %>

</body>
</html>