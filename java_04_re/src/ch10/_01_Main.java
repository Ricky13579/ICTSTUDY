package ch10;

public class _01_Main {
	public static void main(String[] args) {
		
		System.out.println("<<< 디폴트 생성자로 호출 >>>");
		_01_SportsGame fifa4 = new _01_SportsGame();
		fifa4.talk();
		
		_01_ShootingGame watch = new _01_ShootingGame();
		watch.talk();
		
		_01_RPGGame lol = new _01_RPGGame();
		lol.talk();
		
		System.out.println("\n<<< 다형성 적용 >>>");
		_01_Game fifa = new _01_SportsGame();
		fifa.talk();
		
		_01_Game sudden = new _01_ShootingGame();
		sudden.talk();
		
		_01_Game linege = new _01_RPGGame();
		linege.talk();
		
		System.out.println("\n<<< 매개변수를 통한 다형성 적용 >>>");
		script(new _01_SportsGame());
		script(new _01_ShootingGame());
		script(new _01_RPGGame());
	}
	
	public static void script(_01_Game game) {
		game.talk();
	}
}
