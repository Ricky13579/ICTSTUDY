package ch09;

public class _02_Main {
	public static void main(String[] args) {
		_02_Soccer son = new _02_Soccer();
		son.setKind("축구");
		son.setCelebrity("손흥민");
		son.setMember(11);
		son.printInfo();
		son.foot();
		
		_02_Basketball curry = new _02_Basketball();
		curry.setKind("농구");
		curry.setCelebrity("스테판 커리");
		curry.setMember(5);
		curry.printInfo();
		curry.hand();
	}
}
