package ch07;

public class _06_InterfaceEx {
	public static void main(String[] args) {
		A06 a06 = new A06();
		a06.methodA();
	}
}

class A06 {
	public void methodA() {
//		I06 a = new B06(); // 다형성 적용
		I06 i06 = InstanceManager.getInstance(); // 클래스명.static 메서드();
		i06.methodB();
	}
}

// 부모
interface I06{
	public void methodB();
}

// 자식클래스
class B06 implements I06{
	
	@Override
	public void methodB() {
		System.out.println("B06 클래스 - methodB()");
	}
}

class InstanceManager{
	/*
	    * 팩토리 메서드(factory method)
	    * - 객체를 생성하는 정적 팩토리메서드이다.
	    *    이것은 디자인 패턴의 하나로서 객체를 생성하는 부분을 자식클래스에게 위임하는 패턴이다.
	    *    즉 new 연산자를 호출하여 객체를 생성하는 코드를 자식클래스에게 위임하는 패턴이다.
	    *    사용하는 이유는 하나의 클래스가 변경되었을 경우에 다른 클래스의 변경을 최소화하기 위함이다.
	    *    
	    *    팩토리 메서드 이름으로 많이 사용하는 것은 getInstance()이다.
	    *    인터페이스에서 팩토리 메서드를 제공할 때 정적메서드를 사용하게 된다.
	    *    static이므로 클래스명.정적메서드로 접근
	  */
	public static I06 getInstance() {
		return new B06(); // I06 i06 = new I06(); => 다형성 적용
	}
}