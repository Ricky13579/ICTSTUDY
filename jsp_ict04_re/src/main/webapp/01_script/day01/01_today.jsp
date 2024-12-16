<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>하루를 나누는 기준</title>
</head>
<body>
	<%
		Date today = new Date();
		int hour = today.getHours();
		int minute = today.getMinutes();
		int second = today.getSeconds();
	%>
	<%
		if(hour >= 0 && hour <= 2){
			out.print("지금 시간은 밤 " + hour + "시 " + minute + "분 " + second + "초입니다.");
		} 
		else if(hour >= 3 && hour <= 5){
			out.print("지금 시간은 새벽 " + hour + "시 " + minute + "분 " + second + "초입니다.");
		}
		else if(hour >= 6 && hour <= 9){
			out.print("지금 시간은 아침 " + hour + "시 " + minute + "분 " + second + "초입니다.");
		}
		else if(hour >= 10 && hour <= 16){
			out.print("지금 시간은 낮 " + hour + "시 " + minute + "분 " + second + "초입니다.");
		}
		else if(hour >= 17 && hour <= 20){
			out.print("지금 시간은 저녁 " + hour + "시 " + minute + "분 " + second + "초입니다.");
		}
		else if(hour >= 21 && hour <= 23){
			out.print("지금 시간은 밤 " + hour + "시 " + minute + "분 " + second + "초입니다.");
		}
	%>
</body>
</html>