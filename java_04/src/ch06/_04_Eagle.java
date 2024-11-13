package ch06;

// 자식클래스
public class _04_Eagle extends _04_Animal{
	
	// 멤버메서드
	@Override
	public void move() {
		System.out.println("독수리가 하늘로 납니다.");	
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 하늘을 납니다.");
	}
}
