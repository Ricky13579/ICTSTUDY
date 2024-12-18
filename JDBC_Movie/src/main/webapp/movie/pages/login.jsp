<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" href="../css/login.css">
</head>
<body>
	<jsp:include page="header.jsp" />
	<h3>로그인 페이지</h3>
	<hr>
	<form action="loginDAOImpl.jsp" method="post" name="frm">
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<td>
					<input type="text" placeholder="아이디" name="user_id" required autofocus size="30">
				</td>
			</tr>
			<tr>
				<td>
					<input type="password" placeholder="비밀번호" name="user_pwd" required size="30">
				</td>
			</tr>
			<tr>
				<td>
					<div align="center">
						<input type="submit" value="로그인">
					</div>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>