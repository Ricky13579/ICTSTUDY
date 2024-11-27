package test.EX04;

import java.util.*;

public class BookService {
	public static void main(String[] args) {
		Book book = BookDAOImpl.getinstance();
		BookDTO bDTO = new BookDTO();
		Scanner sc = new Scanner(System.in);
		
		bDTO.setBookNo(1);
		bDTO.setBookTitle("노인과 바다");
		bDTO.setBookAuthor("어니스트 헤밍웨이");
		bDTO.setPrice(8000);
		
		book.bookSelect(1, bDTO);
		System.out.println("등록하고 싶은 책 정보를 입력하세요");
		book.bookInsert(bDTO, sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
		book.bookDelete(bDTO.getBookNo(), bDTO);
		book.bookUpdate(bDTO, sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
	}
}
