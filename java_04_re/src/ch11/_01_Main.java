package ch11;

public class _01_Main {
	public static void main(String[] args) {
		System.out.println("<<< 4원소와 그 특징은 각각 어떤 것들이 있을까요? >>>");
		_01_Four elements = new _01_Four();
		elements.ignis();
		elements.terra();
		elements.aqua();
		elements.ventus();
		
		System.out.println("<<< 불의 특징은 무엇일까요? >>>");
		_01_Fire one = new _01_Four();
		_01_Four fire = (_01_Four)one;
		fire.ignis();
		
		System.out.println("<<< 땅의 특징은 무엇일까요? >>>");
		_01_Land two = new _01_Four();
		_01_Four land = (_01_Four)two;
		land.terra();
		
		System.out.println("<<< 물의 특징은 무엇일까요? >>>");
		_01_Water three = new _01_Four();
		_01_Four water = (_01_Four)three;
		water.aqua();
		
		System.out.println("<<< 공기의 특징은 무엇일까요? >>>");
		_01_Air four = new _01_Four();
		_01_Four air = (_01_Four)four;
		air.ventus();
	}
}
