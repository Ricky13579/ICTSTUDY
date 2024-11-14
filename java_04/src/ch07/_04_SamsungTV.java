package ch07;

// 자식클래스
public class _04_SamsungTV implements _04_TV{
	
	@Override
	public void turnOn() {
		System.out.println(_04_TV.BRAND+" tv를 켜다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println(_04_TV.BRAND+" tv를 끄다.");
	}
}
