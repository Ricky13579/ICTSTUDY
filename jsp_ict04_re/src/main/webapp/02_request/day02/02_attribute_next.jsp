<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Calendar cal = (Calendar)request.getAttribute("today");
	%>
	오늘 날짜는 <%= cal.get(Calendar.YEAR) %>년
			<%= cal.get(Calendar.MONTH) + 1 %>월
			<%= cal.get(Calendar.DATE) %>일입니다.<br>
			
	현재 시간은	<%= cal.get(Calendar.HOUR) %>시
			<%= cal.get(Calendar.MINUTE) %>분
			<%= cal.get(Calendar.SECOND) %>초입니다.<br>
</body>
</html>