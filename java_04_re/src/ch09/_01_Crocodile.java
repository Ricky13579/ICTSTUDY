package ch09;

public class _01_Crocodile extends _01_Reptile{
	public _01_Crocodile() {
		System.out.println("<<< _01_Crocodile 자식생성자>>>");
	}
	
	public void venom() {
		System.out.println(getKind() + "는 독을 가지고 있지 않습니다.");
		System.out.println();
	}
}
