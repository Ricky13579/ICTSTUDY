package ch06;

public class _02_ExamMain {
// 모의고사 점수
	public static void main(String[] args) {
		_02_Exam my = new _02_Exam();
		my.setName("지명준");
		my.setKor(75);
		my.setMath(80);
		my.setEng(90);
		my.setTotal();
		my.setAvg();
		my.result();
	}

}
