package jdbc.Ex03;

import java.util.*;

public class PlayerService {
	public static void main(String[] args) {
		PlayerImpl football = PlayerImpl.getInstance();
		FootballDTO dto  = new FootballDTO();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*--------------------*");
		System.out.println("축구 조회 시스템에 접속을 하시겠습니까?");
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
					System.out.println("1.국가  2.리그  3.팀  4.감독  5.선수");
					System.out.print("◇ 어떤 업무를 도와드릴까요? : ");
					option = sc.nextInt();
					switch(option) {
							case 1:
								football.countriesInsert(dto);
								break;
							case 2:
								football.leagueInsert(dto);
								break;
							case 3:
								football.teamInsert(dto);
								break;
							case 4:
								football.managerInsert(dto);
								break;
							case 5:
								football.playerInsert(dto);
								break;
						}
					break;
				case 2:
						System.out.println("1.국가  2.리그  3.팀  4.감독  5.선수");
						System.out.print("◇ 어떤 업무를 도와드릴까요? : ");
						option = sc.nextInt();
						switch(option) {
							case 1:
								football.countriesUpdate(sc);
								break;
							case 2:
								football.leagueUpdate(sc);
								break;
							case 3:
								football.teamUpdate(sc);
								break;
							case 4:
								football.managerUpdate(sc);
								break;
							case 5:
								football.playerUpdate(sc);
								break;
						}
					break;
				case 3:
						System.out.println("1.국가  2.리그  3.팀  4.감독  5.선수");
						System.out.print("◇ 어떤 업무를 도와드릴까요? : ");
						option = sc.nextInt();
						switch(option) {
							case 1:
								football.countriesDelete(sc.nextInt());
								break;
							case 2:
								football.leagueDelete(sc.nextInt());
								break;
							case 3:
								football.teamDelete(sc.nextInt());
								break;
							case 4:
								football.managerDelete(sc.nextInt());
								break;
							case 5:
								football.playerDelete(sc.nextInt());
								break;
						}
					break;
				case 4:
						System.out.println("1.국가  2.리그  3.팀  4.감독  5.선수");
						System.out.print("◇ 어떤 업무를 도와드릴까요? : ");
						option = sc.nextInt();
						switch(option) {
							case 1:
								football.countriesSelect();
								break;
							case 2:
								football.leagueSelect();
								break;
							case 3:
								football.teamSelect();
								break;
							case 4:
								football.managerSelect();
								break;
							case 5:
								football.playerSelect();
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
