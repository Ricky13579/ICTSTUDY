package jdbc.Ex02;

import java.sql.*;
import java.util.*;

public class BookDAOImpl implements Book{
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "scott_04";
	String pw = "tiger";
	
	private BookDAOImpl() {
		System.out.println("책을 찾아봅시다~~~");
		System.out.println();
	}
	
	private static BookDAOImpl instance = new BookDAOImpl();
	
	public static BookDAOImpl getinstance() {
		if(instance == null) {
			instance = new BookDAOImpl();
		}
		return instance;
	}

	@Override
	public int bookInsert(BookDTO bDTO) {
		int insertCnt = 0;
		try {
			String sql = "INSERT INTO jdbc_book_tbl(bookNo, bookTitle, bookAuthor, price) "
						+ "VALUES(?, ?, ?, ?)";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bDTO.getBookNo());
			pstmt.setString(2, bDTO.getBookTitle());
			pstmt.setString(3, bDTO.getBookAuthor());
			pstmt.setInt(4, bDTO.getPrice());
			
			insertCnt = pstmt.executeUpdate();
			if(insertCnt == 1) {
				System.out.println("insertCnt : " + insertCnt);
				System.out.println("책 정보 입력 완료했습니다.");
				System.out.println();
			}else {
				System.out.println("책 정보 입력 실패했습니다.");
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return insertCnt;
	}

	@Override
	public int bookUpdate(Scanner sc, BookDTO dto) {
		int updateCnt = 0;
		String sql = null;
		try {
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("수정할 정보 : 1. 제목, 2. 작가, 3. 가격");
			int input = sc.nextInt();
			switch(input) {
				case 1:
						sql = "UPDATE jdbc_book_tbl SET bookTitle = ? WHERE bookNo = ?";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, sc.next());
						pstmt.setInt(2, sc.nextInt());
						updateCnt = pstmt.executeUpdate();
						if(updateCnt == 1) {
							System.out.println("책 제목 변경 완료했습니다.");
							System.out.println();
						}else {
							System.out.println("책 제목 변경 실패했습니다.");
							System.out.println();
						}
					break;
				case 2:
						sql = "UPDATE jdbc_book_tbl SET bookAuthor = ? WHERE bookNo = ?";
						pstmt = con.prepareStatement(sql);
						pstmt.setString(1, sc.next());
						pstmt.setInt(2, sc.nextInt());
						updateCnt = pstmt.executeUpdate();
						if(updateCnt == 1) {
							System.out.println("책 작가 변경 완료했습니다.");
							System.out.println();
						}else {
							System.out.println("책 작가 변경 실패했습니다.");
							System.out.println();
						}
					break;
				case 3:
						sql = "UPDATE jdbc_book_tbl SET price = ? WHERE bookNo = ?";
						pstmt = con.prepareStatement(sql);
						pstmt.setInt(1, sc.nextInt());
						pstmt.setInt(2, sc.nextInt());
						updateCnt = pstmt.executeUpdate();
						if(updateCnt == 1) {
							System.out.println("책 가격 변경 완료했습니다.");
							System.out.println();
						}else {
							System.out.println("책 가격 변경 실패했습니다.");
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
					if(con != null) con.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
		
		return updateCnt;
	}

	@Override
	public int bookDelete(int bookNo) {
		int deleteCnt = 0;
		
		try {
			String sql = "DELETE FROM jdbc_book_tbl WHERE bookNo = ?";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookNo);
			
			deleteCnt = pstmt.executeUpdate();
			if(deleteCnt == 1) {
				System.out.println("deleteCnt : " + deleteCnt);
				System.out.println("책 정보 삭제 완료했습니다.");
				System.out.println();
			}else {
				System.out.println("책 정보 삭제 실패했습니다.");
				System.out.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
	public void bookSelect(int bookNo) {
		int selectCnt = 0;
		try {
			String sql = "SELECT * FROM jdbc_book_tbl WHERE bookNo = ?";
			con = DriverManager.getConnection(url, id, pw);
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bookNo);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int bno = rs.getInt("bookNo");
				String title = rs.getString("bookTitle");
				String author = rs.getString("bookAuthor");
				int price = rs.getInt("price");
				System.out.print(bno + ", " + title + ", " + author + ", " + price + "\n");
				selectCnt++;
			}
			if(selectCnt == 1) {
				System.out.println("selectCnt : " + selectCnt);
				System.out.println("책 정보 조회 완료했습니다.");
				System.out.println();
			}else {
				System.out.println("책 정보 조회 실패했습니다.");
				System.out.println();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public int viewInsert(BookDTO bDTO) {
		int viewInsert = 0;
		try {
			con = DriverManager.getConnection(url, id, pw);
			String sql = "INSERT INTO v_jdbc_book "
						+ "VALUES(?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bDTO.getBookNo());
			pstmt.setString(2, bDTO.getBookTitle());
			pstmt.setString(3, bDTO.getBookAuthor());
			pstmt.setInt(4, bDTO.getPrice());
			
			viewInsert = pstmt.executeUpdate();
			if(viewInsert == 1) {
				System.out.println("viewInsert : " + viewInsert);
				System.out.println("책 정보 입력 완료했습니다.");
				System.out.println();
			}else {
				System.out.println("책 정보 입력 실패했습니다.");
				System.out.println();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return viewInsert;
	}
	
	
}
