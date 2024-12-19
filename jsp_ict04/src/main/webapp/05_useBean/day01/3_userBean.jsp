<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="3_userBean_next.jsp" method="post" name="form">
		<table>
			<tr>
				<th align="right">
					<label for="user_id">아이디:</label>
				</th>
				<td>
					<input type="text" size="30" id="user_id" name="id" required autofocus>
				</td>
			</tr>
			<tr>
				<th align="right">
					<label for="user_pwd">비밀번호:</label>
				</th>
				<td>
					<input type="password" size="30" id="user_pwd" name="password" required>
				</td>
			</tr>
			<tr>
				<th align="right">
					<label for="user_name">이름:</label>
				</th>
				<td>
					<input type="text" size="30" id="user_name" name="name" required>
				</td>
			</tr>
			<tr>
				<th align="right">
					<label for="user_address">주소:</label>
				</th>
				<td>
					<input type="text" size="30" id="user_address" name="address" required>
				</td>
			</tr>
			<tr>
				<th align="right">
					<label for="user_email">이메일:</label>
				</th>
				<td>
					<input type="email" size="30" id="user_email" name="email" required>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<div align="center">
						<input type="submit" value="전송">
						<input type="reset" value="취소">
					</div>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>