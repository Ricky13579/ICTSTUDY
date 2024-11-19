package ch10;

public class _02_BookMain {
	public static void main(String[] args) {
		
		// 1) 객체생성
		_02_Book book1 = new _02_Book();
		
		// 2) setter로 값 전달
		book1.setBookNo(1);
		book1.setBookTitle("java입문");
		book1.setAuthor("박은종");
		book1.setPrice(25000);
		
		// book1.showInfo();
		// toString()이 재정의 안된 경우 => 부모의 메서드가 호출되어 주소값 출력 예) ch10._02_Book@6f2b958e
		// toString()이 재정의 된 경우 => 책 번호 : 1번, 책 제목 : java입문, 책 저자 : 박은종, 책 가격 : 25000
		System.out.println(book1.toString());
		System.out.println(book1); // 생략 시 toString() 호출
	}
}
