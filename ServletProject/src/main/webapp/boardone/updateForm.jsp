<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import ="com.boardone.BoardVO" %>
    <%@ page import ="com.boardone.BoardDAO" %>
    <%@ include file = "view/color.jsp" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link href = "style.css" rel = "stylesheet" type="text/css">
<script type="text/javascript" src = "script.js"></script> <!--  자바 스크립트 연동  -->
</head>
<%
int num = Integer.parseInt(request.getParameter("num"));
 String pageNum = request.getParameter("pageNum"); // 파라미터 후에 들어오는 맵핑애들? 
		try{
	BoardDAO dbpro = BoardDAO.getInstance();
	BoardVO article = dbpro.updateGetAritcle(num);  //정보 보내주면
%>

<body bgcolor = "<%=bodyback_c%>">
<div align = "center">
<p>글 수정</p>
<br>
<form action="updateProc.jsp?pageNum=<%=pageNum%>" method = "post" name = "writeForm" onsubmit="return writeSave()">
<table width ="400" border="1" cellsapcing ="0" cellpadding="0" bgcolor ="<%=bodyback_c%>" align ="center">

<tr>
<td aglin ="center" width="70" bgcolor ="<%=value_c%>">이름</td>
<td width ="330" align ="left">
<input type = "text" size= "10" maxlength="10" name ="writer" value="<%=article.getWriter()%>">
<input type ="hidden" name= "num" value ="<%=article.getNum()%>">
</td>
</tr>

<tr>
<td aglin ="center" width="70" bgcolor ="<%=value_c%>">제목</td>
<td width ="330" align ="left">
<input type = "text" size= "50" maxlength="50" name ="subject" value="<%=article.getSubject()%>">
</td>
</tr>

<tr>
<td aglin ="center" width="70" bgcolor ="<%=value_c%>">email</td>
<td width ="330" align ="left">
<input type = "text" size= "50" maxlength="50" name ="email" value="<%=article.getEmail()%>">
</td>
</tr>

<tr>
<td aglin ="center" width="70" bgcolor ="<%=value_c%>">내용</td>
<td width ="330" align ="left">
<textarea rows="13" cols="50" name="content"><%=article.getContent()%></textarea>
</td>
</tr>

<tr>
<td aglin ="center" width="70" bgcolor ="<%=value_c%>">비밀번호</td>
<td width ="330" align ="left">
<input type = "password" size= "12" maxlength="12" name ="pass" >
</td>
</tr>

<tr>
	<td colspan="12"  bgcolor = "<%=value_c%>" align ="center">
	<input type="submit" value="글수정" >
	<input type="reset" value="다시작성" >
	<input type="button" value="목록보기"  onclick ="document.location.href='list.jsp?pageNum=<%=pageNum%>'">
	
	</td>	
</tr>

</table>
</form>
</div>
<%}catch(Exception e){e.printStackTrace();} %>
</body>
</html>