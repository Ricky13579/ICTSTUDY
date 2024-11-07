package ch03;

public class _02_BookMain {
	public static void main(String[] args) {
		_02_Book book1 = new _02_Book();
		book1.bookNo = 1;
		book1.bookTitle = "java입문";
		book1.author = "박은종";
		book1.showInfo();
		
		_02_Book book2 = new _02_Book();
		book2.bookNo = 2;
		book2.bookTitle = "JSP";
		book2.author = "최범균";
		book2.showInfo();
	}
}
