package ch02;

public class _13_ForEx {
	public static void main(String[] args) {
		/*
	       * for문을 이용해 콘솔에서 단을 입력받아 구구단 출력
	       * 단을 입력하세요 : 2
	       * === 2단 ===
	       * 2 * 1 = 2..
	       * 2 * 9 = 18
	       * =========== 
	       */
		
		for(int dan=2; dan <3 ; dan++) {
			System.out.println(dan + "단");
			for (int i=1; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
			}
			System.out.println("====종료====");
		}
		
	}
}
