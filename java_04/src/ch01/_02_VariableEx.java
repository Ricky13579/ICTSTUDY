package ch01;

public class _02_VariableEx {//변수란뜻
	public static void main(String[] args) {
	/*
	 * 1. 기본자료형(Primiticv Type) : 실제 '값'이 저장되는 공간
	 *     - 정수형 : byte(1바이트) -> short(2바이트) -> int(4바이트) : 기본 -> long(8바이트)
	 *     - 실수형 : float(4바이트) -> double(8바이트) : 기본 
	 *     - 문자형 : char(2바이트) 
	 *     - 부울형(논리형) : boolean(1바이트) 1(true) / 0(false) -> 조건문에서 참인지 거짓인지 판단
	 * 2. 참조형(Reference Type) : 실제 객체를 가리키는 주소값이 저장되는 공간 - 참조변수의 자료형
	 *     -클래스,인터페이스,배열
	 * 
	 * 3. 문자열 : String 클래스
	 */
	System.out.println("=== 정수형 변수 ===");
	// 선언과 동시에 초기화
	int num1 = 10;   // int형은 기본형
	long num2 = 12345678900l; //long형은 숫자뒤에 L이나 l을 붙인다. int와 구분
	System.out.println("num1 : " +num1);
	System.out.println("num2 : " +num2);	
	
	System.out.println("=== 실수형 변수 ===");
	float fnum1 = 3.14f; // float형은 숫자뒤에 f나 F를 붙인다(double과 구분하기 위해 필수)
	double dnum1 = 5.5; // double형은 기본형이며, 값뒤에 아무것도 붙이지 않는다
	
	System.out.println("float:"+fnum1);
	System.out.println("double:"+dnum1);
	
	float fnum4 = 5.615f;
	System.out.println("float4 :"+ fnum4);
	double dnum3 = 9.456;
	System.out.println("double2 : "+ dnum3);
	
	System.out.println("=== 문자형 변수 ===");
	// String은 클래스 타입이므로 반드시 대문자로 시작한다. 초기화시 쌍따음표를 사용하며, 공백이 없어도 된다.
	String srt = ("지명준");
	System.out.println("내 이름은 : "+srt);
	char grade = 'a'; // char을 사용할때는 무조건 따음표사용 ''
	// char grade =
	System.out.println("학점 : " + grade);	
	
	System.out.println("=== 부울형 변수 ===");
	boolean isMarried = true; // 참, 1이라는 값을 가지고 있음
	boolean isWorker = false; // 거짓, 0이라는 값을 가지고 있음
	
	System.out.println("결혼 : "+ isMarried);
	System.out.println("결혼 : "+ isWorker);		
	

	
//	=== 정수형 변수 ===
//num1 : 10
//num2 : 12345678900
//=== 실수형 변수 ===
//float:3.14
//double:5.5
//float4 :5.615
//double2 : 9.456
//=== 문자형 변수 ===
//내 이름은 : 길민종
//학점 : a
//=== 부울형 변수 ===
//결혼 : true
//결혼 : false

	
	
	}
}