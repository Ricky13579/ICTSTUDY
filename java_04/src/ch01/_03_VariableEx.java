package ch01;

public class _03_VariableEx {
	public static void main(String[] args) {
		System.out.println("*** 연산 ***");
		int num1 = 40;
		int num2 = 20;
		int addResult = num1 + num2; // 덧셈
		System.out.println("addResult : "+addResult);
		System.out.println("addResult : " + num1+" + "+num2);
		
		int subResult = num1 - num2; // 뺄셈
		System.out.println("subResult :"+subResult);
		
		int mulResult = num1 * num2; // 곱셈 *
		System.out.println("mulResult : "+mulResult);
		
		int divResult = num1 / num2; // 나누기 
		System.out.println("divResult : "+ divResult);
		
		int restResult = num1 % num2; // 나누기 나머지 구할때는 %
		System.out.println("restResult : " +restResult);
		
				
		
	}
}
