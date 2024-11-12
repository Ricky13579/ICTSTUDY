package ch06;

//상속 : 자식클래스 extends 부모클래스
public class _01_Cat extends _01_Animal {
	/*
	    * [면접]
	    * 상속 : 자식클래스 extends 부모클래스 { .... }
	    * - extends : 확장하다의 의미
	    * - 공통으로 사용하는 멤버변수와 멤버메서드를 부모클래스에서 정의한다.
	    * - 부모클래스는 일반적이고 공통적이며, 자식클래스는 구체적이고 유일하다.
	    * 
	    * - 사용이유 : 부모클래스의 멤버변수와 멤버메서드를 재사용.
	    *          중복되는 코드를 줄임으로써 손쉽게 개발, 유지보수 가능
	    * - 부모클래스의 멤버를 private으로 선언한 경우, 자식클래스에서 접근할 수 없다.
	    *   접근제어자 protected의 경우 자식클래스에서 접근 가능
	 */
	
	// 디폴트 생성자
	public _01_Cat() {
		System.out.println("<<< _01_Cat 자식클래스 >>>");
	}
	
	// 멤버메서드
	public void cry() {
		System.out.println("야옹~~");
		System.out.println();
	}
	
}
