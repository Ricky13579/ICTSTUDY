package ch10;

public class _02_Main {
	public static void main(String[] args) {
		System.out.println("<<< 자식 클래스로 호출 >>>");
		
		_02_Brazil neymar = new _02_Brazil();
		neymar.soccerInfo();
		neymar.skill();
		System.out.println();
		
		_02_SouthKorea son = new _02_SouthKorea();
		son.soccerInfo();
		son.speed();
		System.out.println();
		
		_02_Belgium kdb = new _02_Belgium();
		kdb.soccerInfo();
		kdb.pass();
		System.out.println();
		
		System.out.println("<<< 다형성 적용 >>>");
		
		_02_SoccerPlayer jr = new _02_Brazil();
		jr.soccerInfo();
		((_02_Brazil)jr).skill(); // 다운캐스팅
		System.out.println();
		
		_02_SoccerPlayer sonny = new _02_SouthKorea();
		sonny.soccerInfo();
		((_02_SouthKorea)sonny).speed();
		System.out.println();
		
		_02_SoccerPlayer kevin = new _02_Belgium();
		kevin.soccerInfo();
		((_02_Belgium)kevin).pass();
		System.out.println();
		
		System.out.println("<<< 매개변수 다형성 적용 >>>");
		playerInfo(new _02_Brazil());
		playerInfo(new _02_SouthKorea());
		playerInfo(new _02_Belgium());
	}
	public static void playerInfo(_02_SoccerPlayer player) {
		player.soccerInfo();
		
		if(player instanceof _02_Brazil) {
			_02_Brazil brazil = (_02_Brazil)player;
			brazil.skill();
			System.out.println();
		}
		else if(player instanceof _02_SouthKorea) {
			_02_SouthKorea korea = (_02_SouthKorea)player;
			korea.speed();
			System.out.println();
		}
		else if(player instanceof _02_Belgium) {
			_02_Belgium belgium = (_02_Belgium)player;
			belgium.pass();
			System.out.println();
		}
	}
}
