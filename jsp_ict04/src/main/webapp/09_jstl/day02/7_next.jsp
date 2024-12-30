<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="useBean.MemberInfo" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" cellspacing="0" cellpadding="10">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>주소</th>
			<th>이메일</th>
			<th>등록일</th>
		</tr>
	<c:forEach var="member" items="${members}">
		<tr>
			<td>${member.getId()}</td>
			<td>${member.getPassword()}</td>
			<td>${member.getName()}</td>
			<td>${member.getAddress()}</td>
			<td>${member.getEmail()}</td>
			<td>${member.getRegisterDate()}</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>