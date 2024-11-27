package test.EX04;

public class BookDAOImpl implements Book{
	
	private BookDAOImpl() {
		System.out.println("책을 찾아봅시다~~~");
		System.out.println();
	}
	
	private static BookDAOImpl instance = new BookDAOImpl();
	
	public static BookDAOImpl getinstance() {
		if(instance == null) {
			instance = new BookDAOImpl();
		}
		return instance;
	}

	@Override
	public void bookInsert(BookDTO bDTO, int bookNo, String bookTitle, String bookAuthor, int price) {
		if(bDTO.getBookNo() != bookNo) {
			bDTO.setBookNo(bookNo);
			bDTO.setBookTitle(bookTitle);
			bDTO.setBookAuthor(bookAuthor);
			bDTO.setPrice(price);
			System.out.println("새로 등록한 책의 정보입니다.");
			System.out.println(bDTO.toString());
		}else {
			System.out.println("이미 존재하는 책입니다.");
			System.out.println();
		}
	}

	@Override
	public void bookUpdate(BookDTO bDTO, int bookNo, String bookTitle, String bookAuthor, int price) {
		if(bDTO.getBookNo() > 0) {
			bDTO.setBookNo(bookNo);
			if(bDTO.getBookTitle() != null) {
				bDTO.setBookTitle(bookTitle);
				if(bDTO.getBookAuthor() != null) {
					bDTO.setBookAuthor(bookAuthor);
					if(bDTO.getPrice() >= 0) {
						bDTO.setPrice(price);
					}
				}
			}
		}else {
			System.out.println("책 정보가 존재하지 않습니다.");
			System.out.println();
		}
	}

	@Override
	public void bookDelete(int bookNo, BookDTO bDTO) {
		if(bookNo != 0) {
			System.out.println(bookNo + "번 책 정보의 삭제가 완료되었습니다.");
			System.out.println();
		}else {
			System.out.println("없는 책입니다.");
			System.out.println();
		}
	}

	@Override
	public void bookSelect(int bookNo, BookDTO bDTO) {
		if(bookNo != 0) {
			System.out.println(bDTO.toString());
			System.out.println();
		}else {
			System.out.println("없는 책입니다.");
			System.out.println();
		}
	}

}
