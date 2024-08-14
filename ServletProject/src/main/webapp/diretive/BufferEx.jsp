<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" buffer = "1kb" autoFlush = "true" %>
    <%--
 ### buffer

- 임시 기억 장소
- 출력 버퍼의 크기를 설정함 ( 기본크기는 8kb 임)
- buffer 속성이 non으로 결정 되면 jspWriter 객체를 이용한 출력 버퍼시 버퍼를 이용하지 않는다.
- 즉, jsp 페이지로 부터 출력되는 모든 내용은 즉시 사용자에게 응답함
auto Flush 
     --%>
    
       
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

<%
for (int i = 0; i< 1000; i++){
%>
1234
<%
}
%>

</body>
</html>












