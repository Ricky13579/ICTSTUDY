package jdbc.Ex01;

import java.util.*;

public class CarService {
	public static void main(String[] args) {
		Car car = CarDAOImpl.getInstance();
		CarDTO dto = new CarDTO();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*--------------------*");
		System.out.println("차량 조회시스템에 접속을 하시겠습니까?");
		System.out.println("*--------------------*");
		System.out.print("◇ yes / no : ");
		String answer = sc.nextLine();
		System.out.println();
		boolean isconnect = false;
		switch(answer) {
			case "yes":
				isconnect = true;
				while(isconnect) {
					System.out.println("*---------------------------------------------*");
					System.out.println("1.추가  2.수정  3.삭제  4.조회  5.종료");
					System.out.println("*---------------------------------------------*");
					System.out.print("◇ 어떤 업무를 도와드릴까요? : ");
					int menu = sc.nextInt();
					sc.nextLine();
					System.out.println();
					
					switch(menu) {
						case 1:
							car.carInsert(dto);
							break;
						case 2:
							car.carUpdate(sc);
							break;
						case 3:
							car.carDelete(sc.nextInt());
							break;
						case 4:	
							car.carSelect();
							break;
						case 5:
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
