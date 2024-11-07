package ch02;

public class _06_Final {
	public static void main(String[] args) {
		/*
		 * 상수 : 프로그램이 실행되는 동안, 값이 변하지 않는 수 또는 변경불가능한 수
		 * 		주로 대문자 사용(변수는 소문자)
		 * 		만약 값을 변경해야 할 경우, 상수를 선언한 곳의 초기값만 변경하면 됨
		 * 
		 * 문법 : final 자료형 변수명;		예) final double PI = 3.14;
		 * 		1) 변수(상수) : 변수의 값 변경불가
		 * 		2) 메서드 : 재정의 불가
		 * 		3) 클래스 : 상속 불가
		 */
		
		// 상수
		final int Attend_Student = 26;
		final int Absent_Student;
		Absent_Student = 0;
		
		System.out.println("--- 상수 ---");
		System.out.println("오늘 이 강의를 듣는 사람은 총 "+Attend_Student+"명이다.");
		System.out.println("오늘 이 강의를 결석한 사람은 총 "+Absent_Student+"명이다.\n");
		
		System.out.println("--- 변수 ---");
		String name = "태풍";
		System.out.println("그 바람의 이름은 "+name+"이다.");
		name = "허리케인";
		System.out.println("하지만 다음주부터는 "+name+"이라고 부르기로 했다.\n");
		
		System.out.println("--- 육하원칙 ---");
		
		final String Who = "나";
		final String When = "11월 1일 13시 20분";
		final String Where = "서강대학교 구내식당";
		final String What = "밥";
		final String How = "도보";
		final String Why = "점심식사";
		
		System.out.println(Who+"는 "+When+"에 "+Where+"으로 "+What+"을 먹기 위해 "+How+"로 "+Why+"를 하러 갔다.");
		
	}

}
