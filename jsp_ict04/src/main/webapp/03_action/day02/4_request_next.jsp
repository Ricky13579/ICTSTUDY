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
   <!-- 표현식으로 css 속성값 출력, css 적용 -->
   <!-- <p style="속성명 : 속성값(=표현식)">배경색 </p><br> -->
	<jsp:include page="4_result.jsp">
		<jsp:param value="<%= name %>" name="user_name"/>
		<jsp:param value="<%= back %>" name="back_color"/>
		<jsp:param value="<%= font %>" name="font_color"/>
		<jsp:param value="<%= shadow %>" name="shadow_color"/>
	</jsp:include>
</body>
</html>