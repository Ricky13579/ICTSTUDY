<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품정보</title>
</head>
<body>
	<h3>상품정보</h3>
	<%
		request.setCharacterEncoding("UTF-8");
	%>
	상품코드 : ${p_code}<br>
	상품명: ${p_name}<br>
	상품가격: ${p_price}원<br>
	
	<hr>
	
	상품코드: ${requestScope.p_code}<br>
	상품명: ${requestScope.p_name}<br>
	상품가격: ${requestScope.p_price}원<br>
</body>
</html>