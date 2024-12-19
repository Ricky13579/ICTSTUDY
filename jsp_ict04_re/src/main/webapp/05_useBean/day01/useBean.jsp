<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="useBean_next.jsp" method="post">
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<th>아이디</th>
				<td><input type="text" name="userID"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="userPwd"></td>
			</tr>
			<tr>
				<th>성별</th>
				<td>
					<input type="radio" name="userGender" value="M">남성
					<input type="radio" name="userGender" value="F">여성
				</td>
			</tr>
			<tr>
				<th>주소</th>
				<td><input type="text" name="userAddress"></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="email" name="userEmail"></td>
			</tr>
			<tr>
				<td colspan="2">
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