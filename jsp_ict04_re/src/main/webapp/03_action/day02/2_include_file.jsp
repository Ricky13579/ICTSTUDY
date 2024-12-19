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
	
	<%@ include file="2_variable.jsp" %>
	날짜 : <%= date %><br>
	<%@ include file="2_footer.jsp" %>
	
	<fieldset style="max-width : 400px;">
		<legend>include 디렉티브</legend>
		
		<%
			String name = request.getParameter("user_name");
			int age = Integer.parseInt(request.getParameter("user_age"));
			String phone = request.getParameter("user_hp");
			out.print("== 방법1. out 객체로 출력 =="+"<br>");
			out.print("이름 : " + name + "<br>");
			out.print("나이 : " + age + "<br>");
			out.print("전화번호 : " + phone + "<br>");
		%>
		<br>
		== 방법2. Expression(표현식) 객체로 출력 ==<br>
		이름 : <%= name %><br>
		나이 : <%= age %><br>
		전화번호 : <%= phone %><br>
	</fieldset>
</body>
</html>