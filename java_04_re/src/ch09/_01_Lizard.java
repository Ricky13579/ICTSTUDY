package ch09;

public class _01_Lizard extends _01_Reptile{
	public _01_Lizard() {
		System.out.println("<<< _01_Lizard 자식생성자>>>");
	}
	
	public void venom() {
		System.out.println(getKind() + "은 독을 가지고 있는 종도 있고, 없는 종도 있습니다.");
		System.out.println();
	}
}
