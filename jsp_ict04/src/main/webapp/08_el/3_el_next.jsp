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
	%>
	<h2>EL 태그</h2>
	아이디: ${param.user_id}<br>
	취미: ${paramValues.user_hobby[0]} ${paramValues.user_hobby[1]} ${paramValues.user_hobby[2]} ${paramValues.user_hobby[3]}<br>
	
	<h2>EL 태그 - 대괄호</h2>
	아이디: ${param["user_id"]}<br>
	취미: ${paramValues["user_hobby"][0]} ${paramValues["user_hobby"][1]} ${paramValues["user_hobby"][2]} ${paramValues["user_hobby"][3]}<br>
</body>
</html>