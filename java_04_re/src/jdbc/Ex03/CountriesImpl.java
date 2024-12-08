package jdbc.Ex03;

import java.sql.*;
import java.util.*;

public class CountriesImpl implements Countries{
	
	Scanner sc = new Scanner(System.in);
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "scott_04";
	String pw = "tiger";
	
	@Override
	public int countriesInsert(FootballDTO dto) {
		int insertCnt = 0;
		System.out.print("국가 번호를 입력하세요 : ");
		dto.setCno(sc.nextInt());
		System.out.print("국가명을 입력하세요 : ");
		dto.setCname(sc.next());
		try {
			String sql = "INSERT INTO countries "
						 + "VALUES(?, ?)";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getCno());
			pstmt.setString(2, dto.getCname());
			insertCnt = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return insertCnt;
	}

	@Override
	public int countriesUpdate(Scanner sc) {
		int updateCnt = 0;
		
		try {
			String sql = "UPDATE countries "
						+ "SET countryName = ? "
						+ "WHERE countryNo = ?";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, sc.next());
			pstmt.setInt(2, sc.nextInt());
			updateCnt = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return updateCnt;
	}

	@Override
	public int countriesDelete(int countryNo) {
		int deleteCnt = 0;
		try {
			String sql = "DELETE countries "
						+ "WHERE countryNo = ?";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, sc.nextInt());
			deleteCnt = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return deleteCnt;
	}

	@Override
	public int countriesSelect() {
		int selectCnt = 0;
		try {
			String sql = "Select * FROM countries";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int cno = rs.getInt("countryNo");
				String cname = rs.getString("countryName");
				System.out.println(cno + ", " + cname);
				selectCnt++;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return selectCnt;
	}

}
