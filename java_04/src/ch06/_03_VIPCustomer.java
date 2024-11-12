package ch06;

// 자식 클래스
public class _03_VIPCustomer extends _03_Customer{
	
	// 멤버변수
	private int agentID;		// vip 고객상담원ID		9999
	private double saleRatio;	// 할인율				0.01
	
	// 디폴트생성자
	public _03_VIPCustomer() {
		super(); // 부모디폴트 생성자 호출, 생략시 컴파일러가 추가해서 호출
		System.out.println("<<< _03_VIPCustomer 자식생성자 >>>");
	}
	
	// 매개변수 생성자
	public _03_VIPCustomer(String id, String name, String grade, int agentID, double saleRatio) {
		super(id, name, grade); // 부모의 매개변수 생성자 호출
		this.agentID = agentID;
		this.saleRatio = saleRatio;
	}
	
	// 멤버메서드 getter, setter
	public int getAgentID() {
		return agentID;
	}
	
	public void setAgentID(int AgentID) {
		this.agentID = AgentID;
	}
	
	public double getSaleRatio() {
		return saleRatio;
	}
	
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	// printInfo에서 vip 정보 출력
	// 오버라이드 => 부모의 메서드를 재정의하며, 자식의 메서드가 실행된다. (전제조건 : 상속)
	// 부모메서드의 반환형, 메서드명, 매개변수 개수와 자료형이 자식메서드와 모두 같아야 한다.
	
	/*
	 * [면접] 오버로드 VS 오버라이드
	 * @Override 어노테이션 : "이 메서드는 재정의된 메서드입니다."라고 컴파일러에게 명확히 알려주는 역할을 한다.
	 * 오버라이딩(=재정의)
	 * - 자식클래스의 메서드가 부모클래스의 메서드를 오버라이드(재정의)한다라고 말한다.
	 * - 상속에서 부모클래스의 메서드를 변경하고자 할 때 사용한다.
	 * - 메서드명, 매개변수, 매개변수 자료형, 반환형까지 모두 동일해야 한다.
	 *  (동일하지 않으면 컴파일러가 다른 메서드로 인식한다.)
	 * - 호출시 오버라이딩된 자식메서드가 호출된다.
	 *  (오버라이드 목적 : 부모클래스의 메서드를 변경해서 자식쪽에서 호출하고자 하는 의도)
	 */
	
	// 오버라이딩(재정의)
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(getName() + "님의 vip 고객상담원ID는 " + getAgentID() + "입니다.");
		System.out.println(getName() + "님의 할인율은 " + getSaleRatio()+"입니다.");
		System.out.println();
	}
}
