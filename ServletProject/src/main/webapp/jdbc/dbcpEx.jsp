<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>    
<%@page import = "javax.sql.DataSource" %>  
<%@page import = "javax.naming.InitialContext" %>  
<%@page import = "javax.naming.Context" %>  
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<h2>DBCP 데이터베이스연동</h2>
<%
Context initContext = new InitialContext();
Context envContext  = (Context)initContext.lookup("java:/comp/env");
DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
Connection conn = ds.getConnection();
out.println("DBCP 데이터베이스 연동 성공이당~!");



%>

</body>
</html>