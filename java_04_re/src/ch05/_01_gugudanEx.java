package ch05;

public class _01_gugudanEx {
	public static void main(String[] args) {
		System.out.println("*** 짝수 단을 출력해보자 ***");
			for(int dan = 2; dan < 20; dan++) {
				if(dan % 2 == 1) {
					continue;
				}
					System.out.println("=== "+dan+"단 ===");
				for(int i = 1; i<10; i++) {
					System.out.println(dan + " * " + i + " = " +(dan*i));
				}
			System.out.println("=============");
		}
	}
}