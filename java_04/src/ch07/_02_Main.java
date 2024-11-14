package ch07;

public class _02_Main {
	public static void main(String[] args) {
		System.out.println("<<< 일반 자동차는 어떻게 운전할까요? >>>");
		_02_Car manual = new _02_ManualCar();
		manual.run();
		
		System.out.println("<<< 자율주행 자동차는 어떻게 운전할까요? >>>");
		_02_Car ai = new _02_AICar();
		ai.run();
	}
}
