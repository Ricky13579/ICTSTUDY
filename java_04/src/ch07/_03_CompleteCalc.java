package ch07;

public class _03_CompleteCalc extends _03_Calculator{
	
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}
	
	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
		}else {
			return ERROR;
		}
	}
	
	@Override
	public void printInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
}
