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
		
		String strId = request.getParameter("user_id");
		String strPwd = request.getParameter("user_password");
		String strName = request.getParameter("user_name");
		
		request.setAttribute("sid", strId);
		request.setAttribute("spw", strPwd);
		request.setAttribute("sname", strName);
		
		out.print("== 회원정보 출력 =="+"<br>");
		out.print("아이디 : "+strId+"<br>");
		out.print("비밀번호 : "+strPwd+"<br>");
		out.print("이름 : "+strName+"<br>");
	%>
	<br>
	<form action="01_session.jsp" method="post">
		<fieldset>
			<legend>회원약관</legend>
			 ===========================================<br>
	         1. 회원정보는 웹사이트의 운영정보를 위해서만 사용됩니다.<br>
	         2. 웹사이트의 정상운영을 방해하는 회원은 회원탈퇴됩니다.<br>
	         ===========================================<br>
	         위의 약관에 동의하시겠습니까?
	         
	         <input type="radio" name="agree" value="YES">예
	         <input type="radio" name="agree" value="NO">아니요
	         <input type="submit" value="전송">
		</fieldset>
	</form>
</body>
</html>