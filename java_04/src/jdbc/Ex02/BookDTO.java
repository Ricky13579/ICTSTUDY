package jdbc.Ex02;

public class BookDTO {
	private int bookNo;
	private String bookTitle;
	private String bookAuthor;
	private int price;
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return 	bookNo + "번 책의 책 정보입니다.\n" 
				+"[bookNo=" + bookNo + ", bookTitle=" + bookTitle 
				+ ", bookAuthor=" + bookAuthor + ", price=" + price + "]";
	}
	
	
}
