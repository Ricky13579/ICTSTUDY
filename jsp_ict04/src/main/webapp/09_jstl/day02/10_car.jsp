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
			<th>차 번호</th>
			<th>차 종류</th>
			<th>차 제조사</th>
			<th>차 가격</th>
		</tr>
		<c:forEach var="car" items="${cars}">
			<tr>
				<td>${car.carNo}</td>
				<td>${car.kind}</td>
				<td>${car.manu_comp}</td>
				<td>${car.price}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>