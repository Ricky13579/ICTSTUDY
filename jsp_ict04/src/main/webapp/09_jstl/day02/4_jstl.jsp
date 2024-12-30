<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>JSTL(JSP Standard Tag Library) - core 태그 - choose</h3>
   
   <%--
      <c:choose>
      
         <c:when test="조건">
            ..
         </c:when>
         <c:when test="조건">
            ..
         </c:when>
         <c:otherwise>
            ..
         </c:otherwise>   
      
       </c:choose>
    --%>
    
    <!-- 쿼리스트링 => http://localhost/jsp_ict04/09_jstl/day02/4_jstl.jsp?num=3 -->
     
    <!--  num이 1: 처음뵙겠습니다. 2: 두번째 뵙겠습니다. 3 : 세번째 뵙겠습니다.  그외 : 지겹네요 -->
    <c:choose>
    	<c:when test="${param.num eq 1}">
    		처음 뵙겠습니다.
    	</c:when>
    	<c:when test="${param.num eq 2}">
    		두번째 뵙겠습니다.
    	</c:when>
    	<c:when test="${param.num == 3}">
    		세번째 뵙겠습니다.
    	</c:when>
    	<c:otherwise>
    		지겹네요.
    	</c:otherwise>
    </c:choose>
    
</body>
</html>