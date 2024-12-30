<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="useBean.BookDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" style="border-collapse: collapse;">
		<tr>
			<th>책 번호</th>
			<th>책 제목</th>
			<th>책 저자</th>
			<th>책 가격</th>
		</tr>
		<c:forEach var="book" items="${books}">
			<tr>
				<td>${book.bookNo}</td>
				<td>${book.bookTitle}</td>
				<td>${book.bookAuthor}</td>
				<td>${book.price}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>