package jdbc.Ex02;

import java.util.*;
import java.sql.*;

public class HabitatImpl extends PredatorImpl implements Habitat{
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "scott_04";
	String pw = "tiger";
	
	Scanner sc = new Scanner(System.in);

	@Override
	public int HabitatInsert(HabitatDTO dto) {
		int insertCnt = 0;
		
		System.out.print("서식지 정보 고유 번호 : ");
		dto.setHabitatNo(sc.nextInt());
		System.out.print("서식지 정보 : ");
		dto.setHabitat(sc.next());
		
		try {
			String sql = "Insert Into JDBC_Habitat_TBL "
						+ "VALUES(?, ?)";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getHabitatNo());
			pstmt.setString(2, dto.getHabitat());
			insertCnt = pstmt.executeUpdate();
			if(insertCnt == 1) {
				System.out.println("insertCnt : " + insertCnt);
				System.out.println("서식지 정보 입력을 완료했습니다.");
				System.out.println();
			}else {
				System.out.println("서식지 정보 입력에 실패했습니다.");
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return insertCnt;
	}

	@Override
	public int HabitatUpdate(Scanner sc) {
		int updateCnt = 0;
		try {
			String sql = "UPDATE JDBC_Habitat_TBL "
						+ "SET habitat = ? "
						+ "WHERE habitatno = ?";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sc.next());
			pstmt.setInt(2, sc.nextInt());
			updateCnt = pstmt.executeUpdate();
			if(updateCnt == 1) {
				System.out.println("deleteCnt : " +updateCnt);
				System.out.println("서식지 정보 변경을 완료했습니다.");
				System.out.println();
			}else {
				System.out.println("서식지 정보 변경에 실패했습니다.");
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return updateCnt;
	}

	@Override
	public int HabitatDelete(int HabitatNo) {
		int deleteCnt = 0;
		try {
			String sql = "DELETE FROM JDBC_Habitat_TBL "
						+ "WHERE HabitatNo = ?";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, HabitatNo);
			deleteCnt = pstmt.executeUpdate();
			if(deleteCnt == 1) {
				System.out.println("deleteCnt : " + deleteCnt);
				System.out.println("서식지 정보 삭제를 완료했습니다.");
				System.out.println();
			}else {
				System.out.println("서식지 정보 삭제에 실패했습니다.");
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return deleteCnt;
	}

	@Override
	public int HabitatSelect() {
		int selectCnt = 0;
		try {
			String sql = "Select * FROM JDBC_Habitat_TBL";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int HabitatNo = rs.getInt("HabitatNo");
				String name = rs.getString("Habitat");
				System.out.println(HabitatNo + ", " + name);
				selectCnt++;
			}
			if(selectCnt > 0) {
				System.out.println("selectCnt : " + selectCnt);
				System.out.println("서식지 정보 조회에 성공했습니다.");
				System.out.println();
			}else {
				System.out.println("서식지 정보 조회에 실패했습니다.");
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return selectCnt; 
	}
}
