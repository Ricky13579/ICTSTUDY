<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상단 메뉴 바</title>
<link href="../css/header.css" rel="stylesheet">
<script type="text/javascript" src="../js/header.js"></script>
</head>
<body>
	<%
		String id = (String)session.getAttribute("SID");
	%>
	<div class="menu">
		<div class="user_menu">
			<img src="http://img.cgv.co.kr/R2014/images/common/logo/logoRed.png" onclick="goHome()">
			<ul>
				<%
					if(id == null){
				%>
				<li>
					<a href="login.jsp">
						<img src="../icons/login.png" id="icon">
					</a><br>
					<span>로그인</span>
				</li>
				<li>
					<a href="join.jsp">
						<img src="../icons/join.png" id="icon">
					</a><br>
					<span>회원가입</span>
				</li>
				<%
					}
					else
					{
				%>
				<li>
					<a href="updateInfo.jsp">
						<img src="../icons/update.png" id="icon">
					</a><br>
					<span>정보수정</span>
				</li>
				<li>
					<a href="mypage.jsp">
						<img src="../icons/mycgv.png" id="icon">
					</a><br>
					<span>MY CGV</span>
				</li>
				<li>
					<a href="logout.jsp">
						<img src="../icons/logout.png" id="icon">
					</a><br>
					<span>로그아웃</span>
				</li>
				<%
					}
				%>
			</ul>
		</div>
		<div class="movie_menu">
			<div class="movie_contents">
				<a href="">영화</a>
				<a href="">극장</a>
				<a href="">예매</a>
			</div>
		</div>
	</div>
</body>
</html>