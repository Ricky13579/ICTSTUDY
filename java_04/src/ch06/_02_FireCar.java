package ch06;

// 자식 클래스
public class _02_FireCar extends _02_Car{
	
	// 디폴트 생성자
	public _02_FireCar() {
		System.out.println("<<< _02_FireCar 디폴트 생성자 >>>");
	}
	
	public void water() {
		System.out.println("물을 뿌리다.~~");
		System.out.println();
	}
}
