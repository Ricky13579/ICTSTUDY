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
		int stdNo = 101;
		String stdName = "홍길동";
		int stdAge = 25;
		int kor = 90;
		int eng = 80;
		int math = 70;
	%>
		<table border="1" style="border-collapse: collapse;" cellspacing="0" cellpadding="10">
			<tr>
				<th>변수</th>
				<th>값</th>
			</tr>
			<tr>
				<td>학생번호</td>
				<td><% out.print(stdNo + "번"); %></td>
			</tr>
			<tr>
				<td>학생이름</td>
				<td><% out.print(stdName); %></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><% out.print(stdAge + "세"); %></td>
			</tr>
			<tr>
				<td>국어점수</td>
				<td><% out.print(kor + "점"); %></td>
			</tr>
			<tr>
				<td>영어점수</td>
				<td><% out.print(eng + "점"); %></td>
			</tr>
			<tr>
				<td>수학점수</td>
				<td><% out.print(math + "점"); %></td>
			</tr>
		</table>
</body>
</html>