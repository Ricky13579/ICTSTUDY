<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나이 인증(1p)</title>
</head>
<body>
	<h3>나이 인증</h3>
	<form action="2_request_send.jsp" method="get">
		이름	: <input type="text" name="user_name" size="10"><br>
		나이 : <input type="text" name="user_age" size="3"><br>
		이메일 : <input type="email" name="user_email" size="30">
		
		<input type="submit" value="인증">
	</form>
</body>
</html>