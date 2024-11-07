package ch02;

public class _08_SwitchCaseEx {
	public static void main(String[] args) {
		/*
		 * 		/*반복문 : 조건이 참인 동안 계속해서 반복수행(while문, for문)
              1.초기값 -> 2.조건식 -> 3.증감식
              
       [ while 문법 ]
       1. 초기값;
       while(조건식) { // 2. 조건식
          수행문1;
          증감식;  // 3. 증감식
       }
       수행문2;
		 */
		
		//예제문제
		System.out.println("== 1번 : 1~10까지 출력 ==");
		int i = 1;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("== 2번 : 1~10까지 합계 출력==");
		int j = 1;
		int sum1 = 0;
		
		while(j <= 10) {
			sum1 += j;
			j++;
		}
		System.out.println("1~10까지 더한 합은 "+ sum1 + "입니다");
		
		System.out.println("== 3번 : 1~10까지 합계 과정 출력");
		// k      sum2
		// 1 + 0 = 1
		// 2 + 1 = 3
		// 10 + 45 = 55
		//반복문 종료
		int k = 1;
		int sum2 = 0;
		
		while(k <= 10) {
			System.out.println(k + " + " + sum2 + " = " + (sum2+k));
			sum2 += k;
			k++;
		}
		System.out.println("반복문종료");
		
		//선생님풀이
		int k1 = 1;
		int sum3 = 0;
		
		while(k1 <= 10) { // 2. 조건식
			System.out.println(k1 + " + " + sum3 + " = " + (sum3+k1));
			sum3 = sum3 +k1;
			sum2 += k1;
			k1++;
		//위에 내가한 풀이도 맞지만 result로 쓰는 방법도 있음 참고
		
		
		}
	}
}
