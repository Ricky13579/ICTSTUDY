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
		String name = request.getParameter("user_name");
		String back = request.getParameter("back_color");
		String font = request.getParameter("font_color");
		String shadow = request.getParameter("shadow_color");
	%>
	<p>
		이름 : <%= name %>
	</p><br>
	<p style="background-color: <%= back %>;">
		배경색 : <%= back %>
	</p><br>
	
	<p style="color: <%= font %>;">
		글자색 : <%= font %>
	</p><br>
	
	<p style="text-shadow: 3px 3px 3px <%= shadow %>">
		그림자색 : <%= shadow %>
	</p>
</body>
</html>