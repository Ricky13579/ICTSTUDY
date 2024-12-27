<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>좋아하는 과일(중요)</title>
</head>
<body>
	<h3>좋아하는 과일</h3>
	<%
		// list 생성
		List<String> list = new ArrayList<String>();
	
		list.add("귤");
		list.add("사과");
		list.add("오렌지");
		list.add("샤인머스캣");
		
		request.setAttribute("fruits", list);
		String viewPage = "4_el_next.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	%>
	
</body>
</html>