<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>action - param</title>
</head>
<body>
	<table border="1" cellspacing="0" cellpadding="10">
		<tr>
			<th>영화제목</th>
			<td>겨울왕국</td>
		</tr>
		<tr>
			<th>상영관</th>
			<td>롯데시네마</td>
		</tr>
		<!-- 
	      쟝르 : param name="kind" 
	                  [ value="M" ] => R:로맨스 | A:액션 | C:코미디 | H : 호러 | M : 뮤지컬 | SF : 공상과학
	      리뷰 : param name="review"
	                  [ value="1" ] => 1: 별로 | 2: 그저그래요 | 3 : 보통 | 4: 좋아요 | 5: 매우좋아요 
       --> 
       <jsp:include page="3_param_next.jsp">
       		<jsp:param value="M" name="kind"/>
       		<jsp:param value="1" name="review"/>
       </jsp:include>
       
       <jsp:include page="3_param_next.jsp">
       		<jsp:param value="SF" name="kind"/>
       		<jsp:param value="5" name="review"/>
       </jsp:include>
       
	</table>
</body>
</html>