package ch07;

// 자식 클래스
public class _01_Desktop extends _01_Computer{

	@Override
	public void display() {
		System.out.println("_01_Desktop - display()");
	}

	@Override
	public void typing() {
		System.out.println("_01_Desktop - typing()");
	}
}
