<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 처리 페이지</title>
</head>
<body>
	<%
		String strAgree = request.getParameter("agree");
		out.print("strAgree : " + strAgree + "<br>");
		
		String result = "";
		
		// 동의한 경우
		if(strAgree.equals("YES"))
		{
			String s_id = (String)session.getAttribute("session_id");
			String s_pwd = (String)session.getAttribute("session_pwd");
			String s_name = (String)session.getAttribute("session_name");
			
			out.print("아이디 : " + s_id + "<br>");
			out.print("비밀번호 : " + s_pwd + "<br>");
			out.print("이름 : " + s_name + "<br>");
			
			// 톰캣 기본 경로 : C:\apache-tomcat-9.0.97 \wtpwebapps
	       // 나머지 세션 저장 경로 : \jsp_ict04\WEB-INF\저장한 이름.txt
	       // C:\apache-tomcat-9.0.97\wtpwebapps\jsp_ict04\WEB-INF
		         
	       /*
	        1) 톰캣환경 설정(톰캣 더블클릭) : Server Locations > 2번째 옵션 선택
	         Server Options > 2,3번째 옵션이 선택되어 있어야 위 경로로 설정됨
	         server path ==>  C:\apache-tomcat-9.0.97      deploy path ==> wtpwebapps
	        */
	         // cf) 톰캣 기본경로 :D:\Dev\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp번호

			// 서버에 저장
			PrintWriter writer = null;
	        
	         try{
	        	 String filepath = application.getRealPath("/WEB-INF/"+s_name+".txt");
	        	 writer = new PrintWriter(filepath);
	        	 
	        	 writer.println("=== 세션 정보 ===");
	        	 writer.println("세션 아이디 : "+ session.getId());
	        	 writer.println("최초 세션 생성 시각 : " + new Date(session.getCreationTime()));
	        	 writer.println("최초 세션 접근 시각 : " + new Date(session.getLastAccessedTime()));
	        	 writer.println("최초 세션 유효 시각 : " + session.getMaxInactiveInterval());
	        	 session.setMaxInactiveInterval(10 * 60); // 세션 유효시간 설정
	        	 writer.println("세션 유효 시간 : " + session.getMaxInactiveInterval());
	        	 
	        	 if(session.isNew()){
	        		 writer.println("새 세션이 생성되었습니다!!");
	        	 }
	        	 
	        	 writer.println("=== 가입 정보 ===");
	        	 writer.println("아이디 : " + s_id);
	        	 writer.println("비밀번호 : " + s_pwd);
	        	 writer.println("이름 : " + s_name);
	        	 
	        	 result = "SUCCESS";
	         }catch(IOException e){
	        	 result = "FAIL";
	         }finally{
	        	 try{
	        		 writer.close();
	        	 }catch(Exception e){
	        		 e.printStackTrace();
	        	 }
	         }
		}
		/* 
			=== 세션 정보 ===
			세션 아이디 : A38C6BA1D7A529E1DE2AC0FB79FF664D
			최초 세션 생성 시각 : Wed Dec 18 14:22:51 KST 2024
			최초 세션 접근 시각 : Wed Dec 18 14:34:45 KST 2024
			최초 세션 유효 시각 : 1800
			세션 유효 시간 : 600
			=== 가입 정보 ===
			아이디 : mj
			비밀번호 : mj1234
			이름 : 지명준
		*/

		out.print("result : " + result);
		
		// 세션 종료
		session.invalidate();
		// 쿼리스트링 => get방식으로 url 표현
		response.sendRedirect("4_result.jsp?result="+result);
	%>
	
</body>
</html>