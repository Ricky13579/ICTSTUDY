<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현식 활용</title>
</head>
<body>
	<%
		// 현재시간
		Date date = new Date();
		int hours = date.getHours();
		int minutes = date.getMinutes();
		int seconds = date.getSeconds();
		
	%>
	<%
		if(hours < 12)
		{
			out.print("오전 " + hours + "시 "+minutes+"분 "+seconds+"초");
		}
		else if(hours == 12)
		{
			out.print("낮 " + hours + "시 "+minutes+"분 "+seconds+"초");
		}
		else
		{
			out.print("오후 " + (hours-12) + "시 "+minutes+"분 "+seconds+"초");
		}
	%>
	<hr>
	<!-- 3항 연산자 => 결과 = (조건식) ? 참값 : 거짓값 -->
	<%=
		(hours < 12) ? "오전" : hours == 12 ? "낮" : "오후"
	%>
	<hr>
	<%! 
		public int getBigNumber(int a, int b){
			int big = (a > b) ? a : b;
			return big;
		}
	%>
	<%= "둘 중 큰 수는 : " +getBigNumber(3, 5) %>
	
</body>
</html>