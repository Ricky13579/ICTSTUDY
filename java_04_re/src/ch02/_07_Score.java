package ch02;

public class _07_Score {
	public static void main(String[] args) {
		int kor = 60;
		int eng = 80;
		int math = 100;
		
		int total = kor+eng+math;
		System.out.println("이번 모의고사 3과목 점수의 합은 "+total+"점이다.");
		
		double avg = total/3.0;
		System.out.println("이번 모의고사 3과목 평균은 "+avg+"점이다.");
	}

}
