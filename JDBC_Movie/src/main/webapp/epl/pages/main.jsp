<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<%
		String id = (String)session.getAttribute("SID");
		
		if(id == null){
	%>
	<h3>메인 페이지</h3>
	<%
		}
		else
		{
	%>
	<h3><%= id %>님 환영합니다.</h3>
	<%
		}
	%>
	<hr>
</body>
</html>