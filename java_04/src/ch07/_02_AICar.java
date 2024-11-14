package ch07;

public class _02_AICar extends _02_Car{
	
	@Override
	public void drive() {
		System.out.println("자동차가 스스로 운전합니다.");
		System.out.println("자동차가 스스로 방향 전환을 합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("자동차가 스스로 멈춥니다.");
	}
}
