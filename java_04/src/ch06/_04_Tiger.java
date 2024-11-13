package ch06;

public class _04_Tiger extends _04_Animal {
	
	// 멤버메서드
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");	
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
