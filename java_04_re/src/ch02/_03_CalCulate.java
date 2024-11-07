package ch02;

/*사칙연산*/

public class _03_CalCulate {
	public static void main(String[] args) {
		int n1 = 58;
		int n2 = 4;
		
		// 더하기
		int add = n1 + n2;
		System.out.println(n1+" + "+n2+" = "+add);
		
		// 빼기
		int sub = n1 - n2;
		System.out.println(n1+" - "+n2+" = "+sub);
		
		// 곱하기
		int mul = n1 * n2;
		System.out.println(n1+" * "+n2+" = "+mul);
		
		// 나누기
		int div = n1 / n2;
		System.out.println(n1+" / "+n2+" = "+div);
		
		// 나머지
		int rest = n1 % n2;
		System.out.println(n1+" % "+n2+" = "+rest);
	}
}
