<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장객체 - request 객체(매우 중요!!!)</title>
</head>
<body>
	<h3>내장객체 - request 객체</h3>
	
	<form action="2_el_next.jsp" method="get" name="userform">
		<table border="1" cellspacing="0" cellpadding="10">
			<tr>
				<th align="right">아이디 : </th>
				<td><input type="text" name="user_id" size="30"></td>
			</tr>
			<tr>
				<th align="right">비밀번호 : </th>
				<td><input type="password" name="user_pwd" size="30"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<br><br>
					<div>
						<input type="submit" value="전송">
						<input type="reset" value="취소">
					</div>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>