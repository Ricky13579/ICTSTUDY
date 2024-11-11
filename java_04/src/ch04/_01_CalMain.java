package ch04;

public class _01_CalMain {
	public static void main(String[] args) {
		// 객체 생성 : new 클래스이름();
		_01_Calculator cal = new _01_Calculator();
		
		// 호출 		num1 = 8.0,		num2 = 4.0
		int num1 = 8, num2 = 4;
		
		cal.add(num1, num2);
		cal.sub(num1, num2);
		cal.mul(num1, num2);
		cal.div(num1, num2);
		cal.rest(num1, num2);
		
		System.out.println(num1 + " + " + num2 + " = " + cal.plus(num1, num2));
		System.out.println(num1 + " - " + num2 + " = " + cal.minus(num1, num2));
		System.out.println(num1 + " * " + num2 + " = " + cal.multiple(num1, num2));
		System.out.println(num1 + " / " + num2 + " = " + cal.divide(num1, num2));
		System.out.println(num1 + " % " + num2 + " = " + cal.left(num1, num2));
		
	}

}
