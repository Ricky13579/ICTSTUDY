package ch07;

public class _07_InterfaceEx {
	public static void main(String[] args) {
		First one = new First();
		one.method1(new Second());
	}
}

class First{
	public void method1(Second two) {
		System.out.println("First 클래스 - Method1()");
		two.method2(new Third());
	}
}

class Second{
	public void method2(Third three) {
		System.out.println("Second 클래스 - method2()");
		three.method3(new Fourth());
	}
}

class Third{
	public void method3(Fourth four) {
		System.out.println("Third 클래스 - method3()");
		four.method4();
	}
}

class Fourth{
	public void method4() {
		System.out.println("Fourth 클래스 - method4()");
	}
}

/*
 * First 클래스 - Method1()
 * Second 클래스 - Method2()
 * Third 클래스 - Method3()
 */
