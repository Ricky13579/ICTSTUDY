package jdbc.Ex02;

import java.util.*;
import java.sql.*;

public class InsectImpl extends HabitatImpl implements Insect{
	
	private InsectImpl() {
		System.out.println("디폴트 생성자");
		System.out.println();
	}
	
	private static InsectImpl instance = new InsectImpl();
	
	public static InsectImpl getinstance() {
		if(instance == null) {
			instance = new InsectImpl();
		}
		return instance;
	}
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "scott_04";
	String pw = "tiger";
	
	Scanner sc = new Scanner(System.in);

	@Override
	public int InsectInsert(InsectDTO dto) {
		int insertCnt = 0;
		
		System.out.print("곤충 이름 : ");
		dto.setInsectname(sc.next());
		System.out.print("서식지 고유 번호 : ");
		dto.setHabitatNo(sc.nextInt());
		System.out.print("포식자 고유 번호 : ");
		dto.setPredatorNo(sc.nextInt());
		System.out.print("곤충의 식성 : ");
		dto.setTaste(sc.next());
		
		try {
			String sql = "Insert Into JDBC_INSECT_TBL "
						+ "VALUES(INSECT_SEQ.nextval, ?, ?, ?, ?)";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getInsectname());
			pstmt.setInt(2, dto.getHabitatNo());
			pstmt.setInt(3, dto.getPredatorNo());
			pstmt.setString(4, dto.getTaste());
			insertCnt = pstmt.executeUpdate();
			if(insertCnt == 1) {
				System.out.println("insertCnt : " + insertCnt);
				System.out.println("곤충 정보 입력을 완료했습니다.");
				System.out.println();
			}else {
				System.out.println("곤충 정보 입력에 실패했습니다.");
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
	public int InsectUpdate(Scanner sc) {
		int updateCnt = 0;
		String sql = null;
		try {
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("수정할 정보 : 1. 곤충 이름, 2. 서식지, 3. 포식자, 4.식성");
			System.out.print("몇 번을 바꾸시겠습니까? : ");
			int input = sc.nextInt();
			switch(input) {
				case 1:
					System.out.print("곤충 이름을 변경하겠습니다. 변경하실 곤충 이름을 입력해주세요 : ");
					sql = "UPDATE JDBC_INSECT_TBL SET "
							+ "insectname = ? WHERE insectNo = ?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, sc.next());
					System.out.println();
					System.out.print("곤충 이름을 변경하실 곤충의 번호를 입력해주세요 : ");
					pstmt.setInt(2, sc.nextInt());
					System.out.println();
					updateCnt = pstmt.executeUpdate();
					if(updateCnt == 1) {
						System.out.println("updateCnt : " + updateCnt);
						System.out.println("곤충 이름의 변경을 완료했습니다.");
						System.out.println();
					}else {
						System.out.println("곤충 이름의 변경에 실패했습니다.");
						System.out.println();
					}
					break;
				case 2:
					System.out.print("서식지를 변경하겠습니다. 변경하실 서식지를 입력해주세요 : ");
					sql = "UPDATE JDBC_INSECT_TBL SET "
							+ "HabitatNo = ? WHERE insectNo = ?";
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, sc.nextInt());
					System.out.println();
					System.out.print("서식지를 변경하실 곤충의 번호를 입력해주세요 : ");
					pstmt.setInt(2, sc.nextInt());
					System.out.println();
					updateCnt = pstmt.executeUpdate();
					if(updateCnt == 1) {
						System.out.println("updateCnt : " + updateCnt);
						System.out.println("서식지 변경을 완료했습니다.");
						System.out.println();
					}else {
						System.out.println("서식지 변경에 실패했습니다.");
						System.out.println();
					}
					break;
				case 3:
					System.out.print("포식자를 변경하겠습니다. 변경하실 포식자를 입력해주세요 : ");
					sql = "UPDATE JDBC_INSECT_TBL SET "
							+ "PredatorNo = ? WHERE insectNo = ?";
					pstmt = con.prepareStatement(sql);
					pstmt.setInt(1, sc.nextInt());
					System.out.println();
					System.out.print("포식자를 변경하실 곤충의 번호를 입력해주세요 : ");
					pstmt.setInt(2, sc.nextInt());
					System.out.println();
					updateCnt = pstmt.executeUpdate();
					if(updateCnt == 1) {
						System.out.println("updateCnt : " + updateCnt);
						System.out.println("서식지 변경을 완료했습니다.");
						System.out.println();
					}else {
						System.out.println("서식지 변경에 실패했습니다.");
						System.out.println();
					}
					break;
				case 4:
					System.out.print("식성을 변경하겠습니다. 변경하실 식성을 입력해주세요 : ");
					sql = "UPDATE JDBC_INSECT_TBL SET "
							+ "taste = ? WHERE insectNo = ?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, sc.next());
					System.out.println();
					System.out.print("식성을 변경하실 곤충의 번호를 입력해주세요 : ");
					pstmt.setInt(2, sc.nextInt());
					System.out.println();
					updateCnt = pstmt.executeUpdate();
					if(updateCnt == 1) {
						System.out.println("updateCnt : " + updateCnt);
						System.out.println("식성의 변경을 완료했습니다.");
						System.out.println();
					}else {
						System.out.println("식성의 변경에 실패했습니다.");
						System.out.println();
					}
					break;
				default:
					System.out.println("다시 입력해주십시오");
					break;
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
	public int InsectDelete(int insectNo) {
		int deleteCnt = 0;
		try {
			String sql = "DELETE FROM JDBC_INSECT_TBL "
					+ "WHERE insectNo = ?";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, insectNo);
			deleteCnt = pstmt.executeUpdate();
			if(deleteCnt == 1) {
				System.out.println("deleteCnt : " + deleteCnt);
				System.out.println("곤충 정보 삭제를 완료했습니다.");
				System.out.println();
			}else {
				System.out.println("곤충 정보 삭제에 실패했습니다.");
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
	public int InsectSelect() {
		int selectCnt = 0;
		try {
			String sql = "Select * FROM JDBC_INSECT_TBL";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int insectNo = rs.getInt("insectNo");
				String name = rs.getString("insectName");
				int habitatNo = rs.getInt("habitatNo");
				int predatorNo = rs.getInt("predatorNo");
				String taste = rs.getString("taste");
				System.out.println(insectNo + ", " + name + ", " + habitatNo + ", " + predatorNo + ", " + taste);
				selectCnt++;
			}
			if(selectCnt > 0) {
				System.out.println("selectCnt : " + selectCnt);
				System.out.println("곤충 정보 조회에 성공했습니다.");
				System.out.println();
			}else {
				System.out.println("곤충 정보 조회에 실패했습니다.");
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
