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
		// http://localhost/jsp_ict04/02_request/day01/1_next.jsp?user_id=iu&user_pwd=iu1234
		String user_id = request.getParameter("user_id");
		String user_pwd = request.getParameter("user_pwd");
		String user_email = request.getParameter("user_email");
		String user_major = request.getParameter("user_major");
		
		String user_job = request.getParameter("user_job");
		if(user_job.equals("")){
			user_job = "없음";
		}
		
		String[] hobby = request.getParameterValues("user_hobby");
		String user_hobby = "";
		if(hobby != null){
			for(int i = 0; i < hobby.length; i++){
				user_hobby += (i+1)+"번째 취미 : " + hobby[i] + "<br>";
			}
		}else{
			user_hobby = "취미 없음";
		}
		
		out.print("== 방법1. out으로 출력 =="+"<br>");
		out.print("user_id : " + user_id + "<br>");
		out.print("user_pwd : " + user_pwd + "<br>");
		out.print("user_email : " + user_email + "<br>");
		out.print("user_major : " + user_major + "<br>");
		out.print("user_job : " + user_job + "<br>");
		out.print(user_hobby + "<br>");
	%>
	<br>
	<hr>
	<br>
	== 방법2. 표현식으로 출력 ==<br>
	user_id : <%= user_id %><br>
	user_pwd : <%= user_pwd %><br>
	user_email : <%= user_email %><br>
	user_major : <%= user_major %><br>
	user_job : <%= user_job %><br>
			  <%= user_hobby %><br>
</body>
</html>