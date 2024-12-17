<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		out.print("=== 방법 1 ===" + "<br>");
		out.print("id : " + id + "<br>");
		out.print("pw : " + pwd + "<br>");
		out.print("email : " + email + "<br>");
		out.print("phone : " + phone + "<br>");
	%>
	<br>
	=== 방법2 ===<br>
	id : <%= id %><br>
	pwd : <%= pwd %><br>
	email : <%= email %><br>
	phone : <%= phone %><br>
</body>
</html>