package ch07;

public class _02_ScanCalculator {
	
	private int a;
	private int b;
	
	public int plus() {
		return a+b;
	}
	public int minus() {
		return a-b;
	}
	public int mul() {
		return a*b;
	}
	public int div() {
		return a/b;
	}
	public int rest() {
		return a%b;
	}
	public void setNum(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void result() {
		System.out.println();
		System.out.println("<<< 사칙연산 결과 >>>");
		System.out.println(a + " + " + b + " = " + plus());
		System.out.println(a + " - " + b + " = " + minus());
		System.out.println(a + " * " + b + " = " + mul());
		System.out.println(a + " / " + b + " = " + div());
		System.out.println(a + " % " + b + " = " + rest());
	}
}
