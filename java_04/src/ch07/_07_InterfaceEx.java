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
		two.method2(new Third());
	}
}

class Second{
	public void method2(Third three) {
		System.out.println("Second - method2()");
		three.method3();
	}
}

class Third{
	public void method3() {
		System.out.println("Third - method3()");
	}
}

/*
 * First 클래스 - Method1()
 * Second 클래스 - Method2()
 * Third 클래스 - Method3()
 */
