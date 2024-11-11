package ch04;

public class _06_Student {
	/*
	    * static 변수 = 클래스 변수 = 공유변수
	    * - 프로그램이 실행되어 메모리에 올라갔을 때 딱 한번 데이터영역 메모리 공간에 할당된다.
	    * 객체를 생성하지 않고, 바로 클래스명으로 접근가능하다.
	    * 인스턴스마다 생성되는 변수가 아니라 클래스에 속해 한번만 생성되는 변수이고,
	    * 여러 인스턴스가 공유한다.
	    * 인스턴스가 생성되지 않아도 사용할 수 있기 때문에 클래스명.static 변수, 클래스명.static 메서드 사용가능
	    * - static 변수나 메서드는 static 메서드에서 호출가능
	    *   static 메서드에서 인스턴스 변수나 메서드를 호출시 컴파일 오규가 난다.
	    *   static 메서드는 프로그램 실행시 자동으로 메모리에 올라가나, 일반메서드는 객체를 생성해야 메모리에 올라간다. 
	 */
	
	static int serialNum = 1000;
	int studentID; 	// 학번	1000	1001
	String name;	// 이름	이지원		손수경
	
	// 디폴트
	public _06_Student(){
		serialNum++;
		this.studentID = serialNum;
	}
	
	// getter, setter
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void studentInfo() {
		System.out.println(getName()+" 학생의 학번은 "+getStudentID()+"번입니다.");
		System.out.println();
	}
}
