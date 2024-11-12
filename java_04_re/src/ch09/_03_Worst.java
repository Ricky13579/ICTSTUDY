package ch09;

public class _03_Worst extends _03_FootballClub{
	private int penalty;
	
	public _03_Worst() {
		System.out.println("<<< _03_Worst 자식 생성자 >>>");
	}
	
	public _03_Worst(String name, String position, String country, int back, int penalty) {
		super(name, position, country, back);
		this.penalty = penalty;
	}
	
	public int getPenalty() {
		return penalty;
	}
	
	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(getName() + " 선수는 커리어 중 " + getPenalty() + "번 동안 마찰이 있었던 최악의 선수입니다.");
		System.out.println();
	}
}
