<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>미성년자</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String user_age = request.getParameter("u_age");
		int age = Integer.parseInt(user_age);
		String name = request.getParameter("u_name");
		String email = request.getParameter("u_email");
	%>
	
	<%= name %>님의 나이는 <%= age %>세, 술을 마실 수 없는 미성년자입니다.<br>
	<%= name %>님의 이메일은 <%= email %>입니다.<br>
	<br>
	<a href="2_request.jsp">처음으로 이동</a>
</body>
</html>