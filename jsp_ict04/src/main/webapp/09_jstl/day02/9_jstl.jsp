<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="useBean.BookDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<BookDTO> list = new ArrayList<BookDTO>();
	
		BookDTO dto1 = new BookDTO();
		dto1.setBookNo(1);
		dto1.setBookTitle("미운 오리 새끼");
		dto1.setBookAuthor("안데르센");
		dto1.setPrice(6500);
		list.add(dto1);
		
		BookDTO dto2 = new BookDTO();
		dto2.setBookNo(2);
		dto2.setBookTitle("짧고 굵게 배우는 JSP 웹 프로그래밍과 스프링 프레임워크");
		dto2.setBookAuthor("황희정");
		dto2.setPrice(27000);
		list.add(dto2);
		
		BookDTO dto3 = new BookDTO();
		dto3.setBookNo(3);
		dto3.setBookTitle("오라클로 배우는 데이터베이스 개론과 실습 2판");
		dto3.setBookAuthor("박우창");
		dto3.setPrice(29000);
		list.add(dto3);
		
		request.setAttribute("books", list);
		String viewPage = "9_next.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
		
	%>
</body>
</html>