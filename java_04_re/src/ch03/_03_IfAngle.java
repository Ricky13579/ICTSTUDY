package ch03;

// 각의 종류
// 180도 초과부터는 그냥 무명(아무 이름도 없음)이라고 설정
public class _03_IfAngle {
	public static void main(String[] args) {
		int angle = 210;
		String name = "";
		if(0 > angle || angle > 180) {
			name = "무명";
		}else if(angle >0 && angle <90) {
			name = "예각";
		}else if(angle == 90) {
			name = "직각";
		}else if(angle > 90 && angle < 180){
			name = "둔각";
		}else {
			name="평각";
		}
		System.out.println(angle+"도는 "+name+"입니다.");
	}

}
