<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="useBean.MemberInfo" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바빈을 이용한 객체생성</title>
</head>
<body>
	<h3>자바빈을 이용한 객체생성</h3>
	
	<%
		// 1. MemberInfo 클래스 인스턴스 생성
		MemberInfo dto = new MemberInfo();
		
		// 2. setter로 값 전달(멤버변수로 값 전달하기 위함)
		dto.setId("mj");
		dto.setPassword("mj1234");
		dto.setName("지명준");
		dto.setAddress("서울");
		dto.setEmail("mj@mail.com");
		dto.setRegisterDate(new Date());
		
		// 3. 출력 => 방법1. out 객체를 이용하여 getter로 출력
		out.print("[ 방법1. out 객체를 이용하여 getter로 출력]"+"<br>");
		out.print("아이디 : " + dto.getId() + "<br>");
		out.print("비밀번호 : " + dto.getPassword() + "<br>");
		out.print("이름 : " + dto.getName() + "<br>");
		out.print("주소 : " + dto.getAddress() + "<br>");
		out.print("이메일 : " + dto.getEmail() + "<br>");
		out.print("등록일 : " + dto.getRegisterDate() + "<br>");
		
		request.setAttribute("info" , dto);
	%>
		<hr>
		<br>
	<%
		MemberInfo info2 = (MemberInfo)request.getAttribute("info");
		out.print("Attribute로 출력"+"<br>");
		out.print(info2.toString() + "<br>");
	%>
</body>
</html>