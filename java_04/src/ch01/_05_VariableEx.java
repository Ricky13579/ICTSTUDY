package ch01;

public class _05_VariableEx {
	public static void main(String [] args) {
		/*
		 * 인코딩 : 문자에 해당하는 정수값(아스키코드) 출력
		 * 디코딩 : 정수값(아스키코드값)에 해당하는 문자 출력
		 * 
		 * 인코딩  A -> 65   디코딩 65 -> A
		 * B : 66 
		 * C : 67
		 * Z : 90
		 * a : 97
		 * b : 98
		 * z : 122
		 */
		
		//예제 작성
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		// 문자 -> 정수로 변경
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		//53p 예제
		char ch5 = 'z';
		char ch6 = 38;
		char ch7 = 97;
		System.out.println((int)ch5);
		System.out.println(ch6);
		System.out.println((int)ch7);
		
		
		
		
	}
}
