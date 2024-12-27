<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="useBean.MemberInfo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		MemberInfo dto = (MemberInfo)request.getAttribute("memberInfo");
	%>
	<h3>방법1. Expression</h3>
	id: <%= dto.getId() %><br>
	password: <%= dto.getPassword() %><br>
	name: <%= dto.getName() %><br>
	address: <%= dto.getAddress() %><br>
	email: <%= dto.getEmail() %><br>
	registerDate: <%= dto.getRegisterDate() %><br>
	
	<hr>
	
	<h3>방법2. EL의 멤버변수 이용 => 중요</h3>
	id: ${memberInfo.id}<br>
	password: ${memberInfo.password}<br>
	name: ${memberInfo.name}<br>
	address: ${memberInfo.address}<br>
	email: ${memberInfo.email}<br>
	registerDate: ${memberInfo.registerDate}<br>
	
	<hr>
	
	<h3>방법3. EL의 멤버메서드 이용 => 중요</h3>
	id: ${memberInfo.getId()}<br>
	password: ${memberInfo.getPassword()}<br>
	name: ${memberInfo.getName()}<br>
	address: ${memberInfo.getAddress()}<br>
	email: ${memberInfo.getEmail()}<br>
	registerDate: ${memberInfo.getRegisterDate()}<br>
</body>
</html>