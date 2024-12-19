<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String agree = request.getParameter("agree");
		String result = "";
		if(agree.equals("YES"))
		{	
			String sid = (String)request.getAttribute("sid");
			String spw = (String)request.getAttribute("spw");
			String sname = (String)request.getAttribute("sname");
			
			out.print("=== 결과 ===" + "<br>");
			out.print("sid : " + sid + "<br>");
			out.print("spw : " + spw + "<br>");
			out.print("sname : " + sname + "<br>");
			
			PrintWriter writer = null;
			try
			{
				String path = application.getRealPath("WEB-INF/" + sname + ".txt");
				writer = new PrintWriter(path);
				
				writer.println("=== 세션 정보 ===");
				writer.println("세션 id : " + session.getId());
				writer.println("세션 최초 생성 시간 : " + new Date(session.getCreationTime()));
				writer.println("세션 최초 접속 시간 : " + new Date(session.getLastAccessedTime()));
				writer.println("세션 최초 유효 시간 : " + session.getMaxInactiveInterval());
				session.setMaxInactiveInterval(60 * 10); // 10분
				writer.println("세션 유효 시간 : " + session.getMaxInactiveInterval());
				
				if(session.isNew()){
					 writer.println("새 세션이 생성되었습니다!!");
				}
				
				writer.println("=== 가입 정보 ===");
				writer.println("아이디 : " + sid);
				writer.println("비밀번호 : " + spw);
				writer.println("이름 : " + sname);
				result = "complete";
			}catch(Exception e){
				result = "fail";
			}finally{
				try
				{
					writer.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		session.invalidate();
		
		response.sendRedirect("01_result.jsp?result="+result);
	%>
</body>
</html>