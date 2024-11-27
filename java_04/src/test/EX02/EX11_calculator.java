package test.EX02;

public class EX11_calculator implements Ex11_calc{

	@Override
	public int plus(int a, int b) {
		return a+b;
	}

	@Override
	public int minus(int a, int b) {
		return a-b;
	}

	@Override
	public int multi(int a, int b) {
		return a * b;
	}

	@Override
	public double divide(int a, int b) {
		if(b == 0) {
			return err;
		}
		return (double)a / b;
	}
	
	@Override
	public void info() {
		System.out.println("계산 완료");
		System.out.println();
	}

	@Override
	public void add(int c, int d) {
		System.out.println(c+d);
	}

	@Override
	public void sub(int c, int d) {
		System.out.println(c-d);
	}

	@Override
	public void mul(int c, int d) {
		System.out.println(c*d);
	}

	@Override
	public void div(int c, int d) {
		if(d == 0) {
			System.out.println(error);
		}else {
			System.out.println(c / d);
		}
	}

	@Override
	public void calcInfo() {
		System.out.println("계산 완료");
		System.out.println();
	}
	
	

}
