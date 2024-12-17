<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>액션태그 - include</title>
</head>
<body>
	<h3>액션태그 - include</h3>
	action 태그란 jsp 페이지에서 어떤 동작을 하도록 하는 태그이다.<br><br>
	
	<%--
		문법 : <jsp:액션태그 />
		ex) <jsp:include page="포함할 페이지"/>
	 --%>
	
	액션태그 종류 : include, forward, param, ... <br><br>
	
	<table width="600" border="1" cellspacing="0" cellpadding="10">
		<tr>
			<td colspan="2">
				<jsp:include page="1_header.jsp" />
			</td>
		</tr>
		<tr>
			<td width="150" valign="top">
				<jsp:include page="1_left.jsp" />
			</td>
			<td width="300" valign="top">
				메인 레이아웃<br><br>
				로그인<br>
				<img src="../images/pic3.jpg" width="400px">
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<jsp:include page="1_footer.jsp" />
			</td>
		</tr>
	</table>
	
</body>
</html>