package ch10;

public class _02_Book extends Object {

	// 멤버변수
	private int bookNo; 		// 책번호 1			2
	private String bookTitle;	// 책제목 java입문		JSP
	private String author;		// 책저자 박은종			최범균
	private int price;			// 가격 25000			35000
	
	// 생성자
	
	// 멤버메서드(기능, 동작)
	public int getBookNo() {
		return bookNo;
	}
	
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo; // 4) 멤버변수에 대입
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override // 부모(Object) 메서드 재정의
	public String toString() {
		return "책 번호 : " + bookNo + "번, 책 제목 : "+bookTitle+", 책 저자 : "+author+", 책 가격 : "+price;
	}

//	public void showInfo() {
//		System.out.println("책 번호 : "+bookNo+"번");
//		System.out.println("책 제목 : "+bookTitle);
//		System.out.println("책 저자 : "+author);
//		System.out.println("책 가격 : "+price+"원");
//		System.out.println("--------------");
//		System.out.println();
//	}
	
}
