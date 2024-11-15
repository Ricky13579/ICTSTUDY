package ch07;

public class _07_InterfaceEx {
	public static void main(String[] args) {
		First one = new First();
		one.method1(new Second());
	}
}

class First{
	public void method1(Second two) {
		System.out.println("First - Method1()");
		two.method2();
	}
}

class Second{
	public void method2() {
		System.out.println("Second - method2()");
	}
}

/*
 * First 클래스 - Method1()
 * Second 클래스 - Method2()
 */
