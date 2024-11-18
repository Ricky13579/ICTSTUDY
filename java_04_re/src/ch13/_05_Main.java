package ch13;

import java.util.*;

public class _05_Main {
	public static void main(String[] args) {
		_05_OuijaBoard death = new _05_OuijaBoard();
		Scanner sc = new Scanner(System.in);
		System.out.println("지금부터 분신사바를 할 겁니다. 한 사람당 질문할 수 있는 기회는 3번입니다.");
		System.out.println("영혼이 오면 분신사바가 시작되고, 영혼은 예나 아니요로만 대답할 수 있습니다.");
		System.out.println("분신사바~~~ 분신사바~~~ 어서 오십시오!!!!");
		
		
		try {
			sc.nextLine();
			death.setAnswer("예");
		} catch (_05_GhostException e) {
//			e.printStackTrace();
			System.out.println("메시지 : " +e.getMessage());
		} finally {
			System.out.println(death.getAnswer());
			System.out.println();
		}
		
		try {
			sc.nextLine();
			death.setAnswer("아니요");
		} catch (_05_GhostException e) {
//			e.printStackTrace();
			System.out.println("메시지 : " +e.getMessage());
		} finally {
			System.out.println(death.getAnswer());
			System.out.println();
		}
		
		try {
			sc.nextLine();
			death.setAnswer("난 몰라!!!!");
		} catch (_05_GhostException e) {
//			e.printStackTrace();
			System.out.println("메시지 : " +e.getMessage());
		} finally {
			System.out.println(death.getAnswer());
			System.out.println("정상종료");
			System.out.println();
		}
		
		sc.close();
	}
}
