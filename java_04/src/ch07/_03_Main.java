package ch07;

public class _03_Main {
	public static void main(String[] args) {
		_03_Calc calc = new _03_CompleteCalc();
		
		int num1 = 10, num2 = 5;
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.printInfo();
	}
}
