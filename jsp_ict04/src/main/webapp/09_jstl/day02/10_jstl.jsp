<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="useBean.CarDTO" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<CarDTO> list = new ArrayList<CarDTO>();
		CarDTO dto1 = new CarDTO();
		dto1.setCarNo(1);
		dto1.setKind("소나타");
		dto1.setManu_comp("삼성");
		dto1.setPrice(30000000);
		list.add(dto1);
		
		CarDTO dto2 = new CarDTO();
		dto2.setCarNo(2);
		dto2.setKind("아반떼");
		dto2.setManu_comp("기아");
		dto2.setPrice(3000000);
		list.add(dto2);
		
		CarDTO dto3 = new CarDTO();
		dto3.setCarNo(3);
		dto3.setKind("K9");
		dto3.setManu_comp("현대");
		dto3.setPrice(50000000);
		list.add(dto3);
		
		request.setAttribute("cars", list);
		String view = "10_car.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	%>
</body>
</html>