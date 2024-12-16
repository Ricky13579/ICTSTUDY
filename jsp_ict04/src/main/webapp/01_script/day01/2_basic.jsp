<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트 요소 => 중요</title>
</head>
<body>
	<h3> 스크립트 요소 </h3>
   <b> 1. 스크립트릿 - 자바코드를 삽입 </b><br>
   
   - HTML 태그안에 JAVA 코드를 삽입<br><br>
   
   <%--
       <%
         자바코드1;
         자바코드2;
      %> 
   --%>
   
   <% 
	   	String name = "지명준"; 
   		int age = 25;	
   		String id = "mj";
   		String password = "mj123";
   		
   		// out : 내장객체, 서블릿으로 변환시 컴파일 시점에 자동으로 객체 생성
	   	out.print("== 1. 실행결과(스트립트릿) ==" + "<br>"); 
	    out.print("이름 : " + name + "<br>");
	    out.print("나이 : " + age + "<br>");
	    out.print("아이디 : " + id + "<br>");
	    out.print("비밀번호 : " + password + "<br>");
   %>
   
	
   <br><br>
   <hr>
   <br><br>
   <b> 2. 표현식(Expression) </b><br>
   - 값을 출력한다. 값은 변수나 메서드가 올수 있다.<br>
   - 문장의 끝에 ';'을 붙이면 에러 발생<br>
   - 스크립트 안에서는 out.print(); 사용가능<br>
   
   <%-- <%= 출력문 %> --%>
   == 2. 실행결과(Expression) ==<br>
   이름 : <%= name %><br>
   나이 : <%= age %><br>
   id : <%= id %><br>
   password : <%= password %><br>
   

   
   <br><br>
	
	
   <br><br>
   <hr>
   <br><br>
   <b> 3. 선언부(Declaration) </b>
   - 변수, 자바메소드를 선언한다.<br>
   <%--    
      <%!
         public 반환형 메서드명(매개변수) {
            자바코드1;
            자바코드2;
         }
      %>
   --%>
   
   <%!
   public int divide(int a, int b) {
       return a / b;
    }
   %>
   
   == 실행결과 ==<br>
   8 / 4 = <%= divide(8, 4) %><br>;
</body>
</html>