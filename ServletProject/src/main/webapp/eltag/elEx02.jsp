<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="com.actiontag.Member" %>
<%@ page import ="java.util.ArrayList" %>
<%
	ArrayList<String> singer = new ArrayList<String>();
			singer.add("러블리즈");
			singer.add("여자친구");
			request.setAttribute("singer", singer);
	
	Member[] member = new Member[2];
	member[0] = new Member();
	member[0].setName("손오공");
	member[0].setEmail("son@naver.com");
	member[0].setPhone("010-1234-1234");

	
	member[1] = new Member();
	member[1].setName("홍길동");
	member[1].setEmail("hong@naver.com");
	member[1].setPhone("010-2345-6789");
	request.setAttribute("member", member);
	
%>
	
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>
<ul><li>${singer[0]}, ${singer[1]}<li></ul>

<ul>
<li>이름 : ${member[1].name}</li>
<li>메일 : ${member[1].email}</li>
<li>전화번호 : ${member[1].phone}</li>
</ul>


</body>
</html>