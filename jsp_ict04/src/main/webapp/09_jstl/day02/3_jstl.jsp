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
	<h3>JSTL(JSP Standard Tag Library) - core 태그 - if</h3>
   
   <%--
      <c:if test="조건"  var="변수명"   [scope="범위"]>
       ..
       </c:if>
    --%>
    <c:if test="${true}">
    	조건식이 true이므로 무조건 수행
    </c:if>
    
    <c:if test="${false}">
    	조건식이 false이므로 무조건 수행안함
    </c:if>
    <br>
    <%--
      쿼리스트링 => http://localhost/jsp_ict04/09_jstl/day02/3_jstl.jsp?name=hong&age=30&kind=soju
      쿼리스트링으로 URL 실행 =>
      쿼리스트링 => http://localhost/jsp_ict04/09_jstl/day02/3_jstl.jsp?name=hong&age=30&kind=soju
     --%> 
  
  	<c:if test="${param.name == 'hong'}">
  		이름: ${param.name}
  	</c:if><br>
  	
  	<c:if test="${param.age == '30'}">
  		나이: ${param.age}세
  	</c:if><br>
  	
  	<c:if test="${param.kind == 'soju'}">
  		종류: ${param.kind}
  	</c:if><br>
  	
  	<c:if test="${param.age lt 19}">
  		${param.name}은 ${param.age}세이므로 ${param.kind}를 살 수 없습니다.
  	</c:if>
</body>
</html>