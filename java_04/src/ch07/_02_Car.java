package ch07;

// 부모클래스
public abstract class _02_Car {

	public abstract void drive();
	public abstract void stop();
	
	public void turnOn() {
		System.out.println("차의 시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("차의 시동을 끕니다.");
	}
	
	// 템플릿메서드 - 자동차가 달리는 방법을 순서대로 구현
	final void run() {
		turnOn();
		drive();
		stop();
		turnOff();
		System.out.println();
	}
}
