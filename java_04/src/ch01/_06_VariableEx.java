package ch01;

public class _06_VariableEx {
	public static void main(String[] args) {
		final int My_AGE = 22;
		System.out.println(My_AGE);
		/*
		 * 상수 : 프로그램이 실행되는 동안. 값이 변하지 않을 수 또는 변경불가능한 수
		 *       주로 대문자 사용(변수는 소문자)
		 *       만약 값을 변경해야 할 경우, 상수를 선언한 곳의 초기값만 변경하면 된다.
		 *       
		 * 문법 : final 자료명 변수명;    예) final double PI = 3.14;
		 *      1) 변수(상수) : 변수의 값 변경불가
		 *      2) 메서드 : 재정의 불가(나중에 배울점 알아만두기)
		 *      3) 클래스 : 상속 불가(나중에 배울점)
		 *      
		 */
		
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM=1000; // 오류발생, 상수는 값을 변경불가
		
		String name = "홍길동";
		System.out.println("예전이름 : "+ name);
		name = "소지섭";
		System.out.println("지금이름 : "+ name);
		// 변수를 변경할때 사용하는 방법

				
		final String MY_NAME = "길민종";
		final String MY_AGE = "26";
		final String MY_ASSET = "2천만원";
		final String MY_DREAM = "개발자";
		final String MY_EMAIL = "qkqk0110@naver.com";
		System.out.println("이름 :"+MY_NAME);
		System.out.println("나이 :"+MY_AGE);
		System.out.println("자산 :"+MY_ASSET);
		System.out.println("꿈 :"+MY_DREAM);
		System.out.println("이메일 :"+MY_EMAIL);
		
		// 상수로 내정보 출력 (MY_NAME , MY_AGE, MY_ASSET, MY_DREAM, 
		
		int ch1 = 75;
		int ch2 = 73;
		int ch3 = 76;
		System.out.println((char)ch1);
		System.out.println((char)ch2);
		System.out.println((char)ch3);
				
		
		
		
	}
}
