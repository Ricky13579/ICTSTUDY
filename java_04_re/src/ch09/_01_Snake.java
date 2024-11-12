package ch09;

public class _01_Snake extends _01_Reptile{
	public _01_Snake() {
		System.out.println("<<< _01_Snake 자식생성자>>>");
	}
	
	public void venom() {
		System.out.println(getKind() + "은 독을 가지고 있는 종도, 없는 종도 있습니다.");
		System.out.println();
	}
}
