package jdbc.Ex02;

import java.util.*;

public class BookService {
	public static void main(String[] args) {
		Book book = BookDAOImpl.getinstance();
		BookDTO bDTO = new BookDTO();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*--------------------*");
		System.out.println("도서시스템에 접속을 하시겠습니까?");
		System.out.println("*--------------------*");
		System.out.print("◇ yes / no : ");
		String answer = sc.nextLine();
		boolean isconnect = false;
		switch(answer) {
			case "yes":
				isconnect = true;
				while(isconnect) {
					System.out.println("*---------------------------------------------*");
					System.out.println("1.추가  2.수정  3.삭제  4.전체조회  5.한권조회  6.종료");
					System.out.println("*---------------------------------------------*");
					System.out.print("◇ 어떤 업무를 도와드릴까요? : ");
					int menu = sc.nextInt();
					sc.nextLine();
					
					switch(menu) {
						case 1:
							book.bookInsert(bDTO);
							break;
						case 2:
							book.bookUpdate(sc);
							break;
						case 3:
							book.bookDelete(sc.nextInt());
							break;
						case 4:	
							book.bookSelectAll();
							break;
						case 5:
							book.bookSelect(sc.nextInt());
							break;
						case 6:
							System.out.println("시스템을 종료합니다.");
							System.exit(0);
							break;
						default :
							System.out.println("잘못 입력하셨습니다. 다시 해주십시오");
							break;
					}
				}
				break;
			case "no":
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				break;
			default :
				System.out.println("yes나 no중에서 입력을 해주십시오");
				break;	
			}
		}
		
}
