<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getParameter</title>
</head>
<body>
<h1>파라미터 활용</h1>
<form action="Login" method ="post"> <!-- 포스트 방식을 사용  -->  
			<fieldset>
			<legend>login</legend>
			<ul>
				<li>
				<label>아이디</label>
				<input type="text" name = "userid">
				
				</li>
				<li>
				<label>비밀번호</label>
				<input type="password" name = "passwd">
				
				</li>
				
			<li><input type ="submit" value = "로그인"></li>
			
			</ul>
		
			
			</fieldset>

</form>

</body>
</html>