<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현식을 활용(배열)</title>
</head>
<body>
	<%!
		String[] dreams = {"취업", "개발자", "돈 많은 백수", "건물주", "프리미어리그 직관"};
	%>
	<table border="1" cellspacing="0" cellpadding="10">
		<tr>
			<th>번호</th>
			<th>꿈</th>
		</tr>
		<% 
			for(int i = 0; i < dreams.length; i++){ 
		%>
			<tr>
				<td><%= i+1 + "번" %></td>
				<td><%= dreams[i] %></td>
			</tr>
		<% 
			} 
		%>
	</table>

	<table border="1" cellspacing="0" cellpadding="10">
		<tr>
			<th>번호</th>
			<th>꿈</th>
		</tr>
		<%
			for(int i = 0; i < dreams.length; i++){
				out.print("<tr><td>" + (i+1)+ "번</td><td>"+ dreams[i] +"</td></tr>");
			}
		%>
	</table>
</body>
</html>