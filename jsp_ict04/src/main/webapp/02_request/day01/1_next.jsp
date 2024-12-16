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
		// http://localhost/jsp_ict04/02_request/day01/1_next.jsp?user_id=iu&user_pwd=iu1234
	
		String id = request.getParameter("user_id");
		String pwd = request.getParameter("user_pwd");
		String email = request.getParameter("user_email");
		
		out.print("== 방법1. out으로 출력 =="+"<br>");
		out.print("아이디 : " + id + "<br>");
		out.print("비밀번호 : " + pwd + "<br>");
		out.print("이메일 : " + email + "<br>");
	%>
	<br>
	== 방법2. 표현식으로 출력 ==<br>
	아이디 : <%= id %><br>
	비밀번호 : <%= pwd %><br>
	이메일 : <%= email %><br>
</body>
</html>