<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <jsp:useBean id="dao" class = "com.memberone.StudentDAO"></jsp:useBean>
 <%
 	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	
	int check = dao.loginCheck(id, pass);
 %>   
<%
if(check ==1){
	session.setAttribute("loginID",id);
	response.sendRedirect("Login.jsp");
	
	
}else if (check ==0){
	%>
	<script type ="text/javascript">0
	alert("비밀번호가 틀렸습니다.");
	history.go(-1) // 뒤페이지로 이동 
	</script>	

	
<%}else{ %>
	<script type ="text/javascript">
	alert("아이디가 존재하지 않습니다.");
	history.go(-1);
	</script>	

<% }%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

</body>
</html>