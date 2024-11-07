package ch02;

public class _14_ForEx {
	public static void main(String[] args) {
		/*
	       * Test4. for문으로 구구단 작성
	       * 2~9단까지 출력
	       * 
	       * *** 구구단 출력 ***
	       * === 2단 ===
	       * 2 * 1 = 2
	       * ...
	       * 2 * 9 = 18
	       * === 9단 ===
	       * 9 * 1 = 9
	       * ...
	       * 9 * 9 = 81
	       * ==========  마지막에 한번만
	       */
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단");
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + "*" + i + "=" + (dan*i) + "입니다");
			}
		}
		
		// 짝수단만 출력해라
		
		for (int dan2=2; dan2<=9; dan2 += 2) {
			System.out.println(dan2 + "단");
			for(int o=1; o<=9; o++) {
				System.out.println(dan2 + "*" + o + "=" + (dan2*o + "."));
			}
		}
		
		//홀수만 출력해라
		for(int dan=1; dan<=9; dan += 2) {
			System.out.println(dan + "단");
			for(int f=1; f<=9; f++) {
				System.out.println(dan+ "*" + f + "=" +(dan*f));
			}
		}
		
		
		/*
		 * int dan3 = 2;
		 *  while (dan3 <= 9) {
	    	  System.out.println("==구구단==");
	    	  int r = 1;
	    	  while (r <= 9) {
	    	  System.out.println(dan3 + "*" + r + "=" + (dan3*r));
		      r += 1; 
	    	  }
	    	  dan3 += 1;
		 */
	     
	      //while로 구구단 출력하기
		
		int dan = 2;
		while (dan<=9) {
			System.out.println(dan + "단");
			int l = 1;
			while (l<=9) {
				System.out.println(dan + "*" + l + "=" + (dan*l));
				l += 1;
			}
			dan += 1;
		}
		
		//while로 구구단 출력하기
		
		int dan2 = 2;
		while(dan2 <= 9) {
			System.out.println(dan + "단");
			int u = 1;
			while(u<=9) {
				System.out.println(dan2 + "*" + u + "=" + (dan2*u));
				u += 1;
			}
			dan2 += 1;
		}
		
		int dan6 = 2;
		while(dan6 <=9) {
			System.out.println(dan + "단");
			int h = 1;
			while (h<=9) {
				System.out.println(dan6 + "*" + h + "=" + (dan6*h));
				h += 1;
			}
			dan6 += 1;
		}
			 
	}
}
