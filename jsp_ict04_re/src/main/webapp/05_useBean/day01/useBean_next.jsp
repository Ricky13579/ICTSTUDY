<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="info" class="useBean.JoinInfo"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("userID");
	String pwd = request.getParameter("userPwd");
	String gender = request.getParameter("userGender");
	String address = request.getParameter("userAddress");
	String email = request.getParameter("userEmail");
%>
	<jsp:setProperty property="id" name="info" value="<%= id %>"/>
	<jsp:setProperty property="pwd" name="info" value="<%= pwd %>"/>
	<jsp:setProperty property="gender" name="info" value="<%= gender %>"/>
	<jsp:setProperty property="address" name="info" value="<%= address %>"/>
	<jsp:setProperty property="email" name="info" value="<%= email %>"/>
	
	<table>
		<tr>
			<th>아이디</th>
			<td><jsp:getProperty property="id" name="info"/></td>
		</tr>
		<tr>
			<th>비밀번호</th>
			<td><jsp:getProperty property="pwd" name="info"/></td>
		</tr>
		<tr>
			<th>아이디</th>
			<td><jsp:getProperty property="id" name="info"/></td>
		</tr>
		<tr>
			<th>성별</th>
			<td><jsp:getProperty property="gender" name="info"/></td>
		</tr>
		<tr>
			<th>주소</th>
			<td><jsp:getProperty property="address" name="info"/></td>
		</tr>
		<tr>
			<th>이메일</th>
			<td><jsp:getProperty property="email" name="info"/></td>
		</tr>
	</table>
</body>
</html>