package ch04;

public class _06_StudentMain {
	public static void main(String[] args) {
		_06_Student lee = new _06_Student();
		lee.setName("이지원");
		System.out.println("SerialNum : "+_06_Student.serialNum);
		lee.studentInfo();
		
		_06_Student son = new _06_Student();
		System.out.println("SerialNum : "+_06_Student.serialNum);
		son.setName("손수경");
		son.studentInfo();
		
	}
}
