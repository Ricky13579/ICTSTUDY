package ch02;

public class _02_IfEx {
	public static void main(String[] args) {
		/*
        [if - else if - else문]
        
        if(조건식1) {   // 조건식1이 참인 경우 수행문1을 실행
           수행문1;
        }
        else if(조건식2) {  // 조건식2이 참인 경우 수행문2을 실행
           수행문2;
        }   
        else if(조건식3) {  // 조건식3이 참인 경우 수행문3을 실행
           수행문3;
        }   
        else {         // 위의 조건이 모두 해당되지 않는 경우 수행문4를 실행
           수행문4;
        }
        
        수행문5;   // 무조건 실행
       */		
		
		// num이 양수/음수/0인지 판단
		
		int num = 10;// 결과 -5는 음수
		if(num < 0) {
			System.out.println("결과 : " + num + "는 음수");
		}
		else if(num == 0){
			System.out.println("결과 : " + num +"는 0");
		}
		else if(num > 0){
			System.out.println("결과 : " + num + " 양수");
		}
		else {
			
		}
		
		System.out.println("--------------------");
		String result = "";
		if(num <0) {
			result = "음수";
		}
		else if (num ==0) {
			result = "0";
		}
		else {
			result = "양수";
		}
		System.out.println("결과 : " + num + "는(은) " + result);
		System.out.println("종료");
		
		
		
		int num2 = 15;
		if (num2 == 0) {
			System.out.println("음수입니다");
		}
		else if (num2 > 0) {
			System.out.println("양수입니다");
		}
		else if (num2 < 0) {
			System.out.println("음수입니다");
		}
	
		
		
		System.out.println("\n==복습==");
		
		int num4 = 30;
		if (num4 >= 0) {
			System.out.println("양수입니다");
		}
		else if (num4 <0) {
			System.out.println("음수입니다");
		}
		
		else {
			System.out.println("0입니다");
		}
		
		
		
		
		
	}
}
