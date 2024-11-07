package ch03;

public class _01_Student {
	// 멤버변수(속성)
	String studentID;	// 학번 S001
	String name;	// 이름 아이유
	String email;	// 이메일 iu@naver.com
	
	// 멤버메서드(기능, 동작)
	public void printInfo(){
		System.out.println("학번 : "+studentID);
		System.out.println("이름 : "+name);
		System.out.println("이메일 : "+email);
	}
}
