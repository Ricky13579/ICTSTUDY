<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>현재시간 출력</title>
</head>
<body>
<%
	// 속성값 가져오기
	// Calendar calendar = Object 타입
	
	Calendar calendar = (Calendar)request.getAttribute("time");
%>
	현재 날짜는 <%= calendar.get(Calendar.YEAR) %>년
			<%= calendar.get(Calendar.MONTH) + 1 %>월 
			<%= calendar.get(Calendar.DATE) %>일
	<br><br>
	현재 시간은	<%= calendar.get(Calendar.HOUR) %>시
			<%= calendar.get(Calendar.MINUTE) %>분
			<%= calendar.get(Calendar.SECOND) %>초
</body>
</html>