<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
</head>
<body>
	<form action="2_include_file.jsp" method="get">
		<table border="1" style="border-collapse: collapse">
			<tr>
				<td align="right">이름</td>
				<td><input type="text" name="user_name" size="20"></td>
			</tr>
			<tr>
				<td align="right">나이</td>
				<td><input type="text" name="user_age" size="3"></td>
			</tr>
			<tr>
				<td align="right">전화번호</td>
				<td><input type="text" name="user_hp" size="15"></td>
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