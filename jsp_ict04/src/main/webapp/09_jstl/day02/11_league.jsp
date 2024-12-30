<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="useBean.CarDTO" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" style="border-collapse: collapse;">
		<tr>
			<th>유럽 축구 리그 번호</th>
			<th>유럽 축구 리그 이름</th>
		</tr>
		<c:forEach var="league" items="${leagues}">
			<tr>
				<td>${league.leagueNo}</td>
				<td>${league.leagueName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>