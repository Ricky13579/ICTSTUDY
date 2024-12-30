<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="useBean.MemberInfo" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forEach - 매우중요</title>
</head>
<body>
	<%
		List<MemberInfo> list = new ArrayList<MemberInfo>();
		MemberInfo info1 = new MemberInfo();
		MemberInfo info2 = new MemberInfo();
		String viewPage = "7_next.jsp";
		
		info1.setId("mj");
		info1.setPassword("mj1234");
		info1.setName("지명준");
		info1.setAddress("서울");
		info1.setEmail("mj@naver.com");
		info1.setRegisterDate(new Date());
		list.add(info1);
		
		info2.setId("iu");
		info2.setPassword("iu1234");
		info2.setName("아이유");
		info2.setAddress("마포");
		info2.setEmail("iu@naver.com");
		info2.setRegisterDate(new Date());
		list.add(info2);
		
		request.setAttribute("members", list);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	%>
</body>
</html>