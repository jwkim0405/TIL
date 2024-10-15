<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>LoginForm</title>
</head>
<body>
	<h2>로그인</h2>
	<form action="/login" method = "POST">
		ID : <input type="text" name ="id">
		PW : <input type="password" name="pw">
		<button type="submit">로그인</button>
	</form>	
	
</body>
</html>