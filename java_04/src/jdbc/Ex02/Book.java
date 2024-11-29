package jdbc.Ex02;

import java.util.*;

public interface Book {
	
	public int bookInsert(BookDTO bDTO);
	
	public int bookUpdate(Scanner sc);
	
	public int bookDelete(int bookNo);
	
	public void bookSelectAll();
	
	public void bookSelect(int bookNo);
	
}
