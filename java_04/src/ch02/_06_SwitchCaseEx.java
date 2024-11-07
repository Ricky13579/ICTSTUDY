package ch02;

public class _06_SwitchCaseEx {
	public static void main(String[] args) {
		
		int score = 40;
		char grade = ' ';
		if((score > 100) || (score < 0 )) {
			grade = 'w';
		}
		else {
			if(score >= 90) {
				grade = 'A';
			}
			else if (score >= 80) {
				grade = 'B';
			}
			else if (score >= 70) {
				grade = 'C';
			}
			else if (score >= 60) {
				grade = 'D';
			}
		}
		
		System.out.println("==다시==");
		score = 70;
		
		switch(score/10) {
			case 10 : case 9 : 
				grade = 'A';
				break;
			case 8 : 
				grade = 'B';
				break;
			case 7 : 
				grade = 'C';
				break;
			case 6 : 
				grade = 'D';
				break;
			default : 
				grade = 'f';
			}
		System.out.println("점수 "+ score + grade);
		}
	
}
