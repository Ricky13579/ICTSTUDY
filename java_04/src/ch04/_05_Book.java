package ch04;

public class _05_Book {
	// 멤버변수(속성)
	private int bookNo; 		// 책번호 1			2
	private String bookTitle;	// 책제목 java입문		JSP
	private String author;		// 책저자 박은종			최범균
	
	// 생성자
	public _05_Book() {}
	
	public _05_Book(int bookNo, String bookTitle, String author) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.author = author;
	}
	
	public _05_Book(int bookNo, String bookTitle) {
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
	}
	
	// 생성자 오버로드
	/*
	 * 생성자가 2개 이상 제공되는 경우를 말한다.
	 * 메서드나 생성자의 매개변수 개수가 다르거나 타입이 다른 경우를 말하며, 리턴타입과는 무관하다.
	 */
	
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
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
	
	public void getterInfo() {
		System.out.println("--- << getter로 값 출력 >> ---");
		System.out.println("책 번호 : "+getBookNo());
		System.out.println("책 제목 : "+getBookTitle());
		System.out.println("책 저자 : "+getAuthor());
	}
}
