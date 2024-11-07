package ch02;

public class _09_SwitchCaseEx {
	public static void main(String[] args) {
		 /* === 2단 ===
		  * 2 * 1 = 2
		  * ...
		  * 2 * 9 = 18
		  * ==========
		  */
		
	
		System.out.println("=== 구구단 2단 만들기 ===");
		int du = 2;
		int p = 1;
		while (p <= 9) {
			System.out.println(du + "*" + p +"=" + (du*p));
			p += 1;
		}
		
		
		
		
		System.out.println("=== 구구단 만들기 ===");
		
		int dan = 2; 
		while (dan <= 9) {
			System.out.println("=== 구구단 ===");
			int i = 1;
			while (i <= 9) {
				System.out.println(dan + "*" + i + "=" + (dan*i));
				i += 1;
			
			}
			dan += 1;
			
		}

	}
}
