<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Attribute</title>
</head>
<body>
	<%
		Calendar cal = Calendar.getInstance();
		request.setAttribute("today", cal);
	%>
	<jsp:forward page="02_attribute_next.jsp" />
</body>
</html>