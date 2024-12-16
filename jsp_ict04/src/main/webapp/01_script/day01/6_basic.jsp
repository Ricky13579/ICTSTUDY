<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 출력</title>
</head>
<body>
<!-- 
구구단
==2단==
2   *   1   =   2
2   *   2   =   4
2   *   3   =   6
2   *   4   =   8
2   *   5   =   10
2   *   6   =   12
2   *   7   =   14
2   *   8   =   16
2   *   9   =   18
==3단==
3   *   1   =   3
3   *   2   =   6
3   *   3   =   9
3   *   4   =   12
3   *   5   =   15
3   *   6   =   18
3   *   7   =   21
3   *   8   =   24
3   *   9   =   27
-->
	<table border="1" cellspacing="0" cellpadding="10">
		<tr>
			<th>구구단(for)</th>
		</tr>
		<%
			for(int i = 2; i <= 9; i++){
		%>
		<tr>
			<th>
				<%= 
					"=== " + i + "단" + " ==="
				%>
			</th>
		</tr>
		<%
			for(int j = 1; j <= 9; j++){
		%>
			<tr>
				<td>
					<%= i %> * <%= j %> = <%= i*j %>
				</td>
			</tr>
		<%
			}
		%>
		<%
			}
		%>
	</table>
	
	<table border="1" cellspacing="0" cellpadding="10">
		<tr>
			<th colspan="5">구구단(while)</th>
		</tr>
		<%
			int i = 2;
			while(i <= 9){
		%>
		<tr>
			<th colspan="5">
				<%= 
					"=== " + i + "단" + " ==="
				%>
			</th>
		</tr>
		<%
			int j = 1;
			while(j <= 9){
		%>
			<tr>
				<td>
					<%= i %> * <%= j %> = <%= i*j %>
				</td>
			</tr>
			<% 
				j++; 
			%>
		<%
			}
		%>
		<%
			i++;
		%>
		<%
			}
		%>
	</table>
</body>
</html>