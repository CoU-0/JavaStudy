<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2>include 지시어</h2>
    
    <%
    String name ="Gil Dong Hong";
    %>
    
    <%@ include file = "top.jsp" %>
    top.jsp와 bottom.jsp를 포함한 본문 페이지입니다.
    
    <%@ include file = "bottom.jsp"%>