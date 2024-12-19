<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<body>
	<%
		String id = (String)session.getAttribute("SID");
	%>
	<jsp:include page="header.jsp" />
	<h3><%=id %>님의 페이지</h3>
	<hr>
	
</body>
</html>