<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
</head>
<body>
	<h3>JSTL(JSP Standard Tag Library) - core 태그 - 변수지원 태그 set</h3>
	   
   <br><br>
    
   <c:set var="p_code" value="1g" scope="request" />
   <c:set var="p_name" value="Samsung Galaxy Book Pro2" scope="request" />
   <c:set var="p_price" value="2000000" scope="request" />
   
   <jsp:forward page="2_next.jsp" />
   
</body>
</html>