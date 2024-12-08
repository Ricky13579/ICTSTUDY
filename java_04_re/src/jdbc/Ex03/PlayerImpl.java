package jdbc.Ex03;

import java.sql.DriverManager;
import java.util.Date;
import java.util.Scanner;

public class PlayerImpl extends ManagerImpl implements Player{
	private PlayerImpl() {
		System.out.println("디폴트 생성자");
	}
	
	private static PlayerImpl instance = new PlayerImpl();
	
	public static PlayerImpl getInstance() {
		if(instance == null) {
			instance = new PlayerImpl();
		}
		return instance;
	}
	
	@Override
	public int playerInsert(FootballDTO dto) {
		int insertCnt = 0;
		System.out.print("선수 번호를 입력하세요 : ");
		dto.setPno(sc.nextInt());
		System.out.print("선수명을 입력하세요 : ");
		dto.setPname(sc.next());
		System.out.print("감독 번호를 입력하세요 : ");
		dto.setMno(sc.nextInt());
		System.out.print("팀 번호를 입력하세요 : ");
		dto.setTno(sc.nextInt());
		System.out.print("리그 번호를 입력하세요 : ");
		dto.setLno(sc.nextInt());
		System.out.print("선수 영입일을 입력하세요 : ");
		dto.setHdate(sc.next());
		System.out.print("선수 이적일을 입력하세요 : ");
		dto.setFdate(sc.next());
		try {
			String sql = "INSERT INTO Player "
						+ "VALUES(?, ?, ?, ?, ?, ?, ?)";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getPno());
			pstmt.setString(2, dto.getPname());
			pstmt.setInt(3, dto.getMno());
			pstmt.setInt(4, dto.getTno());
			pstmt.setInt(5, dto.getLno());
			pstmt.setString(6, dto.getHdate());
			pstmt.setString(7, dto.getFdate());
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
	public int playerUpdate(Scanner sc) {
		int updateCnt = 0;
		String sql = null;
		try {
			System.out.println("1. 선수명  2. 감독번호  3. 팀번호  4. 리그번호  5. 선수 영입일  6. 선수 이적일");
			int input = sc.nextInt();
			con = DriverManager.getConnection(url, id, pw);
			switch(input) {
				case 1:
						sql = "UPDATE player "
							+ "SET playerName = ? "
							+ "WHERE playerNo = ?";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, sc.next());
						pstmt.setInt(2, sc.nextInt());
						updateCnt = pstmt.executeUpdate();
					break;
				case 2:
						sql = "UPDATE player "
							+ "SET managerNo = ? "
							+ "WHERE playerNo = ?";
						pstmt = con.prepareStatement(sql);
						pstmt.setInt(1, sc.nextInt());
						pstmt.setInt(2, sc.nextInt());
						updateCnt = pstmt.executeUpdate();
					break;
				case 3:
						sql = "UPDATE player "
							+ "SET teamNo = ? "
							+ "WHERE playerNo = ?";
						pstmt = con.prepareStatement(sql);
						pstmt.setInt(1, sc.nextInt());
						pstmt.setInt(2, sc.nextInt());
						updateCnt = pstmt.executeUpdate();
					break;
				case 4:
						sql = "UPDATE player "
								+ "SET leagueNo = ? "
								+ "WHERE playerNo = ?";
						pstmt = con.prepareStatement(sql);
						pstmt.setInt(1, sc.nextInt());
						pstmt.setInt(2, sc.nextInt());
						updateCnt = pstmt.executeUpdate();
					break;
				case 5:
						sql = "UPDATE player "
								+ "SET hire_date = ? "
								+ "WHERE playerNo = ?";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, sc.next());
						pstmt.setInt(2, sc.nextInt());
						updateCnt = pstmt.executeUpdate();
					break;
				case 6:
						sql = "UPDATE player "
								+ "SET fire_date = ? "
								+ "WHERE playerNo = ?";
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
	public int playerDelete(int playerNo) {
		int deleteCnt = 0;
		try {
			String sql = "DELETE player "
						+ "WHERE playerNo = ?";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, playerNo);
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
	public int playerSelect() {
		int selectCnt = 0;
		try {
			String sql = "SELECT * FROM player";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int pno = rs.getInt("playerNo");
				String pname = rs.getString("playerName");
				int mno = rs.getInt("managerNo");
				int tno = rs.getInt("teamNo");
				int lno = rs.getInt("leagueNo");
				Date hdate = rs.getDate("hire_date");
				Date fdate = rs.getDate("fire_date");
				System.out.println(pno + ", " + pname + ", " + mno + " , " + tno + ", " + lno + ", " + hdate + ", " + fdate);
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
