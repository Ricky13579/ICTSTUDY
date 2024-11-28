package jdbc.Ex02;

import java.util.*;

public class BookService {
	public static void main(String[] args) {
		Book book = BookDAOImpl.getinstance();
		BookDTO bDTO = new BookDTO();
		Scanner sc = new Scanner(System.in);
		
		bDTO.setBookNo(sc.nextInt());
		bDTO.setBookTitle(sc.next());
		bDTO.setBookAuthor(sc.next());
		bDTO.setPrice(sc.nextInt());
		
		book.bookInsert(bDTO);
		book.bookSelect(sc.nextInt());
//		book.bookDelete(sc.nextInt());
		book.bookUpdate(sc, bDTO);
		
	}
}
