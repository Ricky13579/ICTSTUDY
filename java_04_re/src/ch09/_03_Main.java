package ch09;

public class _03_Main {
	public static void main(String[] args) {
		System.out.println("[ _03_Legend 객체생성 + 매개변수 생성자로 멤버변수에 값 전달 ]");
		_03_Legend leo = new _03_Legend("리오넬 메시", "FC바르셀로나", "공격수", "아르헨티나", 10, 19);
		leo.printInfo();
		
		System.out.println("[ _03_Worst 객체생성 + 매개변수 생성자로 멤버변수에 값 전달 ]");
		_03_Worst mario = new _03_Worst("마리오 발로텔리", "공격수", "이탈리아", 10, 30);
		mario.printInfo();
	}
}
