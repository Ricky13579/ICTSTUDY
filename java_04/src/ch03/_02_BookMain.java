package ch03;

public class _02_BookMain {
	public static void main(String[] args) {
		_02_Book book1 = new _02_Book();
		
//		book1.bookNo = 1;
//		book1.bookTitle = "java입문";
//		book1.author = "박은종";
//		book1.price = 25000;
//		book1.showInfo();
		
		book1.setBookNo(1);
		book1.setBookTitle("java입문");
		book1.setAuthor("박은종");
		book1.setPrice(25000);
		book1.showInfo();
		
		_02_Book book2 = new _02_Book();
		
//		book2.bookNo = 2;
//		book2.bookTitle = "JSP";
//		book2.author = "최범균";
//		book2.price = 35000;
//		book2.showInfo();
		
		book2.setBookNo(2);
		book2.setBookTitle("JSP");
		book2.setAuthor("최범균");
		book2.setPrice(35000);
		book2.showInfo();
	}
}
