package ch07;

public class _02_ManualCar extends _02_Car{
	
	@Override
	public void drive() {
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 방향 전환을 합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("사람이 브레이크를 밟아서 멈춥니다.");
	}
}
