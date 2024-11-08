package ch04;

public class _03_Me {
	// 멤버변수
	private String name; // 이름
	private int age; // 나이
	private String gender; // 성별
	private String hobby; // 취미
	
	// 멤버메서드 getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void myInfo() {
		System.out.println("제 이름은 "+getName()+"입니다.");
		System.out.println("제 나이는 "+getAge()+"살입니다.");
		System.out.println("저는 "+getGender()+"입니다.");
		System.out.println("제 취미는 "+getHobby()+"입니다.");
	}
}
