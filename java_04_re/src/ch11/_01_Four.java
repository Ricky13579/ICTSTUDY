package ch11;

public class _01_Four extends _01_Elements implements _01_Fire, _01_Water, _01_Air, _01_Land{
	
	@Override
	public void elements() {
		System.out.println("그리고 그 태초의 원소는 총 4개였다.");
		System.out.println("이를 모아서 4원소라고 한다.");
	}

	@Override
	public void soft() {
		System.out.println("흙은 부드럽습니다.");
	}

	@Override
	public void thick() {
		System.out.println("하지만 흙은 때론 단단함을 발휘할 때도 있습니다.");
	}

	@Override
	public void solid(String state) {
		System.out.println(state+"은 고체 상태의 원소입니다.");
	}

	@Override
	public void invisible() {
		System.out.println("공기는 눈에 보이지 않습니다.");
	}

	@Override
	public void breath() {
		System.out.println("공기는 우리가 숨을 쉴 수 있게 도와줍니다.");
	}

	@Override
	public void air(String state) {
		System.out.println(state+"는 기체 상태의 원소입니다.");
	}

	@Override
	public void cool() {
		System.out.println("물은 시원합니다.");
	}

	@Override
	public void cold() {
		System.out.println("물은 차가울 수도 있습니다.");
	}

	@Override
	public void liquid(String state) {
		System.out.println(state+"은 액체 상태의 원소입니다.");
	}

	@Override
	public void warm() {
		System.out.println("불은 따뜻합니다.");
	}

	@Override
	public void burn() {
		System.out.println("하지만 불은 우리를 불태울 수도 있습니다.");
	}

	@Override
	public void plasma(String state) {
		System.out.println(state+"은 플라즈마 상태의 원소입니다.");
	}
	
	public void ignis() {
		warm();
		burn();
		plasma(_01_Fire.state);
		System.out.println();
	}
	
	public void terra() {
		soft();
		thick();
		solid(_01_Land.state);
		System.out.println();
	}
	
	public void aqua() {
		cool();
		cold();
		liquid(_01_Water.state);
		System.out.println();
	}
	
	public void ventus() {
		invisible();
		breath();
		air(_01_Air.state);
		System.out.println();
	}
	
}
