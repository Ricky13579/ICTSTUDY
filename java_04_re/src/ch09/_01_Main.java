package ch09;
// 파충류
public class _01_Main {
	public static void main(String[] args) {
		System.out.println("*** 우리 함께 파충류에 대해 알아볼까요? ***\n");
		_01_Crocodile croc = new _01_Crocodile();
		croc.setKind("악어");
		croc.setLegs(4);
		croc.setSpeed(30);
		croc.printInfo();
		croc.venom();
		
		_01_Lizard liz = new _01_Lizard();
		liz.setKind("도마뱀");
		liz.setLegs(4);
		liz.setSpeed(50);
		liz.printInfo();
		liz.venom();
		
		_01_Snake snake = new _01_Snake();
		snake.setKind("뱀");
		snake.setLegs(0);
		snake.setSpeed(60);
		snake.printInfo();
		snake.venom();
		
		_01_Turtle turtle = new _01_Turtle();
		turtle.setKind("거북이");
		turtle.setLegs(4);
		turtle.setSpeed(5);
		turtle.printInfo();
		turtle.venom();
	}
}
