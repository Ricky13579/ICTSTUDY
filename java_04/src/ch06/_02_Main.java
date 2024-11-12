package ch06;

public class _02_Main {
	public static void main(String[] args) {
		System.out.println("[ _02_FireCar 객체생성 + setter로 멤버변수에 값 전달 ]");
		_02_FireCar fc = new _02_FireCar();
		fc.setKind("소방차");
		fc.setSpeed(80);
		fc.setColor("red");
		
		fc.printInfo();
		fc.water();
		
		System.out.println("[ _02_PoliceCar 객체생성 + setter로 멤버변수에 값 전달 ]");
		_02_PoliceCar pc = new _02_PoliceCar();
		pc.setKind("경찰차");
		pc.setSpeed(100);
		pc.setColor("white");
		
		pc.printInfo();
		pc.siren();
	}
}
