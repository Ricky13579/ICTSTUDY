<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<jsp:useBean id="info" class="useBean.MemberInfo" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보 출력</title>
<script>
	function goHtml(){
		window.location.href = "3_userBean.jsp";
	}
</script>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	
		String id = request.getParameter("userID");
		String pwd = request.getParameter("userPwd");
		String name = request.getParameter("userName");
		String address = request.getParameter("userAddress");
		String email = request.getParameter("userEmail");
	%>
		<%-- <jsp:setProperty name="info" property="id" value="<%= id %>" />
		<jsp:setProperty name="info" property="password" value="<%= pwd %>" />
		<jsp:setProperty name="info" property="name" value="<%= name %>" />
		<jsp:setProperty name="info" property="address" value="<%= address %>" />
		<jsp:setProperty name="info" property="email" value="<%= email %>" />
		<jsp:setProperty name="info" property="registerDate" value="<%= new Date() %>" /> --%>
		
		<jsp:setProperty name="info" property="*" />
		<jsp:setProperty name="info" property="registerDate" value="<%= new Date() %>"/>
		
		<table border="1" cellspacing="0" cellpadding="10">
			<tr>
				<th>
					아이디
				</th>
				<td>
					<jsp:getProperty name="info" property="id" /><br>
				</td>
			</tr>
			<tr>
				<th>
					비밀번호
				</th>
				<td>
					<jsp:getProperty name="info" property="password" /><br>
				</td>
			</tr>
			<tr>
				<th>
					이름
				</th>
				<td>
					<jsp:getProperty name="info" property="name" /><br>
				</td>
			</tr>
			<tr>
				<th>
					주소
				</th>
				<td>
					<jsp:getProperty name="info" property="address" /><br>
				</td>
			</tr>
			<tr>
				<th>
					이메일
				</th>
				<td>
					<jsp:getProperty name="info" property="email" /><br>
				</td>
			</tr>
			<tr>
				<th>
					등록일
				</th>
				<td>
					<jsp:getProperty name="info" property="registerDate" /><br>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<div align="center">
						<input type="button" value="처음으로" onclick="goHtml()">
					</div>
				</td>
			</tr>
		</table>
</body>
</html>