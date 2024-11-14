package ch07;

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
