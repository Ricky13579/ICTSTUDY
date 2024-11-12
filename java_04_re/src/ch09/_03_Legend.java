package ch09;

public class _03_Legend extends _03_FootballClub{
	private int year;
	
	public _03_Legend() {
		System.out.println("<<< _03_Legend 자식 생성자 >>>");
	}
	
	public _03_Legend(String name, String club, String position, String country, int back, int year) {
		super(name, club, position, country, back);
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(getName() + " 선수는 " + getClub() + "에 " + getYear() + "년 동안 헌신한 레전드 선수입니다.");
		System.out.println();
	}
	
}
