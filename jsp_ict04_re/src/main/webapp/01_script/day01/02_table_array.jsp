<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int[] money = {50000, 10000, 5000, 1000};
		int[] count = {5, 3, 2, 1};
		int total = 0;
	%>
	<table border="1" cellspacing="0" cellpadding="10">
		<tr>
			<th>돈</th>
			<th>장수</th>
		</tr>
		<%
			for(int i = 0; i < count.length; i++){
		%>
				<tr>
					<td><%= money[i]+"원" %></td>
					<td><%= count[i]+"장" %></td>
				</tr>
		<%
			total += money[i] * count[i];
		%>
		<%
			}
		%>
		<tr>
			<td>합계</td>
			<td><%= total+"원" %></td>
		</tr>
	</table>
</body>
</html>