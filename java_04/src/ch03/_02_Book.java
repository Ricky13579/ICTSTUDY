package ch03;

public class _02_Book {
	/*
	 * 클래스 : 객체에 대한 설계도, 디자인
	 * 		- 멤버변수(속성) + 멤버메서드(기능, 동작)
	 * 객체 : 클래스를 바탕으로 만들어진 힙메모리 공간
	 */
//	int bookNo;
//	String bookTitle;
//	String author;
	
	// 멤버변수(속성) 5) 멤버변수로 값 들어온다.
	private int bookNo; 		// 책번호 1			2
	private String bookTitle;	// 책제목 java입문		JSP
	private String author;		// 책저자 박은종			최범균
	private int price;			// 가격 25000			35000
	
	
	// 멤버메서드(기능, 동작)
	// 3) 매개변수로 값 전달
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo; // 4) 멤버변수에 대입
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("책 번호 : "+bookNo+"번");
		System.out.println("책 제목 : "+bookTitle);
		System.out.println("책 저자 : "+author);
		System.out.println("책 가격 : "+price+"원");
		System.out.println("--------------");
		System.out.println();
	}
}
