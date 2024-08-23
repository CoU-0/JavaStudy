<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.memberone.*" %>
<!--  맴버원에 있는 모든 애들 임폴트  -->

<%
   request.setCharacterEncoding("utf-8");
   %>
<jsp:useBean id="dao" class="com.memberone.StudentDAO" />

<jsp:useBean id="vo" class="com.memberone.StudentVO">
<jsp:setProperty name="vo" property="*" />
</jsp:useBean>

<%
   	String loginID =(String)session.getAttribute("loginID");
   	vo.setId(loginID);
   	dao.UpdateMember(vo);
		//질문
   	%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" http-equiv="refresh" content="3;url =Login.jsp">
<!-- http -equic : 새로고침  content - 몇초 후에 할꺼냐   -->
<title>회원정보 수정</title>
</head>
<body>

	<div align="center">
		<font size="5" face="굴림"> 입력하신 내용대로 <b>회원정보가 수정되었습니다.</b><br>
			3초 후 Login 페이지로 이동합니다.
		</font>

	</div>

</body>
</html>