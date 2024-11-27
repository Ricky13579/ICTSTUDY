package test.EX01;

public class _01_CustomerMain {
	public static void main(String[] args) {
		System.out.println("<<< 객체 생성(디폴트 생성자) + setter >>>");
		_01_Customer kim = new _01_Customer();
		
		kim.setCustomerID("C001");
		kim.setCustomerName("김태희");
		kim.setBonusPoint(10);
		kim.setBonusRate(0.05);
		
		kim.customerInfo();
		
		// getter로 출력
		System.out.println("<<< 객체 생성(매개변수 생성자) -> 멤버변수 >>>");
		_01_Customer rain = new _01_Customer("C002", "비", 5, 0.03);
		rain.customerInfo();
	}
}
