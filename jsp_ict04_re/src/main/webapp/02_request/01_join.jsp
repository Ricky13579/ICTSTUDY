<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 연습</title>
</head>
<body>
	<form action="01_join_result.jsp" method="get" name="form">
		<table border="1" cellspacing="0" cellpadding="10">
			<tr>
				<td align="right">아이디</td>
				<td><input type="text" name="id" size="30"></td>
			</tr>
			<tr>
				<td align="right">비밀번호</td>
				<td><input type="password" name="pwd" size="30"></td>
			</tr>
			<tr>
				<td align="right">이메일</td>
				<td><input type="email" name="email" size="30"></td>
			</tr>
			<tr>
				<td align="right">전화번호</td>
				<td><input type="text" name="phone" size="30"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<div>
					<br>
						<input type="submit" value="전송">
						<input type="reset" value="취소">
					</div>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>