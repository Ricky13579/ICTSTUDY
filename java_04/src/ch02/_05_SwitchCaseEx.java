package ch02;

public class _05_SwitchCaseEx {
	public static void main(String[] args) {
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
		String medal = "참가상";
		
		switch(medal) {
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
			break;
		}
		System.out.println("귀하의 랭킹은 " + ranking + "등이며 " + medal + "입니다.");
		
		
		System.out.println("--- 다시 ---");
		
		int ranking1 = 3;
		char medalColor = 'G';
		
		switch(ranking1) {
			case 1 : medalColor = 'G';
				break;
			case 2 : medalColor = 'S';
				break;
			case 3 : medalColor = 'B';
				break;
			default :
				medalColor = 'A';
		}
		System.out.println(ranking1 + "등 메달 색깔은 " + medalColor);
		}
		
		
	}
