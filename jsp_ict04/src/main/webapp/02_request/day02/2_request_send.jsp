<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- http://localhost/jsp_01/02_request/3_request_send.jsp?user_age=999 
   1. 이전 페이지에서 입력받은 나이를 넘겨받는다.
   2. 나이가 20살 이상이면 3_request_pass.jsp로 이동(age도 같이)
   3. 나이가 20살 미만이면 3_request_ng.jsp로 이동(age도 같이)
   4. submit 말고, response.sendRedirect("이동할 페이지?input명=값");   // get방식으로 파라미터 전달
-->
	<%
		request.setCharacterEncoding("UTF-8");
		String strName = request.getParameter("user_name");
		String user_age = request.getParameter("user_age");
		String email = request.getParameter("user_email");
		
		int age = Integer.parseInt(user_age);
		
		if(age >= 20 && age <= 100){
			response.sendRedirect("3_request_pass.jsp?u_age="+age+"&u_name="+strName+"&u_email="+email);
		}
		else if(age < 0 || age > 100){
			response.sendRedirect("2_request.jsp");
		}
		else if(age >=0 && age < 20){
			response.sendRedirect("3_request_ng.jsp?u_age="+age+"&u_name="+strName+"&u_email="+email);
		}
	%>
		
</body>
</html>