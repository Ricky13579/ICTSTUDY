<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>방법1. 기존 표현식(Expression)</h2>
	
	<%
		request.setCharacterEncoding("UTF-8");
		String strId = request.getParameter("user_id");
		String strPassword = request.getParameter("user_pwd");
	%>
	
	아이디: <%= strId %><br>
	비밀번호: <%= strPassword %><br>
	<hr>
	
	<h2>방법2. EL(Expression Language) 적용 => 많이 사용</h2>
	아이디: ${param.user_id}<br>
	비밀번호: ${param.user_pwd}<br>
	
	<hr>
	
	<h2>방법2. EL(Expression Language) 적용 => 대괄호</h2>
	아이디: ${param["user_id"]}<br>
	비밀번호: ${param["user_pwd"]}<br>
</body>
</html>