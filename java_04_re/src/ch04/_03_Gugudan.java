package ch04;

public class _03_Gugudan {
	public static void main(String[] args) {
		System.out.println("--- 짝수 단을 외워보자 ---\n");
		int dan = 2;
		while(dan < 20) {
			System.out.println("=== "+dan+"단 ===");
			int gop = 1;
			while(gop<=9) {
				System.out.println(dan+" * "+gop+" = "+(dan*gop));
				gop++;
			}
			dan+=2;
			System.out.println();
		}
	}

}
