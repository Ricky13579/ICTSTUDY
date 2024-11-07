package ch06;

public class _02_Exam {
	private String name;
	private int kor;
	private int math;
	private int eng;
	private int total;
	private int avg;
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public void setTotal() {
		this.total = eng + kor + math;
	}


	public void setAvg() {
		this.avg = total / 3;
	}


	public void result() {
		System.out.println(name+"의 국어 점수는 "+kor+"점이다.");
		System.out.println(name+"의 수학 점수는 "+math+"점이다.");
		System.out.println(name+"의 영어 점수는 "+eng+"점이다.");
		System.out.println(name+"의 세 과목의 합계는 "+total+"점이다.");
		System.out.println(name+"의 세 과목의 평균은 "+avg+"점이다.");
	}
}
