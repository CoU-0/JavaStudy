<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ include file= "view/color.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My board</title>
<link href = "style.css" rel ="stylesheet" type = "text/css">
<script type="text/javascript" src ="script.js"></script>
</head>

<!--  새글인지 답변글인지 구분하는 코드  작성  -->
<%

/*
새글일 경우는 num = 0 이라고 해서 넘겨줄 것이고, 답변글일 경우는 원본글을 num을 가져와서 넘겨줌 
이것을 통해서 새글인지 답변글인지를 구별 
*/
int num = 0, ref =1, step= 0, depth =0;
try{
	if(request.getParameter("num") != null){
	num = Integer.parseInt(request.getParameter("num"));	
	ref = Integer.parseInt(request.getParameter("ref"));	
	step = Integer.parseInt(request.getParameter("step"));	
	depth = Integer.parseInt(request.getParameter("depth"));	
	}
	
%>

<body bgcolor="<%= bodyback_c%>">
<div align ="center"><b>글쓰기</b></div><br>

<form action="writeProc.jsp" name = "writeForm" method ="post"  onsubmit="retrun writeSave()">
<input type = "hidden" name = "num" value="<%=num %>">
<input type = "hidden" name = "ref" value="<%=ref %>">
<input type = "hidden" name = "step" value="<%=step %>">
<input type = "hidden" name = "depth" value="<%=depth %>">

<table width ="400" border ="1" cellpadding ="0" cellspacding ="0" align = "center" bgcolor="<%=bodyback_c%>">
<tr>
	<td align = "right" colspan ="2" bgcolor ="<%=value_c%>">
		<a href ="write.jsp" >글 목록 </a>	
	</td>
</tr>

<tr>
	<td width ="70" bgcolor="<%= bodyback_c%>" align ="center">이름</td>
	<td width="330" >
		<input type = "text" size = "12" maxlength="12" name ="writer">
	</td>
</tr>

<tr>
	<td width ="70" bgcolor="<%= bodyback_c%>" align ="center">이메일</td>
	<td width="330" >
		<input type = "text" size = "12" maxlength="40" name= "email">
	</td>
</tr>


<tr>
	<td width ="70" bgcolor="<%= bodyback_c%>" align ="center">제목</td>
	<td width="330" >
	<!-- 새글 답변글 구분  -->
	<%if(request.getParameter("num")==null) {%> <!-- num이 null 이면 새글 -->
	<input type = "text" size = "40" maxlength="40" name= "subject">
	<%}else{ %> <!-- 답변글-->
	<input type = "text" size = "40" maxlength="40" name= "subject" value ="[답변글]">
	<%} %>

	</td>
</tr>

<tr>
	<td width ="70" bgcolor="<%= bodyback_c%>" align ="center">내용</td>
	<td width="330" >
	<textarea rows="13" cols="50" name= "content"></textarea>

	</td>
</tr>

<tr>
	<td width ="70" bgcolor="<%= bodyback_c%>" align ="center">비밀번호</td>
	<td width="330" >
		<input type = "password" size = "10" maxlength="10" name= "pass">
	</td>
</tr>

<tr>
	<td colspan = "3" bgcolor ="<%=value_c%>" align ="center">
	<input type = "submit" value ="글쓰기">
	<input type = "reset" value = "다시작성">
	<input type = "button" value = "글목록" onclick ="javascript:window.location='list.jsp' ">
	
	</td>
</tr>

</table>
</form>
<%}catch (Exception e ){ e.printStackTrace();} %>



</body>
</html>