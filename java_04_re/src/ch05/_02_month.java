package ch05;

import java.util.Scanner;

public class _02_month {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("올해 2024년은 달마다 총 몇 일까지 있을까요?");
		int month;
		int day = 0;
		System.out.print("월을 입력하세요 : ");
		do {
			month = sc.nextInt();
			sc.nextLine();
			switch(month) {
			case 1: case 3: case 5: case 7: case 8:
			case 10: case 12:
				day = 31;
				break;
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
			case 2:
				day = 29;
				break;
			default :
				System.out.print("잘못된 월입니다. 다시 입력하세요 : ");
				break;
			}
		}while(month<=0 || month>12);
		System.out.println("2024년 "+month+"월은 총 "+day+"일까지 있습니다.");
		sc.close();
	}
}
