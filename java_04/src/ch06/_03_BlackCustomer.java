package ch06;

public class _03_BlackCustomer extends _03_Customer{
	
	// 멤버변수
	private int penalty;	// 1000
	
	public _03_BlackCustomer() {
		System.out.println("<<< _03_BlackCustomer 자식생성자 >>>");
	}
	
	public _03_BlackCustomer(String id, String name, String grade, int penalty) {
		super(id, name, grade);
		this.penalty = penalty;
	}
	
	public int getPenalty() {
		return penalty;
	}
	
	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(getName() + "님의 패널티는 " + getPenalty() + "입니다.");
		System.out.println();
	}
}
