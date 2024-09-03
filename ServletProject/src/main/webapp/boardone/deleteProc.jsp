<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="com.boardone.BoardDAO" %>
<%@ page import ="java.sql.Timestamp" %>
<%
request.setCharacterEncoding("utf-8");
%>  
<jsp:useBean id="article" class ="com.boardone.BoardVO" scope="page">
<jsp:setProperty name ="article" property="*"/>
</jsp:useBean>
 <!--  이 아티클 - DAO의 매개변수로 넘어감  -->
    <!--  파라미터? 페이지 번호?   모디파이proc와 같은구조 -->
    
    <%
        int num = Integer.parseInt(request.getParameter("num"));
                                    String pageNum = request.getParameter("pageNum");
                                    String pass= request.getParameter("pass"); 
                                    BoardDAO dbpro = BoardDAO.getInstance(); // 디비 연결
                                	int check = dbpro.deleteArticle(num,pass);    // 아티클 매개변수 입력받음 
                                    
                                	if (check ==1){
        %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" http-equiv="Refresh" content="0;url=list.jsp?pageNum=<%=pageNum%>"> <!-- http-equiv refresh - 새로고침 버튼 -->
<title>게시판</title>
</head>
<body>
<%}else{ %>
<script type="text/javascript">
alert("비밀번호가 맞지 않습니다.") 
history.go(-1);

</script>
<%} %>

</body>
</html>