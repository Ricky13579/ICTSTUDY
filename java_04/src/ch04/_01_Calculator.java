package ch04;

public class _01_Calculator {
	/*
	    * 메서드(함수) : 클래스의 기능 구현
	    * - 입력을 받아 처리 결과를 반환하는 기능
	    * 1) 메서드 호출시 메서드명이 일치해야 한다.
	    * 2) 매개변수 갯수와 type(자료형)이 일치해야 한다.
	    * 3) 리턴타입도 일치해야 한다.
	    *    단, 변수명은 달라도 무관
	    *    
	    * 문법 : public 반환형 메서드명(매개변수1,..) {
	    *           return 반환값;   // 처리결과를 리턴하며, 반환형과 일치해야 한다.
	    *    }
	    *    반환형이 void(비어있다는 뜻)으로 선언된 메서드는 결과값을 반환하지 않는다.
	 */
	
	// 멤버메서드
	public void add(double num1 , double num2) {
		double result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
	
	public void sub(double num1, double num2) {
		double result = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + result);
	}
	
	public void mul(double num1, double num2) {
		double result = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + result);
	}
	
	public void div(double num1, double num2) {
		double result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
	}
	public void rest(double num1, double num2) {
		double result = num1 % num2;
		System.out.println(num1 + " % " + num2 + " = " + result);
	}
	public double plus(double num1 , double num2) {
		double result = num1 + num2;
		return result;
	}
	
	public double minus(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}
	
	public double multiple(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}
	
	public double divide(double num1, double num2) {
		double result = num1 / num2;
		return result;
	}
	
	public double left(double num1, double num2) {
		return num1 % num2;
	}
}
