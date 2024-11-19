package ch10;

public class _01_Company {
	
	// 멤버변수
	private String worker;
	
	// 1단계. 디폴트생성자를 private으로 만들기
	private _01_Company() {
		System.out.println("<<< 기본 생성자 >>>");
	}
	
	// 2단계. 클래스 내부에 static으로 유일한 인스턴스 생성하기
	private static _01_Company instance = new _01_Company();
	
	// 3단계. 외부에서 참조할 수 있는 public 메서드 만들기
	// static 메서드 접근 : 클래스명.static 메서드()
	// 스레드의 synchronized(동기화)를 추가시 lock처리 => 성능저하
	// synchronized를 추가안하면 동시에 접근할 수 있으므로 충돌발생해서 객체생성이 안될수 있으므로 if문 추가
	// public static synchronized _01_Company getInstance() {
	public static _01_Company getInstance() {
		if(instance == null) {
			instance = new _01_Company();
		} // synchronized 대체
		return instance;
	}
	
	// 멤버메서드
	// 출근하다.
	public void gotoWork(String worker) {
		System.out.println(worker + " 출근하다!!!");
	}
	
	// 일하다.
	public void Work(String worker) {
		System.out.println(worker + " 일하다!!!!");
	}
	
	// 점심먹다.
	public void gotoCafe(String worker) {
		System.out.println(worker + " 점심먹다!!!");
	}
	
	// 퇴근하다.
	public void gotoHome(String worker) {
		System.out.println(worker + " 퇴근하다!!!");
	}
	
	 /* [면접] 싱글톤패턴
	 * - 인스턴스를 단 하나만 생성하는 디자인 패턴
	 * - static을 응용하여 프로그램 전반에서 사용하는 동일한 인스턴스를 하나만 생성하는 방식
	 * - 접근할 클래스에 여러 메서드가 있을 때, 외부 클래스가 해당 메서드에 접근할 때마다 
	 *   객체를 생성할 필요없이 메서드를 통해 참조변수만 리턴받아 접근한다.
	 *   열번, 백번을 호출해도 항상 같은 주소의 인스턴스가 반횐된다.
	 *  
	 * 싱글톤패턴 생성
	 * - 1단계. 디폴트생성자를 private으로 만들기
	 * - 2단계. 클래스 내부에 static으로 유일한 인스턴스 생성하기
	 * - 3단계. 외부에서 참조할 수 있는 public 메서드 만들기
	 * 
	 * 호출
	 * - 접근클래스명 참조변수 = 접근클래스명.메서드명;
	 */
	 
}
