<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file = "view/color.jsp" %>
    <%
    
    int num = Integer.parseInt(request.getParameter("num"));
    String pageNum = request.getParameter("pageNum"); // 얘네 번호 받아서 
  
    
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link href = "style.css" rel = "stylesheet" type="text/css">
<script type="text/javascript" src = "script.js"></script> 
</head>
<body>
<div align = "center">
<b>글삭튀</b><br>
<form action="deleteProc.jsp?pageNum=<%=pageNum%>" name ="delForm" method ="post" onsubmit ="return deleteSave()">
<table width ="360" align ="center" border ="1" cellspacing ="0" cellpadding ="0" >
<tr height="30">
	<td align ="center" bgcolor ="<%=value_c%>">
	<b>비밀번호 입력해주세요</b></td>

</tr>

<tr height="30">
<td align="center">비밀번호 : 
<input type= "password" name="pass" size="10" maxlength="10">
<input type="hidden" name="num" value="<%=num%>"> <!-- 위에 정의한 num -->
</td>
</tr>

<tr height="30">	
<td align="center" bgcolor="<%=value_c%>">
 <input type="submit" value="글삭제" >
 <input type="button" value="글목록" onclick="document.location.href='list.jsp?pageNum=<%=pageNum%>'">	
</td>
</tr>

</table>
</form>
</div>

</body>
</html>