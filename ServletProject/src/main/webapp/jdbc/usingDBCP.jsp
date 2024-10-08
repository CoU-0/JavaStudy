<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.jdbc.*" %><!-- jdbc 모든걸 임폴트하겠다는말미  -->
<%@page import="java.util.Vector"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>DBCP에서 데이터베이스 연동</title>
<link href="style.css" rel="stylesheet" type="text/css">
<!--  외부파일 적용  -->
</head>
<body bgcolor="#FFFFCC">
	<h2>dbcp를 사용한 데이터베이스 연동</h2>
	<br>
	<h3>회원정보</h3>
	<table bordercolor="#0000ff" border="1" >
		<tr>
			<td><strong>ID</strong></td>
			<td><strong>PASSWD</strong></td>
			<td><strong>NAME</strong></td>
			<td><strong>MEM_NUM1</strong></td>
			<td><strong>MEM_NUM2</strong></td>
			<td><strong>E_MAIL</strong></td>
			<td><strong>PHONE</strong></td>
			<td><strong>ZIPCODE / ADDRESS</strong></td>
			<td><strong>JOB</strong></td>
		</tr>

<jsp:useBean id="dao" class="com.jdbc.DBCPMember" scope ="page" />
<!--  객체를 만드는 간단한 방법  -->
<%
	Vector<MemberVO> vlist = dao.getMemberList();
	int counter = vlist.size();
	
	for (int i =0 ; i<vlist.size(); i++){ 
			MemberVO vo = vlist.elementAt(i);
%>


<tr>
<td><%=vo.getId() %></td>
<td><%=vo.getPasswd()%></td>
<td><%=vo.getName() %></td>
<td><%=vo.getMem_num1() %></td>
<td><%=vo.getMem_num2() %></td>
<td><%=vo.getE_mail() %></td>
<td><%=vo.getPhone() %></td>
<td><%=vo.getZipcode() %></td>/<td><%=vo.getAddress() %></td>
<td><%=vo.getJob() %></td>




<%
	} //end for문 닫침  
%>
</tr>

	</table>
	<br> total records : <%=counter %>
	<!-- 카운터 출력 -->
	
</body>
</html>