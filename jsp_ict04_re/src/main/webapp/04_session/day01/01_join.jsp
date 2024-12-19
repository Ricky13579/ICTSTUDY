<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="01_confirm.jsp" method="post">
	<fieldset>
		<legend>회원가입</legend>
		<table border="1" style="border-collapse: collapse">
			<tr>
				<td align="right">아이디</td>
				<td><input type="text" name="user_id" size="30" autofocus required placeholder="아이디 입력"></td>
			</tr>
			<tr>
				<td align="right">비밀번호</td>
				<td><input type="password" name="user_password" size="30" required placeholder="비밀번호 입력"></td>
			</tr>
			<tr>
				<td align="right">이름</td>
				<td><input type="text" name="user_name" size="15" required placeholder="이름 입력"></td>
			</tr>
			<tr>
				<div align="center">
					<br><br>
					<td colspan="2" align="center">
						<input type="submit" value="전송">
						<input type="reset" value="취소">
					</td>
				</div>
			</tr>
		</table>
	</fieldset>
</form>
</body>
</html>