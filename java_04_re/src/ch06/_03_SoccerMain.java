package ch06;
// 손흥민의 정보를 출력해보자
public class _03_SoccerMain {
	public static void main(String[] args) {
		_03_Soccer son = new _03_Soccer();
		son.league = "프리미어리그";
		son.team = "토트넘 홋스퍼";
		son.pos = "공격수";
		son.setName("손흥민");
		son.setTrophy(0);
		son.setHeight(183);
		son.setWeight(78);
		son.soccerinfo();
	}

}
