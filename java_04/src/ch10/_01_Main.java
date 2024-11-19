package ch10;

public class _01_Main {
	public static void main(String[] args) {
		
		// => 불가(생성자가 private)
		// _01_Company hong = new _01_Company(); 
		
		// static 메서드 접근 : 클래스명.static 메서드()
		_01_Company hong = _01_Company.getInstance();
		hong.gotoWork("홍길동");
		hong.Work("홍길동");
		hong.gotoCafe("홍길동");
		hong.gotoHome("홍길동");
		System.out.println();
		
		// _01_Company kim = new _01_Company();
		// kim.gotoWork("김태희");
		
		_01_Company kim = _01_Company.getInstance();
		kim.gotoWork("김태희");
		kim.Work("김태희");
		kim.gotoCafe("김태희");
		kim.gotoHome("김태희");
		System.out.println();
		
		System.out.println(hong == kim); // true => 주소값이 동일하다.
		System.out.println(hong); // ch10._01_Company@626b2d4a
		System.out.println(kim); // ch10._01_Company@626b2d4a
	}
}
