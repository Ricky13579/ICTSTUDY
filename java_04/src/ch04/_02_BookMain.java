package ch04;

public class _02_BookMain {
	public static void main(String[] args) {
		_02_Book book = new _02_Book();
		
		book.setBookNo(1);
		book.setAuthor("박은종");
		book.setBookTitle("자바 입문");
		book.setPrice(25000);
		book.setPageCount(150);
		
		book.getterInfo();
	}
}
