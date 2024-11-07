package ch03;

public class _01_StudentMain {
	public static void main(String[] args) {
		// 객체 생성
		// 클래스명 참조변수 = new 클래스명(); // 참조변수에 클래스의 주소값 들어있다.
		// 참조변수.멤버변수 = 값; 참조변수.메소드;
		_01_Student iu = new _01_Student();
		iu.studentID = "S001";
		iu.name = "아이유";
		iu.email = "iu@naver.com";
		iu.address = "맨하튼";
		iu.printInfo();
		System.out.println("-------------");
		
		_01_Student mj = new _01_Student();
		mj.studentID = "S002";
		mj.name = "지명준";
		mj.email = "wpzmfhtm@nate.com";
		mj.address = "천국";
		mj.printInfo();
	}
}
