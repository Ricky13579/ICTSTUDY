package ch02;

/*디코딩과 인코딩*/

public class _05_ASCII {
	public static void main(String[] args) {
		/*
		 * 인코딩 : 문자에 해당하는 정수값(아스키코드값) 출력
		 * 디코딩 : 정수값(아스키코드값)에 해당하는 문자 출력
		 * 
		 * 인코딩 : A -> 65	디코딩 : 65 -> A
		 */
		
		int n1 = 93;
		System.out.println("n1 : "+n1); // 93
		System.out.println("아스키 코드값 n1에 해당하는 문자 : "+(char)n1); // ]
		
		char n2 = '8';
		System.out.println("n2 : "+n2); // 8
		System.out.println("n2의 아스키 코드값 : "+(int)n2);
		
		char str = 35;
		System.out.println("아스키 코드값 str에 해당하는 문자 : "+str);// #
		System.out.println("str의 아스키 코드값 : "+(int)str); // 35
		
	}
}
