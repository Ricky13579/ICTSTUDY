package ch04;

public class _05_BookMain {
	public static void main(String[] args) {
		System.out.println("<<< 디폴트 생성자 + setter >>>");
		
		// 1) 객체생성
		_05_Book book1 = new _05_Book();
		
		// 2) setter로 값 전달(입력)
		book1.setBookNo(1);
		book1.setAuthor("박은종");
		book1.setBookTitle("자바 입문");
		
		// 3) getter로 출력
		book1.getterInfo();
		
		System.out.println("<<< 매개변수 생성자 >>>");
		// 1) 객체생성
		_05_Book book2 = new _05_Book(2, "JSP", "최범균");
		// 2) getter로 출력
		book2.getterInfo();
		
		_05_Book book3 = new _05_Book(3, "스프링");
		book3.getterInfo();
	}
}
