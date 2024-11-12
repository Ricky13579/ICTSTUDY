package ch09;

public class _01_Turtle extends _01_Reptile{
	public _01_Turtle() {
		System.out.println("<<< _01_Turtle 자식생성자>>>");
	}
	
	public void venom() {
		System.out.println(getKind() + "는 독을 가지고 있지 않습니다.");
		System.out.println();
	}
}
