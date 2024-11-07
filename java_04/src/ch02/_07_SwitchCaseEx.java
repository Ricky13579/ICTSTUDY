package ch02;

public class _07_SwitchCaseEx {
	public static void main(String[] args) {
		/*반복문 : 조건이 참인 동안 계속해서 반복수행(while문, for문)
              1.초기값 -> 2.조건식 -> 3.증감식
              
       [ while 문법 ]
       1. 초기값;
       while(조건식) { // 2. 조건식
          수행문1;
          증감식;  // 3. 증감식
       }
       수행문2;
       
       [ 무한루프 ]
       while(true) {
           break;  => 해당 반복문을 빠져나간다.
       }
      */

      // 출력 => HappyDay1^^   HappyDay2^^  HappyDay3^^  HappyDay4^^  HappyDay5^^
      //         반복문 종료^^

		// 1.초기값 ->
		int count = 3;
		// 2.조건값 ->
		// 3.증감식 ->
		
		while(count <= 5) {
			System.out.print("HappyDay"+count+"^^");
			count++;
		}
		System.out.println(""
				+ "\n반복문 종료");
		

		//1~10까지 출력
		int h = 1;
		while (h < 11) {
			System.out.println(h);
			h++;
		}
		
		//1~10 더한값을 출력
		int d = 1;
		int sum2 = 0;
		while (d < 11) {
			sum2 += d;
			d++;
		}
		System.out.println("결과값 : 1~10 더합값은 " + sum2 + "입니다");
		
		//2~24 각각 더한값을 구하는 과정출력
		
		int y = 2;
		int sum4 = 0;
		while ( y < 25) {
			System.out.println(y + " + " + sum4 + "=" + (sum4+y));
			sum4 += y;
			y++;
		}
		
		
		System.out.println("=== 예제 복습 ===");
		
		//if else 등등 조건문 복습 및 switch 복습
		
		/* if문을 이용한 학점 구하기
	       * 1. 점수는 score 변수, 학점은 grade 변수
	       * 2. 점수가 90점 이상이면 A
	       *    점수가 80점 이상이면 B
	       *    점수가 70점 이상이면 C
	       *    점수가 60점 이상이면 D
	       *    점수가 60점 미만이면 F
	       *    범위를 벗어나면 W
	       * 3. 결과출력 => 점수 : 80, 학점 : B
	       * 
	       * || : 논리합 : OR(또는) => 양쪽 모두 거짓일 때 거짓
	       * && : 논리곱 : AND(이면서) => 양쪽 모두 참일때 참
	       *    
	       */
		System.out.println("=== 예제 ===");
		String result = "";
		int score = 80;
		int grade = 'w';
		
		if (score > 100 || score < 0 ) {
			grade = 'w';
		    }
			else if (score >= 90) {
				result = "A";
			}
			else if (score >= 80) {
				result = "B";
			}
			else if (score >= 70) {
				result = "C";
			}
			else if (score >= 60) {
				result = "D";
			}
		else {
			result = "괴락";
		}
		System.out.println("귀하의 점수는 "+ score +"점이며 학점은 " + result +"입니다" );
		
		
		// swicth 가지고 if 변환해보기
		
		System.out.println("=== 다른 예제 ===");
		/*
	      switch(조건) {
	            case 값1 : 수행문1;
	                break;
	            case 값2 : 수행문2;
	                break; 
	            case 값3 : 수행문3;
	                break;             
	            default: 수행문4;
	      }
	      */
	      // ranking에 따른 금메달 출력
	      // ranking 1:"금메달", 2:"은메달", 3:"동메달", 그외 "참가상"  => 결과 : 순위 :1, 메달:금메달
	      // 순위와 메달출력필요
		
		int ranking = 3;
		String medal = "동메달";
		
		switch (medal) {
		case "1" :
			System.out.println("금메달입니다");
			break;
		case "2" :
			System.out.println("은메달입니다");
			break;
		case "3" :
			System.out.println("동메달입니다");
			break;
		default :
			System.out.println("참가상입니다");
		}
		System.out.println("랭킹은 " + ranking + "등이며 " + medal + " 획득입니다");
		
		
	
		
		
		
		
		
		
	}
}
