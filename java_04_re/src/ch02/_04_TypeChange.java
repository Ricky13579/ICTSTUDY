package ch02;

/*형변환*/

public class _04_TypeChange {
	public static void main(String[] args) {
		/*
		 * 소 -> 대 : 자동 형변환(묵시적 형변환) => 형변환 생략 가능 => 자료 손실 발생 안 함
		 * 대 -> 소 : 강제 형변환(명시적 형변환) => 형변환 생략 불가 => 자료 손실 발생
		 * 
		 */
		
		// 묵시적 형변환
		int n1 = 5;
		float f1 = n1;
		System.out.println("n1 : "+n1);
		System.out.println("f1 : "+f1+"\n");
		
		// 명시적 형변환
		double d1 = 8659.3021;
		float f2 = 562.123f;
		int rest1 = (int)d1 % (int)f2;
		int rest2 = (int)(d1 % f2);
		System.out.println("rest1 : "+rest1);
		System.out.println("rest2 : "+rest2);
		
	}

}
