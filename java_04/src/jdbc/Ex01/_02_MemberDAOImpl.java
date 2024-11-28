package jdbc.Ex01;

import java.sql.*;
import java.util.Scanner;

// 인터페이스를 구현하는 클래스
public class _02_MemberDAOImpl implements _02_MemberDAO{
	
	public _02_MemberDAOImpl() {
		System.out.println("<<< 디폴트 생성자 >>>");
	}
	
	// DB 연결
	String dbURL = "jdbc:oracle:thin:@localhost:1521:xe"; // @HOST:포트번호:SID
	String dbID = "scott_04"; 	// 계정정보
	String dbPW = "tiger"; 		// 비밀번호
	
	Connection conn = null; 		// 오라클 연결
	PreparedStatement pstmt = null; // SQL 문장 작성하게 해줌
	ResultSet rs = null;			// SQL 실행 결과(SELECT)

	@Override
	public void login(String id, String pw) {
		int cnt = 0;
		String sql = "SELECT ?, ? FROM jdbc_member_tb1 WHERE id = ?";
		try {
			conn = DriverManager.getConnection(dbURL, dbID, dbPW);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, id);
			
			cnt = pstmt.executeUpdate();
			if(cnt == 1) {
				System.out.println("cnt : " + cnt);
				System.out.println("로그인 성공");
				System.out.println();
			}else {
				System.out.println("로그인 실패");
				System.out.println();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	// 회원가입
	@Override
	public int memberInsert(Scanner sc) {
		int insertCnt = 0;
		
		String sql = "INSERT INTO jdbc_member_tb1(id, password, gender, email, address) "
					+ "VALUES(?, ?, ?, ?, ?)";
		try {
			conn = DriverManager.getConnection(dbURL, dbID, dbPW); // DB연결
			pstmt = conn.prepareStatement(sql); // SQL 문장
			pstmt.setString(1, sc.next());
			pstmt.setString(2, sc.next());
			pstmt.setString(3, sc.next());
			pstmt.setString(4, sc.next());
			pstmt.setString(5, sc.next());
			
			insertCnt = pstmt.executeUpdate(); // SQL 문장 실행(Ctrl + Enter) => I, U, D SQL 실행 => 1 : 성공, 0 : 실패
			if(insertCnt == 1) {
				System.out.println("insertCnt : " + insertCnt);
				System.out.println("회원 정보 입력 완료했습니다.");
				System.out.println();
			}else {
				System.out.println("회원 정보 입력 실패했습니다.");
				System.out.println();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return insertCnt;
	}

	@Override
	public int memberUpdate(Scanner sc) {
		int updateCnt = 0;
		
		String sql = null;
		try {
			conn = DriverManager.getConnection(dbURL, dbID, dbPW);
			System.out.println("수정할 정보 : 1. 비번, 2. 이메일, 3. 주소");
			int input = sc.nextInt();
			switch(input) {
				case 1:
					sql = "UPDATE jdbc_member_tb1 SET password = ? WHERE id = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, sc.next());
					pstmt.setString(2, sc.next());
					updateCnt = pstmt.executeUpdate();
					if(updateCnt == 1) {
						System.out.println("비밀번호 변경 완료했습니다.");
						System.out.println();
					}else {
						System.out.println("비밀번호 변경 실패했습니다.");
						System.out.println();
					}
					break;
				case 2:
					sql = "UPDATE jdbc_member_tb1 SET email = ? WHERE id = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, sc.next());
					pstmt.setString(2, sc.next());
					updateCnt = pstmt.executeUpdate();
					if(updateCnt == 1) {
						System.out.println("이메일 변경 완료했습니다.");
						System.out.println();
					}else {
						System.out.println("이메일 변경 실패했습니다.");
						System.out.println();
					}
					break;
				case 3:
					sql = "UPDATE jdbc_member_tb1 SET address = ? WHERE id = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, sc.next());
					pstmt.setString(2, sc.next());
					updateCnt = pstmt.executeUpdate();
					if(updateCnt == 1) {
						System.out.println("주소 변경 완료했습니다.");
						System.out.println();
					}else {
						System.out.println("주소 변경 실패했습니다.");
						System.out.println();
					}
					break;
				default:
					System.out.println("잘못 입력했습니다!!!!");
					break;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return updateCnt;
	}

	@Override
	public int memberDelete(Scanner sc) {
		int deleteCnt = 0;
		
		String sql = "DELETE FROM jdbc_member_tb1 WHERE id = ?";
		try {
			conn = DriverManager.getConnection(dbURL, dbID, dbPW);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sc.next());
			
			deleteCnt = pstmt.executeUpdate();
			if(deleteCnt == 1) {
				System.out.println("deleteCnt : " + deleteCnt);
				System.out.println("회원 정보 삭제 완료했습니다.");
				System.out.println();
			}else {
				System.out.println("회원 정보 삭제 실패했습니다.");
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return deleteCnt;
	}

	@Override
	public void memberSelect(Scanner sc) {
		
		try {
			String sql = "SELECT * FROM jdbc_member_tb1";
			conn = DriverManager.getConnection(dbURL, dbID, dbPW);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("password");
				String gender = rs.getString("gender");
				String email = rs.getString("email");
				String address = rs.getString("address");
				System.out.print(id + ", " + pw + ", " + gender + ", " + email + ", " + address + "\n");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null)pstmt.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
