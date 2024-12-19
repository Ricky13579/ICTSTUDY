<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP - 서블릿 연동</title>
</head>
<body>
	<h3>JSP - 서블릿 연동</h3>
	
	<form action="../../MemberServlet" method="get">
		<table border="1" cellspacing="0" cellpadding="5">
			<tr>
				<th align="right">아이디</th>
				<td>
					<input type="text" name="userID" size="20">
				</td>	
			</tr>
			<tr>
				<th align="right">이름</th>
				<td>
					<input type="text" name="userName" size="20">
				</td>	
			</tr>
			<tr>
				<th align="right">이메일</th>
				<td>
					<input type="email" name="userEmail" size="20">
				</td>	
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
	</form>
</body>
</html>