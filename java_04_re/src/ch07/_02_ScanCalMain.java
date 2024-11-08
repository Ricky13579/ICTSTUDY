package ch07;

import java.util.Scanner;
// 계산기 스캐너 버전
public class _02_ScanCalMain {
	public static void main(String[] args) {
		_02_ScanCalculator cal = new _02_ScanCalculator();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		sc.nextLine();
		int b = sc.nextInt();
		sc.nextLine();
		sc.close();
		
		cal.setNum(a, b); // 스캐너로 숫자 설정
		cal.plus(); // 더하기
		cal.minus(); // 빼기
		cal.mul(); // 곱하기
		cal.div(); // 나누기
		cal.rest(); // 나머지
		cal.result(); // 결과
	}
}
