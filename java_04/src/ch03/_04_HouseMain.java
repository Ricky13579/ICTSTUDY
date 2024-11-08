package ch03;

public class _04_HouseMain {
	public static void main(String[] args) {
		/*
		 * 객체(인스턴스) 생성
		 * new 클래스명();
		 */
		_04_House my = new _04_House();
		my.setAddress("서울 어딘가");
		my.setPrice(100000);
		my.setKind("빌라");
		my.setSize(12);
		my.printInfo();
	}
}
