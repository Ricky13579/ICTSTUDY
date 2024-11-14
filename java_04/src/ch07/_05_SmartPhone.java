package ch07;

public class _05_SmartPhone extends _05_PDA implements _05_Mobile, _05_MP3{
	
	@Override
	public int calculate(int x, int y) {
		return x * y;
	}

	@Override
	public void sendSMS() {
		System.out.println("메시지를 송신합니다.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("메시지를 수신합니다.");
	}
	
	@Override
	public void play() {
		System.out.println("음악을 재생합니다.");
	}
	
	@Override
	public void stop() {
		System.out.println("음악을 정지합니다.");
	}
}
