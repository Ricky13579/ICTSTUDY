<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정 처리 페이지</title>
</head>
<body>
	<%
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "jdbc";
		String pwd = "12345";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String username = request.getParameter("userName");
		String userpwd = request.getParameter("userPwd");
		String useremail = request.getParameter("userEmail1") + "@" + request.getParameter("userEmail2");
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, id, pwd);
			String sql = "UPDATE guest "+
						 "SET user_name = ?, user_pw = ?, "+
						 "user_email = ? WHERE user_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, userpwd);
			pstmt.setString(3, useremail);
			pstmt.setString(4, (String)session.getAttribute("SID"));
			if(pstmt.executeUpdate() == 1){
				response.sendRedirect("main.jsp");
			}
			else{
				response.sendRedirect("updateInfo.jsp");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	%>
</body>
</html>