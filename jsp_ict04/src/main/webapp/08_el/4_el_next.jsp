<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list 출력</title>
</head>
<body>
	<h3>request의 list 출력</h3>
	
	<h4>방법1. 기존 표현식</h4>
	
	<%
		List<String> list = (ArrayList<String>)request.getAttribute("fruits");
	%>
	표현식: 			  <br>	
	<%= list.get(0) %>
	<%= list.get(1) %>
	<%= list.get(2) %> 
	<%= list.get(3) %>
	
	<hr>
	
	<h4>방법2. EL 태그</h4>
		${fruits}<br>
	<hr>
	
	<!-- 배열 -->
	배열: 		<br>
		${fruits[0]}
		${fruits[1]}
		${fruits[2]}
		${fruits[3]}<br>
	<hr>
	
	<!-- scope 출력 -->
	EL 태그:  					 <br>
			${requestScope.fruits[0]} 
		    ${requestScope.fruits[1]}
		    ${requestScope.fruits[2]}
		    ${requestScope.fruits[3]}<br>
</body>
</html>