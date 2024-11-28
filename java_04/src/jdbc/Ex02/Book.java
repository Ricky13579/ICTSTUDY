package jdbc.Ex02;

import java.util.*;

public interface Book {
	public int bookInsert(BookDTO bDTO);
	
	public int bookUpdate(Scanner sc, BookDTO dto);
	
	public int bookDelete(int bookNo);
	
	public void bookSelect(int bookNo);
}
