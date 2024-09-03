<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "com.boardone.BoardDAO" %>
<%@ page import = "java.sql.Timestamp" %>
<%
request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="article" class="com.boardone.BoardVO" scope="page"> <!--  자바의 클래스에 이용한다 - 값을 객체화 시킨다. 자바 jsp연결할떄 / jsp 에서는 빈을 가지고 객체 생성  -->
     <jsp:setProperty name="article" property="*" /><!--  프로퍼티 - 한번에 저장 한번에 내보내기  -->
</jsp:useBean>

<%
article.setRegdate(new Timestamp(System.currentTimeMillis()));
article.setIp(request.getRemoteAddr());
BoardDAO dbPro = BoardDAO.getInstance();
dbPro.insertArticle(article);
response.sendRedirect("list.jsp");
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

</body>
</html>