<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<jsp:useBean id="member" class="useBean.MemberInfo" />
<%-- <jsp:useBean id="자바빈이름" class="패키지명.클래스명" /> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>useBean 액션태그로 객체 생성</title>
</head>
<body>
	<!-- 2. setProperty -->
	<jsp:setProperty name="member" property="id" value="mj"/>
	<jsp:setProperty name="member" property="password" value="mj1234"/>
	<jsp:setProperty name="member" property="name" value="지명준"/>
	<jsp:setProperty name="member" property="address" value="서울"/>
	<jsp:setProperty name="member" property="email" value="mj@mail.com"/>
	<jsp:setProperty name="member" property="registerDate" value="<%= new Date() %>"/>
	
	<h4>useBean 액션태그로 가져와서 출력한 경우</h4>
	아이디 : <jsp:getProperty name="member" property="id"/><br>
	비밀번호 : <jsp:getProperty name="member" property="password"/><br>
	이름 : <jsp:getProperty name="member" property="name"/><br>
	주소 : <jsp:getProperty name="member" property="address"/><br>
	이메일 : <jsp:getProperty name="member" property="email"/><br>
	등록일 : <jsp:getProperty name="member" property="registerDate"/><br>
</body>
</html>