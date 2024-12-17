<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Attribute 예제 - 중요</title>
</head>
<body>
	<h3>Attribute 예제</h3>
	
	<!-- 
      // request.getParameter(input명) => 화면(jsp)에서 넘겨진 값을 MVC(서비스)로 받을 때
      // request.setAttribute(key, value);   // 결과를 서비스에서 설정해서 JSP로 보낼때
      // request.getAttribute(key);   // 화면(jsp)에서 그 결과를 받는다.
      
      // 속성설정
      request.setAttribute("속성명", 속성값);  
      request.setAttribute(String 속성명, Object 속성값);
      
      // 속성값 가져오기
      Object 속성값 = request.getAttribute(String 속성명);   // 리턴타입은 Object 형
      
      // 속성삭제
       request.removeAttribute("속성명");  
    -->
    <%
    	Calendar calendar = Calendar.getInstance();
    	
    	// 속성 설정
    	request.setAttribute("time", calendar);
    %>
    
    <%-- <jsp:forward page="결과페이지"/> 
    	=> url은 바뀌지 않고, next 페이지의 결과를 보여준다.
    		jsp 문법에 대한 주석이므로 jsp 형태에 맞게 주석처리를 해야한다.
    --%>
    <jsp:forward page="3_request_next.jsp"/>
</body>
</html>