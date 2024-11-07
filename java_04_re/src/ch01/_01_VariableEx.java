package ch01;

public class _01_VariableEx {
	public static void main(String[] args) {
		/*
		 * 제가 좋아하는 축구선수인 손흥민 선수에 대한 정보를 나타내는 코드입니다.
		 */
		System.out.println("*** 제가 제일 좋아하는 축구선수에 대해 알아보려고 합니다. ***\n");
		
		// 이름
		String name = "손흥민";
		System.out.println("제가 제일 좋아하는 축구선수는 " + name + " 선수입니다.");
		
		// 혈액형
		String blood = "AB";
		System.out.println(name + " 선수의 혈액형은 " + blood + "형입니다.");
		
		// 키 및 몸무게
		int height = 183;
		int weight = 78;
		System.out.println(name + " 선수의 키는 "+ height +"이고, 몸무게는 " + weight + "kg입니다.");
		
		// 소속리그 및 소속팀
		String league = "잉글랜드 프리미어리그";
		String team = "토트넘 핫스퍼";
		System.out.println(name + " 선수는 현재 " + league + " " + team + "에서 뛰고 있습니다.");
		
		// 생년월일
		int birthyear = 1992;
		int birthmonth = 7, birthday = 8;
		System.out.println(name + " 선수는 "+birthyear+"년 "+birthmonth+"월 "+birthday+"일에 태어났습니다.\n");
		
		System.out.println("-----------------------------------------------");
		System.out.println(name + " 선수는 " + birthyear + "년 " + birthmonth + "월 " + birthday + "일에 태어났으며 현재는 " + league + " "+ team+"에서 뛰고 있습니다.");
		System.out.println("-----------------------------------------------\n");
		
		System.out.println(name + " 선수는\n" + birthyear + "년 " + birthmonth + "월 " + birthday + "일에 태어났으며 현재는\n" + league + "\n"+ team+"에서 뛰고 있습니다.");
		
	}
}