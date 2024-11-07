package ch03;
// 축구
// 이긴 팀은 승점 +3점, 지는 팀은 승점 0점, 비기면 양 팀 모두 승점 +1점
public class _02_IfSoccer {
	public static void main(String[] args) {
		int home =2, away = 5, home_point = 0, away_point = 0;
		String result = "";
		if(home > away) {
			home_point += 3;
			result = "홈팀의 승리";
		}else if(home == away) {
			home_point += 1;
			away_point += 1;
			result = "무승부";
		}else {
			away_point += 3;
			result = "홈팀의 패배";
		}
		System.out.println("합산스코어 "+home+" VS "+away+"로 "+result+"로 경기가 종료되었습니다.");
		System.out.println("홈팀이 승점 "+home_point+"점 원정팀은 승점 "+away_point+"점을 획득하면서 경기가 종료되었습니다.");
	}

}
