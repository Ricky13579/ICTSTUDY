package jdbc.Ex03;

import java.sql.DriverManager;
import java.util.*;

public class TeamImpl extends LeagueImpl implements Team{
	
	@Override
	public int teamInsert(FootballDTO dto) {
		int insertCnt = 0;
		System.out.print("팀 번호를 입력하세요 : ");
		dto.setTno(sc.nextInt());
		System.out.print("팀명을 입력하세요 : ");
		dto.setTname(sc.next());
		System.out.print("리그 번호를 입력하세요 : ");
		dto.setLno(sc.nextInt());
		System.out.print("클럽 출범일을 입력하세요 : ");
		dto.setBdate(sc.next());
		try {
			String sql = "INSERT INTO TEAM "
						+ "VALUES(?, ?, ?, ?)";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getTno());
			pstmt.setString(2, dto.getTname());
			pstmt.setInt(3, dto.getLno());
			pstmt.setString(4, dto.getBdate());
			insertCnt = pstmt.executeUpdate();
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
	public int teamUpdate(Scanner sc) {
		int updateCnt = 0;
		String sql = null;
		try {
			System.out.println("1. 팀명  2. 리그번호  3. 클럽 설립일");
			int input = sc.nextInt();
			con = DriverManager.getConnection(url, id, pw);
			switch(input) {
				case 1:
						sql = "UPDATE team "
							+ "SET teamName = ? "
							+ "WHERE teamNo = ?";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, sc.next());
						pstmt.setInt(2, sc.nextInt());
						updateCnt = pstmt.executeUpdate();
					break;
				case 2:
					sql = "UPDATE team "
						+ "SET leagueNo = ? "
						+ "WHERE teamNo = ?";
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, sc.nextInt());
					pstmt.setInt(2, sc.nextInt());
					updateCnt = pstmt.executeUpdate();
				break;
				case 3:
					sql = "UPDATE team "
						+ "SET build_date = ? "
						+ "WHERE teamNo = ?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, sc.next());
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
				e.printStackTrace();;
			}
		}
		return updateCnt;
	}

	@Override
	public int teamDelete(int teamNo) {
		int deleteCnt = 0;
		try {
			String sql = "DELETE team "
						+ "WHERE teamNo = ?";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, teamNo);
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
	public int teamSelect() {
		int selectCnt = 0;
		try {
			String sql = "SELECT * FROM team";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int tno = rs.getInt("teamNo");
				String tname = rs.getString("teamName");
				int lno = rs.getInt("leagueNo");
				Date bdate = rs.getDate("build_date");
				System.out.println(tno + ", " + tname + ", " + lno + " , " + bdate);
				selectCnt++;
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
