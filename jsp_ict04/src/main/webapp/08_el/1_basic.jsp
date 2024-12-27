<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현언어(Expression Language)</title>
</head>
<body>

<h2>표현언어(Expression Language)</h2>

<%--	
	1. jstl.jar, standard.jar를 WEB-INF/lib 폴더에 추가한다.<br>
	2. 표현 언어(Expression Language)란 표현식(Expression) 또는 액션태그를 대신해서, 값을 간결하고 편리하게 표현하는 스크립트이다.
	
	(1). 표현식
	 <%= 변수명 %> <%= value %> <%= 메서드명 %> 
	
	   산술연산 : +,-,*,/
	   관계형 : ==, !=, <, >, <=, >=	 
	   조건식 : a > b ? a : b;
	   논리 : &&, ||
	   
	 (2). EL 언어의 내장객체 => ${expr}
	  - param : 웹브라우저의 <form> 태그를 통해 입력된 데이터를 가져올 때 사용하는 내장객체이다.
	  		예) request.getParameter("email"); => param
	  		
	  - 사용방법.. 2-1), 2-4) 중요
	     2-1) param 뒤에 마침표를 찍고, 해당 데이터 이름을 쓰는 방법 : 예) ${param.email}
	     
	   기존
	     <%
	     	String strEmail = request.getParameter("email");
	     %>	     
	     <%=strEmail%>
	     
	  EL
	    => ${param.email}  
	  ----------------------------------------------------------
	 기존 
	   <%
	     	String[] hobby = request.getParameterValues("hobby");
	   %>
	   <%=hobby%>
	    
	 EL
	    => ${paramValues.hobby}  
	    
	    
	    2-2) param 뒤에 대괄호를 하고, 그 안에 작은 따옴표나 큰 따옴표로 데이터이름을 쓰는 방법
	    예) ${param["email"]} 
	    
	    2-3) paramValues : <form> 태그를 통해 똑같은 이름의 데이터가 여러개 입력되는 경우 .. 예) 체크박스
	    => ${paramValues.hobby[인덱스]} .. 인덱스는 0부터 시작
	    	    
	    
	    2-4)  request.setAttribute("키값", value); ==> 서비스에서 JSP로  값 넘김
	              예1) key에 바구니를 담는다 => request.setAttribute("vo", vo); // "vo", 참조변수
	            
	             기존 =>  바구니를 가져온다.
	           <%
	         	CustomerVO vo = (CustomerVO)request.getAttribute("vo"); // "키값"
	           %>
	           <%= vo.getId() %>
	           <%= vo.getPassword() %>
	           
	        EL => getAttribute 사용안함
	              ${키값}	 => ${vo.getId()}	${vo.id}   ${vo.getPassword()} ${vo.password}
	                            
	   ----------------------------------------------------------------------- 
	              예2) key에 바구니를 담는다 => request.setAttribute("vo", clientVO);
	         
	            기존 =>  바구니에서 낱개로 꺼내는 방법
	           <%
	         	CustomerVO vo = (CustomerVO)request.getAttribute("vo");
	           %>	   
	            +   // 바구니에서 값을 꺼내서 출력
	            <%=vo.getId()%> 또는 
	            <%=vo.id%>  // 멤버변수가 private이더라도 접근 가능
	            
	     EL => getAttribute 사용안함
	           ${vo.getId()} 또는 
	           ${vo.id}  // 멤버변수가 private이더라도 접근 가능
	    
	    ------------------------------------------------------------------------- 
	     	예3) request.setAttribute("키", value); ==> 서비스에서 JSP로  값 넘김
	            request.setAttribute("id", strId);
	            
	        기존 => <%	        
	              String id = (String)request.getAttribute("id")
	           %>   
	           + <%=id%>
	           
	     EL => getAttribute 사용안함
	     		${id}  <%-- ${key} --%>
	     
	    ----------------------------------------------------------------------- 
		<%--      
		2-5) 응답영역 => pageSocpe, requestScope, sessionScope, applicationScope, pageContext
		 <%
			request.getSession().setAttribute("sessionID", sessionID);
			%>
			기존
			String id = request.getSession().getAttribute("sessionID");
			<%=id%>
			
			EL => getAttribute 사용안함 
					${sessionScope.sessionID}
			-----------------------------
			<%
			request.setAttribute("selectCnt", selectCnt);
			%>

			int selectCnt = (Integer)request.getAttribute("selectCnt");
			<%=selectCnt%>
			
			EL => getAttribute 사용안함
				${requestScope.selectCnt}  => requestScope는 주로 생략
		--%>
</body>
</html>