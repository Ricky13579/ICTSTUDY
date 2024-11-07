package ch03;

public class _02_Book {
	/*
	 * 클래스 : 객체에 대한 설계도, 디자인
	 * 		- 멤버변수(속성) + 멤버메서드(기능, 동작)
	 * 객체 : 클래스를 바탕으로 만들어진 힙메모리 공간
	 */
	// 멤버변수(속성)
	int bookNo; 		// 책번호 1			2
	String bookTitle;	// 책제목 java입문		JSP
	String author;		// 책저자 박은종			최범균
	
	// 멤버메서드(기능, 동작)
	public void showInfo() {
		System.out.println("책 번호 : "+bookNo);
		System.out.println("책 제목 : "+bookTitle);
		System.out.println("책 저자 : "+author);
		System.out.println("--------------");
		System.out.println();
	}
}
