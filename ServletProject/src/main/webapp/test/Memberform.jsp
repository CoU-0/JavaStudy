<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
<!-- get -->
</head>
<body>
	<h1>회원관리</h1>
	<form action="Member" method="post">
		<fieldset>
			<legend>회원정보</legend>
			<ul>
				<li><label>이름</label> <input type="text" name="username">
				</li>
				<li><label>주소</label> <input type="text" name="address">
				</li>
				<li><label>아이디</label> <input type="text" name="userid">
				</li>
				<li><label>비밀번호</label> <input type="password" name="passwd">
				</li>
				<li><label>이메일</label> <input type="email" name="email">
				</li>
				<li><input type="submit" value="전송"></li>

			</ul>
		</fieldset>
	</form>
</body>
</html>