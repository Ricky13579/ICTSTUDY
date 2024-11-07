package ch02;

public class _04_IfEx {
	public static void main(String[] args) {
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
		int score = 120;
		if (score > 100 || score < 0) {
			System.out.println("W");
		}
		else {
			if(score >= 90) {
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
			else if (score < 60) {
				result = "F";
			
		}
		System.out.println("학생의 점수는" + score + "이며 학점은 " + result + "입니다");
		
		
		System.out.println("\n=== 새로운것 ===");
		
		
		
		
		System.out.println("===복습문제===");
		
		
		
		
		
		
		
		
		//계절출력문
		String result1 = "";
		int moath = 4;
		
		int aaa = moath % 12; //season
		if (aaa > 0 && aaa <= 2) {
			result1 = "겨울";
		}
		else if (aaa > 2 && aaa <= 5) {
			result1 = "봄";		
		}
		else if (aaa > 5 && aaa <= 10) {
			result1 = "가을";
		}
		else if (aaa > 10 && aaa <= 12) {
			result1 = "겨울";
		}
		System.out.println("지금은 " + moath +"월이며, "+ "계절은 " + result1 + "입니다");
		
		
		

		
		
		
		
		
		
	}
}
}