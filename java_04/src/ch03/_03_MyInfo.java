package ch03;

public class _03_MyInfo {
	// 객체 생성
	// 클래스명 참조변수 = new 클래스명(); 
	// 참조변수에 클래스의 주소값 들어있다.
	// 참조변수.멤버변수 = 값;
	// 참조변수.메소드();
	
	// 멤버변수(속성)
	private String name; // 이름
	private String birthday; // 생일
	private int money; // 용돈
	private String address; // 주소
	
	// 멤버메서드(기능)
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	// 출력정보
	public void myInfo() {
		System.out.println("제 이름은 "+name+"입니다.");
		System.out.println("제 생일은 "+birthday+"입니다.");
		System.out.println("전 "+money+"원 정도의 용돈을 받고 있습니다.");
		System.out.println("저는 "+address+"에 살고 있습니다.");
		System.out.println("-----------------------");
	}
}
