package jdbc.Ex01;

import java.sql.*;
import java.util.*;

// 인터페이스를 구현하는 클래스
public class _02_MemberDAOImpl implements _02_MemberDAO{
	
	public _02_MemberDAOImpl() {
		System.out.println("<<< 디폴트 생성자 >>>");
	}
	
	List<_02_MemberDTO> list = new ArrayList<_02_MemberDTO>();
	
	// DB 연결
	String dbURL = "jdbc:oracle:thin:@localhost:1521:xe"; // @HOST:포트번호:SID
	String dbID = "scott_04"; 	// 계정정보
	String dbPW = "tiger"; 		// 비밀번호
	
	Connection conn = null; 		// 오라클 연결
	PreparedStatement pstmt = null; // SQL 문장 작성하게 해줌
	ResultSet rs = null;			// SQL 실행 결과(SELECT)

	@Override
	public int login(Scanner sc) {
		System.out.println("*** 로그인 ***");
		int cnt = 0;
		String sql = "SELECT id, password "
					+ "FROM jdbc_member_tb1 "
					+ "WHERE id = ? AND password = ?";
		try {
			conn = DriverManager.getConnection(dbURL, dbID, dbPW);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sc.next());
			pstmt.setString(2, sc.next());
			
			cnt = pstmt.executeUpdate();
			if(cnt == 1) {
				System.out.println("cnt : " + cnt);
				System.out.println("로그인 성공");
				System.out.println();
			}else {
				System.out.println("로그인 실패");
				memberInsert(new _02_MemberDTO(), sc);
				login(sc);
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
		return cnt;
	}

	// 회원가입
	@Override
	public int memberInsert(_02_MemberDTO dto, Scanner sc) {
		System.out.println("[ 회원가입 ]");
		int insertCnt = 0;
		System.out.print("아이디를 입력하세요 : ");
		dto.setId(sc.next());
		System.out.print("비밀번호를 입력하세요 : ");
		dto.setPassword(sc.next());
		System.out.print("성별을 입력하세요 : ");
		dto.setGender(sc.next());
		System.out.print("이메일을 입력하세요 : ");
		dto.setEmail(sc.next());
		System.out.print("주소를 입력하세요 : ");
		dto.setAddress(sc.next());
		
		String sql = "INSERT INTO jdbc_member_tb1(id, password, gender, email, address) "
					+ "VALUES(?, ?, ?, ?, ?)";
		try {
			conn = DriverManager.getConnection(dbURL, dbID, dbPW); // DB연결
			pstmt = conn.prepareStatement(sql); // SQL 문장
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getGender());
			pstmt.setString(4, dto.getEmail());
			pstmt.setString(5, dto.getAddress());
			
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
			System.out.println("수정할 정보 : 1. 비밀번호, 2. 성별, 3. 이메일, 4. 주소");
			System.out.println("몇 번을 바꾸시겠습니까? : ");
			int input = sc.nextInt();
			switch(input) {
				case 1:
					System.out.print("비밀번호를 변경하겠습니다. 변경할 비밀번호를 입력하세요 : ");
					
					sql = "UPDATE jdbc_member_tb1 "
						   + "SET password = ? "
						   + "WHERE id = ?";
					pstmt = conn.prepareStatement(sql);
					
					pstmt.setString(1, sc.next());
					System.out.println();
					System.out.print("어느 아이디의 비밀번호를 바꾸시겠습니까? : ");
					pstmt.setString(2, sc.next());
					System.out.println();
					
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
					System.out.print("성별을 변경하겠습니다. 변경할 성별을 입력하세요 : ");
					
					sql = "UPDATE jdbc_member_tb1 "
						   + "SET gender = ? "
						 + "WHERE id = ?";
					pstmt = conn.prepareStatement(sql);
					
					pstmt.setString(1, sc.next());
					System.out.println();
					System.out.print("어느 아이디의 성별을 바꾸시겠습니까? : ");
					pstmt.setString(2, sc.next());
					System.out.println();
					
					updateCnt = pstmt.executeUpdate();
					if(updateCnt == 1) {
						System.out.println("성별 변경 완료했습니다.");
						System.out.println();
					}else {
						System.out.println("성별 변경 실패했습니다.");
						System.out.println();
					}
					break;
					
				case 3:
					System.out.print("이메일을 변경하겠습니다. 변경할 이메일을 입력하세요 : ");
					
					sql = "UPDATE jdbc_member_tb1 "
						   + "SET email = ? "
						 + "WHERE id = ?";
					pstmt = conn.prepareStatement(sql);
					
					pstmt.setString(1, sc.next());
					System.out.println();
					System.out.print("어느 아이디의 이메일을 바꾸시겠습니까? : ");
					pstmt.setString(2, sc.next());
					System.out.println();
					
					updateCnt = pstmt.executeUpdate();
					if(updateCnt == 1) {
						System.out.println("이메일 변경 완료했습니다.");
						System.out.println();
					}else {
						System.out.println("이메일 변경 실패했습니다.");
						System.out.println();
					}
					break;
					
				case 4:
					System.out.print("주소를 변경하겠습니다. 변경할 주소를 입력하세요 : ");
					
					sql = "UPDATE jdbc_member_tb1 "
					       + "SET address = ? "
					     + "WHERE id = ?";
					pstmt = conn.prepareStatement(sql);
					
					pstmt.setString(1, sc.next());
					System.out.println();
					System.out.print("어느 아이디의 주소를 바꾸시겠습니까? : ");
					pstmt.setString(2, sc.next());
					System.out.println();
					
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
			System.out.println("어떤 회원의 정보를 지우시겠습니까?");
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
	public int memberSelect(String id) {
		int selectCnt = 0;
		try {
			String sql = "SELECT * "
						+ "FROM jdbc_member_tb1 "
						+ "WHERE id = ?";
			conn = DriverManager.getConnection(dbURL, dbID, dbPW);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String Id = rs.getString("id");
				String pw = rs.getString("password");
				String gender = rs.getString("gender");
				String email = rs.getString("email");
				String address = rs.getString("address");
				System.out.print(Id + ", " + pw + ", " + gender + ", " + email + ", " + address + "\n");
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
		return selectCnt;
	}
	
	@Override
	public List<_02_MemberDTO> memberList() {
		try {
			String sql = "SELECT * FROM jdbc_member_tb1";
			conn = DriverManager.getConnection(dbURL, dbID, dbPW);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				_02_MemberDTO dto = new _02_MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setPassword(rs.getString("password"));
				dto.setGender(rs.getString("gender"));
				dto.setEmail(rs.getString("email"));
				dto.setAddress(rs.getString("address"));
				list.add(dto);
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
		return list;
	}


}
