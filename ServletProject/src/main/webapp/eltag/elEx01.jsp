<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
    
<%@ page import ="com.actiontag.Member" %>
<%@ page import ="java.util.HashMap" %>

<%
//
Member member = new Member();
member.setName("손오공");
member.setEmail("son@naver.com");
member.setPhone("010-1234-5678");
request.setAttribute("member", member);

HashMap<String, String> map = new HashMap<String,String>();
map.put("name", "소나타");
map.put("maker", "현대자동자");
request.setAttribute("car", map);


%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>
<ul>
<li>이름 : ${member.name }</li>
<%-- <li>이름 : <%= member.getName() %></li> --%>
<li>이메일 : ${member.email }</li>
<li>전화번호 : ${member.phone }</li>
</ul>

<ul>
<li>자동차 : ${car.name }</li>
<li>브랜드 : ${car.maker }</li>

</ul>




</body>
</html>