<%@ page import="java.sql.*" %>
<%@ page import="com.jdbc.*" %>
<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	ConnectionPool pool = ConnectionPool.getInstance();
	
	
	
	String id = "",
			passwd = "",
			name ="",
			mem_num1="",
			mem_num2="",
			e_mail ="",
		    phone= "",
			zipcode = "",
			address= "",
			job ="";
	
	int counter = 0;
	
	try{
		conn =pool.getConnection();
		
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from tempmember ");
		

	
	
%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>JSP에서 데이터베이스 연동</title>
<link href="style.css" rel="stylesheet" type="text/css">
<!--  외부파일 적용  -->
</head>
<body bgcolor="#FFFFCC">
	<h2>JSP 커넥션 풀을 사용한 데이터베이스 연동</h2><br>
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
<%
	counter++;
	if(rs != null){
		while(rs.next()){
			id = rs.getString("id");
			passwd = rs.getString("passwd");
			name= rs.getString("name");
			mem_num1= rs.getString("mem_num1");
			mem_num2= rs.getString("mem_num2");
			e_mail= rs.getString("e_mail");
			phone= rs.getString("phone");
			zipcode= rs.getString("zipcode");
			address= rs.getString("address");
			job= rs.getString("job");
%>
<tr>
<td><%=id %></td>
<td><%=passwd %></td>
<td><%=name %></td>
<td><%=mem_num1 %></td>
<td><%=mem_num2 %></td>
<td><%=e_mail %></td>
<td><%=phone %></td>
<td><%=zipcode %></td>/<td><%=address %></td>
<td><%=job %></td>




<%
counter++;

		} //end while
		
	} //end if 


%>
</tr>

	</table>
	<br> total records :
	<%=counter %>
	<!-- 카운터 출력 -->
	<%
	}catch(IOException s){
		s.printStackTrace();
		
	}catch(SQLException ss){
		ss.printStackTrace();
	}finally{
		if(stmt!=null)
			try{
				stmt.close();
			}catch(SQLException ss){}
		
		if(conn!=null)
			try{
				pool.releaseConnection(conn);
			}catch(SQLException ss){}

	
	}
	 
	 %>
</body>
</html>