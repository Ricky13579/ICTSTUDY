package ch06;

// 자식클래스
public class _04_Fish extends _04_Animal {
	
	// 멤버메서드
	@Override
	public void move() {
		System.out.println("물고기가 바다속에서 헤엄칩니다.");
	}
	
	public void eating() {
		System.out.println("물고기가 미끼를 물었습니다.");
	}
}
