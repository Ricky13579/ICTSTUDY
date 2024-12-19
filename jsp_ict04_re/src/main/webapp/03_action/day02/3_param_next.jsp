<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String genre = request.getParameter("kind");
		String review = request.getParameter("review");
		int score = Integer.parseInt(review);
		
		if(genre.equals("R")){
			genre = "로맨스";
		}
		else if(genre.equals("A")){
			genre = "액션";
		}
		else if(genre.equals("C")){
			genre = "코미디";
		}
		else if(genre.equals("H")){
			genre = "호러";
		}
		else if(genre.equals("M")){
			genre = "뮤지컬";
		}
		else {
			genre = "공상과학";
		}
		
		
		switch(score){
			case 1:
				review = "별로";
				break;
			case 2:
				review = "그저 그래요";
				break;
			case 3:
				review = "보통";
				break;
			case 4:
				review = "좋아요";
				break;
			case 5:
				review = "매우 좋아요";
				break;
			default:
				break;
		}
	%>
	   <tr>
       		<th>장르</th>
       		<td><%= genre %></td>
       </tr>
	   <tr>
       		<th>평점</th>
       		<td><%= review %></td>
       </tr>
</body>
</html>