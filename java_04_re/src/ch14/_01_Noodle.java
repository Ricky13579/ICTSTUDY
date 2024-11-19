package ch14;

public class _01_Noodle {
	private String noodle;
	
	private _01_Noodle() {
		System.out.println("라면을 끓이자!!!");
	}
	
	private static _01_Noodle instance = new _01_Noodle();
	
	public static _01_Noodle getInstance() {
		if(instance == null) {
			instance = new _01_Noodle();
		}
		return instance;
	}
	
	public void Water(String noodle) {
		System.out.println("먼저 "+ noodle + "을(를) 끓이기 전에 물부터 끊인다.");
	}
	
	public void Soup(String noodle) {
		System.out.println("그 다음 물이 끓으면 "+ noodle + "에 동봉된 라면수프를 넣는다.");
	}
	
	public void Noodle(String noodle) {
		System.out.println("그 다음으로 "+ noodle + "에 동봉된 면을 넣는다.");
	}
	
	public void Else(String noodle) {
		System.out.println(noodle+"에 적힌 설명서대로 끓이다가 마지막으로 계란, 파 등 넣고 싶은 재료들을 넣으면 "+noodle+"이 완성된다.");
	}
}
