<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>약관동의 화면</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		
		String strId = request.getParameter("user_id");
		String strPwd = request.getParameter("user_password");
		String strName = request.getParameter("user_name");
		
		session.setAttribute("session_id", strId);
		session.setAttribute("session_pwd", strPwd);
		session.setAttribute("session_name", strName);
		
		out.print("== 회원정보 출력 =="+"<br>");
		out.print("아이디 : "+strId+"<br>");
		out.print("비밀번호 : "+strPwd+"<br>");
		out.print("이름 : "+strName+"<br>");
	%>
	<br>
	<form action="3_signIn.jsp" method="post">
		<fieldset>
			<legend>회원약관</legend>
			 ===========================================<br>
	         1. 회원정보는 웹사이트의 운영정보를 위해서만 사용됩니다.<br>
	         2. 웹사이트의 정상운영을 방해하는 회원은 회원탈퇴됩니다.<br>
	         ===========================================<br>
	         위의 약관에 동의하시겠습니까?
	         
	         <input type="radio" name="agree" value="YES">동의함
	         <input type="radio" name="agree" value="NO">동의안함
	         <input type="submit" value="전송">
		</fieldset>
	</form>
</body>
</html>