package ch06;

public class _04_Human extends _04_Animal {
	
	// 멤버메서드
	@Override
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
