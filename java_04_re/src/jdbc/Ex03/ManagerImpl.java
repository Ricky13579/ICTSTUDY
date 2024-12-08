package jdbc.Ex03;

import java.sql.DriverManager;
import java.util.Date;
import java.util.Scanner;

public class ManagerImpl extends TeamImpl implements Manager{

	@Override
	public int managerInsert(FootballDTO dto) {
		int insertCnt = 0;
		System.out.print("감독 번호를 입력하세요 : ");
		dto.setMno(sc.nextInt());
		System.out.print("감독명을 입력하세요 : ");
		dto.setMname(sc.next());
		System.out.print("팀 번호를 입력하세요 : ");
		dto.setTname(sc.next());
		System.out.print("부임일을 입력하세요 : ");
		dto.setHdate(sc.next());
		System.out.print("해고일을 입력하세요 : ");
		dto.setFdate(sc.next());
		try {
			String sql = "INSERT INTO manager "
						+ "VALUES(?, ?, ?, ?, ?)";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getMno());
			pstmt.setString(2, dto.getMname());
			pstmt.setInt(3, dto.getTno());
			pstmt.setString(4, dto.getHdate());
			pstmt.setString(5, dto.getFdate());
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
	public int managerUpdate(Scanner sc) {
		int updateCnt = 0;
		String sql = null;
		try {
			System.out.println("1. 감독명  2. 팀번호  3. 감독 부임일  4. 감독 해고일");
			int input = sc.nextInt();
			con = DriverManager.getConnection(url, id, pw);
			switch(input) {
				case 1:
						sql = "UPDATE manager "
							+ "SET managerName = ? "
							+ "WHERE managerNo = ?";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, sc.next());
						pstmt.setInt(2, sc.nextInt());
						updateCnt = pstmt.executeUpdate();
					break;
				case 2:
						sql = "UPDATE manager "
							+ "SET teamNo = ? "
							+ "WHERE managerNo = ?";
						pstmt = con.prepareStatement(sql);
						pstmt.setInt(1, sc.nextInt());
						pstmt.setInt(2, sc.nextInt());
						updateCnt = pstmt.executeUpdate();
					break;
				case 3:
						sql = "UPDATE team "
							+ "SET hire_date = ? "
							+ "WHERE teamNo = ?";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, sc.next());
						pstmt.setInt(2, sc.nextInt());
						updateCnt = pstmt.executeUpdate();
					break;
				case 4:
						sql = "UPDATE team "
								+ "SET fire_date = ? "
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
	public int managerDelete(int managerNo) {
		int deleteCnt = 0;
		try {
			String sql = "DELETE manager "
						+ "WHERE managerNo = ?";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, managerNo);
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
	public int managerSelect() {
		int selectCnt = 0;
		try {
			String sql = "SELECT * FROM manager";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int mno = rs.getInt("managerNo");
				String mname = rs.getString("managerName");
				int tno = rs.getInt("teamNo");
				Date hdate = rs.getDate("hire_date");
				Date fdate = rs.getDate("fire_date");
				System.out.println(mno + ", " + mname + ", " + tno + " , " + hdate + ", " + fdate);
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
