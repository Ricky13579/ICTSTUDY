<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정 페이지</title>
<link rel="stylesheet" href="../css/join.css">
<script type="text/javascript" src="../js/join_email.js"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
	<jsp:include page="header.jsp" />
	<h3>회원가입 페이지</h3>
	<hr>
	<form action="updateDAOImpl.jsp" action="post" name="frm">
		<table border="1" cellspacing="0" cellpadding="10">
			<tr>
				<th>
					<label for="user_name">이름</label>
				</th>
				<td>
					<input type="text" id="user_name" name="userName" size="30" required autofocus>
				</td>
			</tr>
			<tr>
				<th>
					<label for="user_id">아이디</label>
				</th>
				<td>
					<input type="text" id="user_id" name="userID" size="30" required autofocus disabled>
				</td>
			</tr>
			<tr>
				<th>
					<label for="user_pwd">비밀번호</label>
				</th>
				<td>
					<input type="password" id="user_pwd" name="userPwd" size="30" required>
				</td>
			</tr>
			<tr>
				<th>
					<label for="user_email">이메일</label>
				</th>
				<td>
					<input type="text" id="user_email" name="userEmail1" size="10" required>
					@
					<input type="text" id="user_email" name="userEmail2" size="10" required>
					<select name="userEmail3" onchange="emailChk()">
						<option value="text">직접입력</option>
						<option value="naver.com">네이버</option>
						<option value="daum.net">다음</option>
						<option value="google.com">구글</option>
						<option value="nate.com">네이트</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<div align="center">
						<input type="submit" value="회원수정">
						<input type="reset" value="초기화">
					</div>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>