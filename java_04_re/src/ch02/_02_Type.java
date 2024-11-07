package ch02;

public class _02_Type {
	public static void main(String[] args) {
		/*
		 * 1. 기본자료형(Primitive Type) : 실제 '값'이 저장되는 공간
		 * 		- 정수형 : byte(1바이트) -> short(2바이트) -> int(4바이트) : 기본 -> long(8바이트)
		 * 		- 실수형 : float(4바이트) -> double(8바이트) : 기본
		 * 		- 문자형 : char(2바이트)
		 * 		- 부울형 : boolean(1바이트) -> 1(true) / 0(false) => 조건문에서 참/거짓 판단
		 * 
		 * 2. 참조형(Reference Type) : 실제 객체를 가리키는 주소값이 저장되는 공간 - 참조변수의 자료형
		 * 		- 클래스, 인터페이스, 배열
		 * 
		 * 3. 문자열 : String 클래스
		 */
		
		 // 정수형
		 int n1 = 10;
		 long n2 = 987654321000l;
		 System.out.println("n1 : "+n1);
		 System.out.println("n2 : "+n2+"\n");
		 
		 // 실수형
		 double d1 = 3.14;
		 float f1 = 3.14f;
		 System.out.println("d1 : "+d1);
		 System.out.println("f1 : "+f1+"\n");
		 
		 // 문자형
		 String str = "손흥민";
		 System.out.println("이름 : "+str);
		 
		 char asc65 = 'A';
		 System.out.println("아스키코드 65번 : "+asc65+"\n");
		 
		 // 부울형
		 boolean isDead = false;
		 boolean isAlive = true;
		 System.out.println("죽었나요? : "+isDead);
		 System.out.println("살았나요? : "+isAlive);
	}

}
