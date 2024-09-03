<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="elfunc" uri="/WEB-INF/tlds/el-functions.tld" %>
    
    <%
    java.util.Date today =new java.util.Date();
    request.setAttribute("today", today);
    // el 사용자 정의 함수 만들어서 활용하는법 
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL 함수 호출</title>
</head>
<body>
오늘은 <b>${elfunc:dateFormat(today) }</b>입니다.
</body>
</html>