<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 - JDBC</title>
</head>
<body>
	<body>
	<!-- 
			JDBC(Java DataBase Connectivity)
		   - 자바에서 데이터베이스와 통신할 때 사용하는 API
		   - DBMS와의 통신을 담당하는 자바클래스   
		   - ojdbc6.jar 파일 필요 => WEB-INF/lib
	 -->
	 <h3>Member 정보</h3>
	 <table border="1" cellspacing="0" cellpadding="5">
	 	<tr>
	 		<th>id</th>
	 		<th>password</th>
	 		<th>gender</th>
	 		<th>email</th>
	 		<th>address</th>
	 	</tr>
	 <%
	 	String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott_04";
		String pwd = "tiger";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String sql = "SELECT * "+
						 "FROM jdbc_member_tb1 "+
						 "ORDER BY id";
			
			con = DriverManager.getConnection(url, id, pwd);
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				String id1 = rs.getString("id");
				String pwd1 = rs.getString("password");
				String gender1 = rs.getString("gender");
				String email1 = rs.getString("email");
				String address1 = rs.getString("address");
			
	%>
		<tr>
			<td><%= id1 %></td>
			<td><%= pwd1 %></td>
			<td><%= gender1 %></td>
			<td><%= email1 %></td>
			<td><%= address1 %></td>
		</tr>
	<%
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
	 </table>
</body>
</html>