package ch04;
public class _04_CarMain {
	public static void main(String[] args) {
		// 객체생성 -> 힙(Heap) 메모리에 만들어짐
		_04_Car mycar = new _04_Car();
		
		// setter
		mycar.setBrand("삼성(르노코리아)");
		mycar.setModel("SM5");
		mycar.setColor("실버");
		mycar.setPrice(10000000);
		
		// getter
		mycar.CarInfo();
	}
}