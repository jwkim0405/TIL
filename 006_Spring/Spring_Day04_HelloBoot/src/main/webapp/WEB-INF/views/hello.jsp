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
	<!-- 만약에 로그인 X(로그인 페이지) -->
	<c:if test="${empty loginUser}">
		<a href="login">로그인</a> <!-- /없이 한 번 만들어보자 -->
	</c:if>

	<!-- 만약에 로그인 O(로그아웃) -->
	<c:if test="${not empty loginUser}">
		<span>${loginUser }님 반갑습니다.</span>
		<a href="/logout">로그아웃</a> <!-- / 써서 한 번 만들어보자 -->
	</c:if>
	
	
	
	<h2>Hello JSP3</h2>
	<h3>${msg }</h3>
	
</body>
</html>