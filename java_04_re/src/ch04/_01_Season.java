package ch04;

public class _01_Season {
	public static void main(String[] args) {
		String season = "";
		int month = 15;
		
		switch(month) {
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		case 12: case 1: case 2:
			season = "겨울";
			break;
		default :
			System.out.println("잘못된 날짜입니다.");
			break;
		}
		System.out.println(month+"월은 "+season+"의 계절입니다.");
	}

}
