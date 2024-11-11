package ch04;
public class _04_CarMain {
	public static void main(String[] args) {
		System.out.println("<<< 디폴트 생성자 + setter >>>");
		
		// 객체생성 -> 힙(Heap) 메모리에 만들어짐
		_04_Car car = new _04_Car();
		
		// setter로 멤버변수에 값 전달
		car.setBrand("삼성(르노코리아)");
		car.setModel("SM5");
		car.setPrice(10000000);
		car.setMadein("스웨덴");
		
		// getter
		car.CarInfo();
		
		System.out.println("---------------------------------------");
		System.out.println("<<< 매개변수 생성자 >>>");
		_04_Car car2 = new _04_Car("제네시스", "gv80", 50000000, "한국");
		car2.CarInfo();
	}
}