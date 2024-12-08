package jdbc.Ex03;

import java.sql.DriverManager;
import java.util.Scanner;

public class LeagueImpl extends CountriesImpl implements League{

	@Override
	public int leagueInsert(FootballDTO dto) {
		int insertCnt = 0;
		System.out.print("리그 번호를 입력하세요 : ");
		dto.setLno(sc.nextInt());
		System.out.print("리그명을 입력하세요 : ");
		dto.setLname(sc.next());
		System.out.print("국가 번호를 입력하세요 : ");
		dto.setCno(sc.nextInt());
		
		try{
			String sql = "INSERT INTO league "
						+ "VALUES(?, ?, ?)";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getLno());
			pstmt.setString(2, dto.getLname());
			pstmt.setInt(3, dto.getCno());
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
	public int leagueUpdate(Scanner sc) {
		int updateCnt = 0;
		String sql = null;
		try {
			System.out.println("1. 리그명  2. 국가번호");
			int input = sc.nextInt();
			switch(input) {
				case 1:
						sql = "UPDATE league "
							+ "SET leagueName = ? "
							+ "WHERE leagueNo = ?";
						con = DriverManager.getConnection(url, id, pw);
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, sc.next());
						pstmt.setInt(2, sc.nextInt());
						updateCnt = pstmt.executeUpdate();
					break;
				case 2:
						sql = "UPDATE league "
							+ "SET countryNo = ? "
							+ "WHERE leagueNo = ?";
						con = DriverManager.getConnection(url, id, pw);
						pstmt = con.prepareStatement(sql);
						pstmt.setInt(1, sc.nextInt());
						pstmt.setInt(2, sc.nextInt());
						updateCnt = pstmt.executeUpdate();
					break;
				default :
					System.out.println("다시 입력하세요");
					break;
			}
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
	public int leagueDelete(int leagueNo) {
		int deleteCnt = 0;
		try {
			String sql = "DELETE league "
						+ "WHERE leagueNo = ?";
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
	public int leagueSelect() {
		int selectCnt = 0;
		try {
			String sql = "SELECT * FROM league";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int lno = rs.getInt("leagueNo");
				String lname = rs.getString("leagueName");
				int cno = rs.getInt("countryNo");
				System.out.println(lno + ", " + lname + ", " + cno);
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
