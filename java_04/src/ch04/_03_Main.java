package ch04;

public class _03_Main {
	public static void main(String[] args) {
		// 객체생성
		_03_Me my = new _03_Me();
		
		// setter로 값전달
		my.setName("지명준");
		my.setAge(24);
		my.setGender("남자");
		my.setHobby("축구경기 시청");
		
		// 출력 getter
		my.myInfo();
	}
}
