package test.EX04;

public interface Book {
	public void bookInsert(BookDTO bDTO, int bookNo, String bookTitle, String bookAuthor, int price);
	
	public void bookUpdate(BookDTO bDTO, int bookNo, String bookTitle, String bookAuthor, int price);
	
	public void bookDelete(int bookNo, BookDTO bDTO);
	
	public void bookSelect(int bookNo, BookDTO bDTO);
}
