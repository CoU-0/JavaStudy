<%@page import="org.apache.catalina.filters.ExpiresFilter.XHttpServletResponse"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    response.setStatus(HttpServletResponse.SC_OK);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>404에러 발생</title>
</head>
<body>
<b>요청한 페이지는 존재하지 않습니다.</b>
</body>
</html>