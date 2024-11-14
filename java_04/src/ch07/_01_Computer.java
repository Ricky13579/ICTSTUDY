package ch07;

// 부모클래스 - 추상클래스
public abstract class _01_Computer {
	
	// 일반메서드 구현
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 추상메서드 선언
	public abstract void display();
	public abstract void typing();
}
