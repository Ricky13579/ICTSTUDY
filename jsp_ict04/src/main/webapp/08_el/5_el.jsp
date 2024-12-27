<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="useBean.MemberInfo" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세페이지 - 중요</title>
</head>
<body>
	<%
		// MemberInfo 객체생성
		MemberInfo dto = new MemberInfo();
		
		dto.setId("iu");
		dto.setPassword("iu1234");
		dto.setName("아이유");
		dto.setAddress("서울");
		dto.setEmail("iu@mail.com");
		dto.setRegisterDate(new Date());
		
		request.setAttribute("memberInfo", dto);
		
		String viewPage = "5_el_next.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	%>
</body>
</html>