package ch13;

import java.util.*;

public class _02_ArithmeticException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("첫 번째 정수를 입력하세요 : ");
			int a = sc.nextInt();
			
			System.out.print("두 번째 정수를 입력하세요 : ");
			int b = sc.nextInt();
			
			System.out.println(a/b);
			System.out.println(a%b);
		}catch(ArithmeticException e) {
			System.out.println("예외처리 메시지 : "+e.getMessage());
		}finally {
			System.out.println("프로그램 종료");
		}
		System.out.println("정상종료");
	}
}
