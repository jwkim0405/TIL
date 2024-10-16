<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>hello 페이지</h2>
	<h3>${msg } <-메세지가 잘 보이시나요?</h3>
 	<c:if test="${empty userId }">
		<a href="/login">로그인</a>
	</c:if>
	<c:if test="${not empty userId }">
		<span>${userId }님, 반갑습니다.</span>
		<a href="/logout">로그아웃</a>
	</c:if>
	
</body>
</html>