package ch06;

public class _04_Main {
	public static void main(String[] args) {
		
		// 자식클래스 참조변수 = new 자식클래스();
		_04_Human human = new _04_Human();
		human.move(); // 사람이 움직입니다. => 자식메서드 호출
		human.readBook();
		
		_04_Tiger tiger = new _04_Tiger();
		tiger.move(); // 호랑이가 네 발로 뜁니다. => 자식메서드 호출
		
		_04_Eagle eagle = new _04_Eagle();
		eagle.move(); // 독수리가 하늘을 납니다. => 자식메서드 호출
		
		_04_Fish fish = new _04_Fish();
		fish.move(); // 물고기가 바다속에서 헤엄칩니다. => 자식메서드 호출
		
		// 다형성
		System.out.println("\n<<< 다형성 적용 >>>");
		
		// 상속이 전제되어야 한다.
		// 부모클래스 참조변수 = new 자식클래스();
		_04_Animal aniHuman = new _04_Human(); // 자료형이 부모클래스타입이어도 재정의된 자식메서드가 호출
		aniHuman.move();
		_04_Human h = (_04_Human)aniHuman; // 다운캐스팅 => 자식클래스 참조변수 = (자식클래스)부모클래스;
		h.readBook();
		
		_04_Animal aniEagle = new _04_Eagle();
		aniEagle.move();
		_04_Eagle e = (_04_Eagle)aniEagle;
		e.flying();
		
		_04_Animal aniTiger = new _04_Tiger();
		aniTiger.move();
		_04_Tiger t = (_04_Tiger)aniTiger;
		t.hunting();
		
		_04_Animal aniFish = new _04_Fish();
		aniFish.move();
		_04_Fish f = (_04_Fish)aniFish;
		f.eating();
		
		System.out.println("\n<<< 매개변수를 통한 다형성 적용 >>>");
		animalMove(new _04_Human());
		animalMove(new _04_Eagle());
		animalMove(new _04_Tiger());
		animalMove(new _04_Fish());
		
	} // main
	
	public static void animalMove(_04_Animal animal) {
		animal.move();
		if (animal instanceof _04_Human) {
			((_04_Human) animal).readBook();
		}
		else if(animal instanceof _04_Eagle) {
			((_04_Eagle)animal).flying();
		}
		else if(animal instanceof _04_Tiger) {
			((_04_Tiger)animal).hunting();
		}
		else if(animal instanceof _04_Fish){
			((_04_Fish)animal).eating();
		}
	} // animalMove
}
