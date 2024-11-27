package test.EX01;

// DTO(Data Transfer Object)
public class _01_Customer {
	// 멤버변수
	private String customerID;		// 고객아이디		C001		C002
	private String customerName;	// 고객명			김태희			비
	private int bonusPoint;			// 보너스포인트		10			5
	private double bonusRate;		// 포인트 적립비율	0.05		0.03
	
	// 생성자
	// 디폴트 생성자
	public _01_Customer() {}
	
	// 매개변수 생성자
	public _01_Customer(String customerID, String customerName, int bonusPoint, double bonusRate) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.bonusPoint = bonusPoint;
		this.bonusRate = bonusRate;
	}
	
	// 멤버메서드 getter, setter
	public String getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public int getBonusPoint() {
		return bonusPoint;
	}
	
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	public double getBonusRate() {
		return bonusRate;
	}
	
	public void setBonusRate(double bonusRate) {
		this.bonusRate = bonusRate;
	}
	
	public void customerInfo() {
		System.out.println(getCustomerName()+" 고객님의 아이디는 "+getCustomerID()+"입니다.");
		System.out.println("고객님의 보너스 포인트는 "+getBonusPoint()+"포인트로 포인트 적립비율은 "+getBonusRate()+"%입니다.");
		System.out.println();
	}

}
