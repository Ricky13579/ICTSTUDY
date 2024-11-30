package jdbc.Ex01;

import java.util.*;
import java.sql.*;

public class CarDAOImpl implements Car{
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "scott_04";
	String pw = "tiger";
	
	Scanner sc = new Scanner(System.in);
	
	private CarDAOImpl() {
		System.out.println("<<<디폴트 생성자>>>");
		System.out.println();
	}
	
	private static CarDAOImpl instance = new CarDAOImpl();
	
	public static CarDAOImpl getInstance() {
		if(instance == null) {
			instance = new CarDAOImpl();
		}
		return instance;
	}

	@Override
	public int carInsert(CarDTO dto) {
		int insertCnt = 0;
		System.out.print("차 종류 : ");
		dto.setKind(sc.nextLine());
		System.out.print("차 제조사 : ");
		dto.setManu_comp(sc.nextLine());
		System.out.print("차 가격(단위 : 만원) : ");
		dto.setPrice(sc.nextInt());
		try {
			String sql = "INSERT INTO JDBC_CAR_TBL "
						+ "VALUES(CAR_SEQ.nextval, ?, ?, ?)";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getKind());
			pstmt.setString(2, dto.getManu_comp());
			pstmt.setInt(3, dto.getPrice());
			insertCnt = pstmt.executeUpdate();
			if(insertCnt == 1) {
				System.out.println("insertCnt : " + insertCnt);
				System.out.println("차 정보 입력을 완료했습니다.");
				System.out.println();
			}else {
				System.out.println("차 정보 입력에 실패했습니다.");
				System.out.println();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return insertCnt;
	}

	@Override
	public int carUpdate(Scanner sc) {
		int updateCnt = 0;
		String sql = null;
		try {
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("수정할 정보 : 1. 차 종류, 2. 제조사, 3. 차 가격");
			System.out.print("몇 번을 바꾸시겠습니까? : ");
			int input = sc.nextInt();
			switch(input) {
				case 1:
					System.out.print("차 종류를 변경하겠습니다. 변경하실 차 종류를 입력해주세요 : ");
					
					sql = "UPDATE JDBC_CAR_TBL SET kind = ? WHERE carNo = ?";
					pstmt = con.prepareStatement(sql);
					
					pstmt.setString(1, sc.next());
					System.out.println();
					System.out.print("차 종류를 변경하실 차의 번호를 입력해주세요 : ");
					pstmt.setInt(2, sc.nextInt());
					System.out.println();
					
					updateCnt = pstmt.executeUpdate();
					if(updateCnt == 1) {
						System.out.println("updateCnt : " + updateCnt);
						System.out.println("차 종류의 변경을 완료했습니다.");
						System.out.println();
					}else {
						System.out.println("차 종류의 변경에 실패했습니다.");
						System.out.println();
					}
					break;
				case 2:
					System.out.print("제조사를 변경하겠습니다. 변경하실 제조사를 입력해주세요 : ");
					
					sql = "UPDATE JDBC_CAR_TBL SET manu_comp = ? WHERE carNo = ?";
					pstmt = con.prepareStatement(sql);
					
					pstmt.setString(1, sc.next());
					System.out.println();
					System.out.print("제조사를 변경하실 차의 번호를 입력해주세요 : ");
					pstmt.setInt(2, sc.nextInt());
					System.out.println();
					
					updateCnt = pstmt.executeUpdate();
					if(updateCnt == 1) {
						System.out.println("updateCnt : " + updateCnt);
						System.out.println("제조사의 변경을 완료했습니다.");
						System.out.println();
					}else {
						System.out.println("제조사의 변경에 실패했습니다.");
						System.out.println();
					}
					break;
				case 3:
					System.out.print("차 가격를 변경하겠습니다. 변경하실 차 가격을 입력해주세요 : ");
					
					sql = "UPDATE JDBC_CAR_TBL SET price = ? WHERE carNo = ?";
					pstmt = con.prepareStatement(sql);
					
					pstmt.setInt(1, sc.nextInt());
					System.out.println();
					System.out.print("차 가격을 변경하실 차의 번호를 입력해주세요 : ");
					pstmt.setInt(2, sc.nextInt());
					System.out.println();
					
					updateCnt = pstmt.executeUpdate();
					if(updateCnt == 1) {
						System.out.println("updateCnt : " + updateCnt);
						System.out.println("차 가격의 변경을 완료했습니다.");
						System.out.println();
					}else {
						System.out.println("차 가격의 변경에 실패했습니다.");
						System.out.println();
					}
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
	public int carDelete(int carNo) {
		int deleteCnt = 0;
		try {
			String sql = "DELETE FROM JDBC_CAR_TBL "
						+ "WHERE carNo = ?";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, carNo);
			deleteCnt = pstmt.executeUpdate();
			if(deleteCnt == 1) {
				System.out.println("deleteCnt : " + deleteCnt);
				System.out.println("차 정보 삭제를 완료했습니다.");
				System.out.println();
			}else {
				System.out.println("차 정보 삭제에 실패했습니다.");
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
	public int carSelect() {
		int selectCnt = 0;
		try {
			String sql = "Select * FROM JDBC_CAR_TBL";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int carNo = rs.getInt("carNo");
				String kind = rs.getString("kind");
				String manu_comp = rs.getString("manu_comp");
				int price = rs.getInt("price");
				System.out.println(carNo + ", " + kind + ", " + manu_comp + ", " + price);
				selectCnt++;
			}
			if(selectCnt > 0) {
				System.out.println("selectCnt : " + selectCnt);
				System.out.println("차 정보 조회에 성공했습니다.");
				System.out.println();
			}else {
				System.out.println("차 정보 조회에 실패했습니다.");
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
