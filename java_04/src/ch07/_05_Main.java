package ch07;

public class _05_Main {
	public static void main(String[] args) {
		_05_SmartPhone smart = new _05_SmartPhone();
		System.out.println("<<< 다형성 적용 X >>>");
		System.out.println("두 수를 곱한 값은 " + smart.calculate(5, 10) + "입니다.");
		smart.sendSMS();
		smart.receiveSMS();
		smart.play();
		smart.stop();
		System.out.println();
		
		_05_PDA sp = new _05_SmartPhone();
		System.out.println("<<< 다형성 적용 >>>");
		System.out.println("두 수를 곱한 값은 " + sp.calculate(5, 10) + "입니다.");
		((_05_SmartPhone)sp).sendSMS();
		((_05_SmartPhone)sp).receiveSMS();
		((_05_SmartPhone)sp).play();
		((_05_SmartPhone)sp).stop();
	}
}
