<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 가능 여부 확인 페이지</title>
</head>
<body>
	<%-- 로그인하면서 아이디와 비밀번호를 체크하는 페이지 --%>
	<%
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "jdbc";
		String pwd = "12345";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String userid = request.getParameter("user_id");
		String userpwd = request.getParameter("user_pwd");
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, id, pwd);
			String sql = "SELECT * FROM guest "+
						 "WHERE user_id = ? "+
						 "AND user_pw = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, userpwd);
			rs = pstmt.executeQuery();
			if(rs.next()){
				session.setAttribute("SID", userid);
				response.sendRedirect("main.jsp");
			}
			else{
				response.sendRedirect("join.jsp");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	%>
</body>
</html>