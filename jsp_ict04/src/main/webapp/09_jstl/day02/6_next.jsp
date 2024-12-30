<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	%>
	
	<c:forEach var="food" items="${menu}">
		${food}
	</c:forEach>
	<br>
	
	<c:forEach var="i" begin="1" end="2" items="${menu}">
		${i}
	</c:forEach>
</body>
</html>