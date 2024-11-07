package ch05;

import java.util.Scanner;

public class _03_Scan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 번을 반복하시겠습니까? : ");
		int count = sc.nextInt();
		sc.nextLine();
		int sum = 0;
		for(int i = 1;i<=count; i++) {
			if(i % 2 == 0) {
				System.out.println(i+"는 짝수입니다.");
				sum+=i;
			}else {
				System.out.println(i+"는 홀수입니다.");
				sum+=i;
			}
		}
		System.out.println(count+"번 반복한 결과 i값들의 합은 "+sum+"입니다.");
		sc.close();
	}

}
