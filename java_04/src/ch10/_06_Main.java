package ch10;

public class _06_Main {
	public static void main(String[] args) {
		_06_SpreadArgs spread = new _06_SpreadArgs();
		spread.callArgs("치킨", "피자");
		spread.callArgs2("치킨", "피자", "연어스테이크", "파스타");
		spread.callArgs3("소지섭", 100, 90,80,70,60,50,40,30,20,10,0);
	}
}
