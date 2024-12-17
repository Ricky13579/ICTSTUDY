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
		String name = request.getParameter("name");
		String pos = request.getParameter("pos");
		int backnum = Integer.parseInt(request.getParameter("num"));
		out.print(name+"선수의 포지션은 "+pos+"이고, 등번호는 "+backnum+"번입니다."+"<br>");
		out.print(name+"는 수비수입니다.");
	%>
	<br>
	<a href="01_epl.jsp">처음으로 돌아가기</a>
</body>
</html>