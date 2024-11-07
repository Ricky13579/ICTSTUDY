package ch02;

public class _03_IfEx {
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
		
		// score 60점 이상이면 합격, 60점 미만이면 불합격(60점 미포함),40점 미만이면 과락
		// 예시 > 70점 : 합격 (result)
		
		int score = 80;
		if (score > 60) {
			System.out.println("결과 : " + score + "은(는) 합격");
		}
		else if (score <= 60 && score > 40) {
			System.out.println("결과 : " + score + "은(는) 불합격");
		}
		else {
			System.out.println("과락");
		}
		
		System.out.println("-----------------");
		String result = "";
		if (score >= 60) {
			result = "합격";
		}
		else if (score >= 40) {
			result = "불합격";
		}
		else {
			result = "과락";
		}
		System.out.println("귀하는 점수는 " + score + "점이므로 " + result + "입니다");
		
		System.out.println("\n=== 잘못된 점수 체크 ===");
		
		if (score > 100 || score < 0) {
			System.out.println("잘못된 점수입니다. 확인해주세요");
		}
		else {
			if (score >= 60) { // (score < 60 && score <=100)
				result = "합격";
			}
			else if (score >= 40) { // (score <=40 && score >=59)
				result = "불합격";
			}
			else {
				result = "과락";
		}
			System.out.println("귀하는 " + result + "입니다.");
		
			System.out.println("<<< 3항 연산자 >>>");
			//결과 = 조건식 ? 참결과 : 거짓결과;
			String result2 = (score < 0 || score > 100) ? "잘못된정보" : (score >= 60) ? "합격" : (score >= 40) ? "불합격" : "과락";
			System.out.println(score + " : " + result2);
			
			
			
			
			//쇼핑 옷살때 얼마이상사면 몇퍼센트 할인인지
	}
	}	}
