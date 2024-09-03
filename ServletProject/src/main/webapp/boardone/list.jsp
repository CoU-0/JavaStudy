<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="com.boardone.BoardDAO" %>
 <%@ page import="com.boardone.BoardVO" %>
 <%@ page import="java.text.SimpleDateFormat" %>
 <%@ page import="java.util.List" %>
 <%@ include file = "view/color.jsp" %>
 
 <%
  int pageSize = 3;// 한페이지에 몇개의 레코드를 보여줄꺼임? 화면하나에 몇개 보여주겠다 이런이야기임
  %>
 
 <%
  //날짜 형식 지정 
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); // 시 / 분 
         
         String pageNum = request.getParameter("pageNum");
         
         //무엇을 검색할것인지 파라미터로 가져와야함 (작성자, 제목, 내용 검색)
         String searchWhat = request.getParameter("searchWhat");
         //검색내용 검색
         String searchText = request.getParameter("searchText");
         
         //파라미터는 가져와서 한글로 변환 
         if(searchText !=null){
        	 searchText = new String(searchText.getBytes("utf-8"), "utf-8");
         }
          
          if(pageNum==null){
        	 pageNum ="1";
         }
         
         int currentPage = Integer.parseInt(pageNum);
         int startRow = (currentPage -1) * pageSize +1; // 페이징 처리 공식임 외우셈 
         int endRow = currentPage * pageSize;
         
         
         int count =0;
         int number = 0;
         List<BoardVO> articleList =null;
            
         BoardDAO dbPro = BoardDAO.getInstance();
         
         /*
         검색이 아니면 전체 목록을 보여주고 
         검색이면  검색한 내용을 보여줘야함 
         
         */
         
         if(searchText ==null){//검색이 아닐경우 
        	 
         
         count = dbPro.getArticleCount(); // 전체 글 수 
         
         if (count > 0){
        	 articleList = dbPro.getArticles(startRow, endRow); // db데이터베이스에 저장된 전체 글을가져다가 리스트에 저장
        	 }
         //else - 검색일 경우 
         }else{
        	 
        	 count = dbPro.getArticleCount(searchWhat, searchText);
        	 
        	 if (count > 0){
        		 articleList = dbPro.getArticles(searchWhat, searchText, startRow, endRow); // db데이터베이스에 저장된 전체 글을가져다가 리스트에 저장
        		 }
         }
         //number = count;
        	number = count-(currentPage-1) * pageSize;
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<link href = "style.css" rel ="stylesheet" type = "text/css">
</head>
<body bgcolor = "<%=bodyback_c%>">
<div align ="center"><b>글 목록(전체 글 : <%=count %>)</b>
<table width ="700" >
<tr>
	<td align = "right" bgcolor="<%=value_c%>">
	<a href ="writeForm.jsp" >글쓰기</a>
</td>
</tr>
</table>
<%
if (count ==0){

%>
<table width ="700" border="1" cellpadding="0" cellspacing="0" >
<tr>
	<td align = "center">
	게시판에 저장된 글이 없습니다.
	</td>
</tr>
</table>
<%}else{ %> <!-- 글이 있을 경우 -->
<table width ="700" border="1" cellpadding="0" cellspacing="0" >
<tr height="30" bgcolor="<%=value_c%>">
<td align = "center" width="50">번호</td>
<td align = "center" width="250">제목</td>
<td align = "center" width="100">작성자</td>
<td align = "center" width="150">작성일</td>
<td align = "center" width="50">조회</td>
<td align = "center" width="100">IP</td>
</tr>
<%
for (int i =0 ;i < articleList.size(); i++ ){
	BoardVO article = (BoardVO)articleList.get(i);
%>
<tr height="30" >
<td align="center" width="50"><%=number-- %></td>
<td width="250" >

	<%
		int wid =0;
		if(article.getDepth()>0){
			wid = 5 * (article.getDepth());
			
		
	%>
	
	<img alt="" src="img/re.gif" width="<%=wid%>" height="16" >
	<img alt="" src="level.gif">
<%}else { %>
	<img alt="" src="img/level.gif" width="<%=wid%>" height="16">
	<%} %>
	
<a href="content.jsp?num=<%=article.getNum()%>&pageNum=<%=currentPage%>">

<%=article.getSubject() %></a>
<% if(article.getReadcount() >=5){ %>
<img src="img/hot.gif" border ="0" height="16">
<%} %>
</td>

<td align ="center" width ="100" >
<a href="mailto:<%=article.getEmail()%>"><%=article.getWriter() %></a>
</td>

<td align="center" width="150">
<%=sdf.format(article.getRegdate()) %>
</td>
<td align ="center" width ="50">
<%=article.getReadcount()  %>
</td>

<td align ="center" width ="50">
<%=article.getIp()%>
 
</td>

</tr>
<%} %>
</table>
<%} %>


<%
if(count >0){
	int pageBlock = 2;
	
	int imsi = count % pageSize ==0? 0:1;
	
	int pageCount = count/ pageSize +imsi;
	
	int startPage = (int)((currentPage-1) / pageBlock) *pageBlock +1;
	// 처음 페이지 
	int endPage = startPage + pageBlock - 1 ;
	//마지막페이지
	if(endPage >pageCount) endPage = pageCount;
	
	
	//마지막 페이지 보여줌 
	if(startPage > pageBlock) {
		//검색일 경우와 검색이 아닐경우 페이지 블록 처리 
		
		// 검색이 아닌 경우 
		if(searchText ==null){
%>
<a href="list.jsp?pageNum=<%=startPage-pageBlock%>">[이전]</a>
<%}else{// 여기는 검색일 경우  %>
<a href="list.jsp?pageNum=<%=startPage-pageBlock%>&searchWhat=<%=searchWhat%>&searchText=<%=searchText%>">[이전]</a>

<%} %>


<%}
	for(int i = startPage; i<=endPage; i++){
		if(searchText ==null){ // 검색이 아닐 경우 
%>
		<a href="list.jsp?pageNum=<%=i%>">[<%=i %>]</a>
	<!-- 여긴 검색일 경우 -->
	<%}else{ %> 
	<a href="list.jsp?pageNum=<%=i%>&searchWhat=<%=searchWhat%>&searchText=<%=searchText%>">[<%=i %>]</a>
	<%} %>

<%} 

	if(endPage < pageCount){
		if(searchText ==null){
%>
	<a href="list.jsp?pageNum=<%=startPage+pageBlock%>">[다음]</a>
	<%}else{ %>
	<a href="list.jsp?pageNum=<%=startPage+pageBlock%>&searchWhat=<%=searchWhat%>&searchText=<%=searchText%>">[다음]</a>
<%} %>

<%
}
}
%>
<!-- 검색창 -->
<form action="list.jsp">
	<select name ="searchWhat"> <!-- 뭘 검색할거야  -->
		<option value="writer">작성자</option>
		<option value="subject">제목</option>
		<option value="content">내용</option>
	</select>
	<input type="text" name="searchText" >
	<input type="submit" value="검색">
	

</form>




</div>
</body>
</html>