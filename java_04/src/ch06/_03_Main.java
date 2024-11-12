package ch06;

public class _03_Main {
	public static void main(String[] args) {
//		_03_VIPCustomer vip = new _03_VIPCustomer();
//		vip.setId("C1001");
//		vip.setName("김태희");
//		vip.setGrade("vip");
//		vip.setAgentID(9999);
//		vip.setSaleRatio(0.01);
		
		System.out.println("[ _03_VIPCustomer 객체생성 + 매개변수 생성자로 멤버변수에 값 전달 ]");
		_03_VIPCustomer vip = new _03_VIPCustomer("C1001", "김태희", "vip", 9999, 0.01);
		vip.printInfo();
		
		System.out.println("[ _03_BlackCustomer 객체생성 + 매개변수 생성자로 멤버변수에 값 전달 ]");
		_03_BlackCustomer black = new _03_BlackCustomer("C1002", "진상", "black", 1000);
		black.printInfo();
	}
}
