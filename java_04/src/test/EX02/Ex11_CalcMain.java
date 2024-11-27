package test.EX02;

public class Ex11_CalcMain {
	public static void main(String[] args) {
		Ex11_calc calc = new EX11_calculator();
		
		System.out.println(calc.plus(9, 51));
		System.out.println(calc.minus(9, 51));
		System.out.println(calc.multi(9, 51));
		System.out.println(calc.divide(9, 51));
		calc.info();
		
		Ex11_calc calc2 = new EX11_calculator();
		calc2.add(10, 3);
		calc2.sub(10, 3);
		calc2.mul(10, 3);
		calc2.div(10, 3);
		calc2.calcInfo();
	}
}
