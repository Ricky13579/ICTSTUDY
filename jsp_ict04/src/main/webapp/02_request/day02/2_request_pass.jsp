<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>성인인 경우(3p)</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String user_age = request.getParameter("u_age");
		int age = Integer.parseInt(user_age);
		String name = request.getParameter("u_name");
		String email = request.getParameter("u_email");
		out.print(name + "님의 나이는 " + age + "세, 술을 마실 수 있는 어른입니다."+"<br>");
		out.print(name + "님의 이메일은 "+email+"입니다."+"<br>");
	%>
	<br>
	<a href="2_request.jsp">처음으로 이동</a>
</body>
</html>