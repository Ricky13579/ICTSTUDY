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
	<h3>JSTL(JSP Standard Tag Library) - core 태그 - forTokens 태그 </h3>
   <%--
      <c:forTokens var="변수명" items="문자열" delims="구분자"
         ${변수명}
      </c:forTokens>
      <c:forTokens> 태그는 items로 전달받은 문자열을 구분자를 이용해서 나누고,
         구분한 문자열을 var 속성에 명시한 변수에 전달한다.
      <c:forEach>와 다른점은 <c:forTokens> 태그의 items 저장값이 String이라는 점이다.
   --%>
   
   콤마를 구분하는 예제<br>
   
   무지개색 :
   <c:forTokens var="color" items="red, orange, yellow, green, blue, navy, violet" delims=",">
   		${color}
   </c:forTokens>
</body>
</html>