package ch07;
/*
 * [면접] 추상클래스 vs 인터페이스
 *       인터페이스 설명
 *       
 *  인터페이스 
 *  - 기능정의서(표준 작업명세서)이다. - 강제성과 통일성
 *  - 설계(선언)와 구현을 분리시키는 것을 가능하게 한다.
 *    (설계 : 인터페이스, 구현 : 자식클래스)
 *  - 객체생성 불가능하며, 객체 Type으로 가능하다.(다형성 적용)
 *  - 인터페이스의 멤버는 상수(static final 생략 가능), 추상메서드(abstract 생략 가능)만 올수 있다.
 *  - 단 static 메서드, 디폴트 메서드, private 메서드는 예외(JDK 1.8부터)
 *  - 인터페이스를 implements(=구현)할 자식클래스에서 추상메서드를 재정의한다.
 *  
 *  1. 인터페이스 작성
 *  interface 인터페이스명 {
 *     // 상수
 *     public static final 데이터타입 대문자상수명 = 값;
 *      // 추상메서드
 *      public abstract 반환형 추상메서드(매개변수1,...);  // body없다
 *  }
 *  
 *  2. 인터페이스 구현  
 *  자식class 클래스명 implements 인터페이스명 {
 *     @Override
 *      public 반환형 추상메서드(매개변수1,...) {
 *          // 인터페이스에 정의된 추상메서드를 구현해야 한다.
 *       }
 *  }
 *  
 * 3. 인터페이스는 다중 상속 가능    cf) 클래스는 단일 상속만 가능
 * interface 인터페이스명  extends  인터페이스명1, .. 인터페이스명n {
 * 
 * }
 * 
 * //NG - 클래스는 단일 상속만 가능
 * class 클래스명  extends  클래스명1, .. 클래스명n {  
 * }
 * 
 * 4. 상속과 구현을 동시
 * class 자식클래스명 extends 부모클래스 implements 인터페이스명1, .. 인터페이스명n {
 * 
 * }
 * 
 * 자바 8부터 디폴트 메서드, 정적 메서드를 구현할 수 있다.
     자바 9부터 private 메서드를 구현할 수 있다.
 */
      
public abstract class _03_Calculator implements _03_Calc{
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
}
