package jdbc.Ex02;

import java.util.*;

public class InsectService {
	public static void main(String[] args) {
		InsectImpl insect = InsectImpl.getinstance();
		InsectDTO dto = new InsectDTO();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*--------------------*");
		System.out.println("전자 곤충도감에 접속을 하시겠습니까?");
		System.out.println("*--------------------*");
		System.out.print("◇ yes / no : ");
		String answer = sc.nextLine();
		System.out.println();
		boolean isconnect = false;
		int option;
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
							System.out.println("1.포식자  2.서식지  3.곤충");
							System.out.print("◇ 어떤 업무를 도와드릴까요? : ");
							option = sc.nextInt();
							switch(option) {
								case 1:
									insect.PredatorInsert(dto);
									break;
								case 2:
									insect.HabitatInsert(dto);
									break;
								case 3:
									insect.InsectInsert(dto);
									break;
							}
							break;
						case 2:
							System.out.println("1.포식자  2.서식지  3.곤충");
							System.out.print("◇ 어떤 업무를 도와드릴까요? : ");
							option = sc.nextInt();
							switch(option) {
								case 1:
									insect.PredatorUpdate(sc);
									break;
								case 2:
									insect.HabitatUpdate(sc);
									break;
								case 3:
									insect.InsectUpdate(sc);
									break;
							}
							break;
						case 3:
							System.out.println("1.포식자  2.서식지  3.곤충");
							System.out.print("◇ 어떤 업무를 도와드릴까요? : ");
							option = sc.nextInt();
							switch(option) {
								case 1:
									insect.PredatorDelete(sc.nextInt());
									break;
								case 2:
									insect.HabitatDelete(sc.nextInt());
									break;
								case 3:
									insect.InsectDelete(sc.nextInt());
									break;
							}
							break;
						case 4:	
							System.out.println("1.포식자  2.서식지  3.곤충");
							System.out.print("◇ 어떤 업무를 도와드릴까요? : ");
							option = sc.nextInt();
							switch(option) {
								case 1:
									insect.PredatorSelect();
									break;
								case 2:
									insect.HabitatSelect();
									break;
								case 3:
									insect.InsectSelect();
									break;
							}
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
