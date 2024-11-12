package ch06;

// 부모 클래스
public class _03_Customer {
	
	// 멤버변수
	private String id;			// 고객ID				C1001	C1002
	private String name;		// 고객명				김태희		진상
	private String grade;		// 고객등급				vip		black
	
	// 디폴트 생성자
	public _03_Customer() {
		System.out.println("<<< _03_Customer 부모생성자 >>>");
	}
	
	public _03_Customer(String id, String name, String grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void printInfo() {
		System.out.println(getName() + "님의 고객ID는 " + getId() + "입니다.");
		System.out.println(getName() + "님은 " + getGrade()+"등급입니다.");
	}
}
