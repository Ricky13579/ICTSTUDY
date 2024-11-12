package ch09;
// 축구선수
public class _03_FootballClub {
	private String name;
	private String club;
	private String position;
	private String country;
	private int back;
	
	public _03_FootballClub() {
		System.out.println("<<< _03_Football 부모 클래스 >>>");
	}
	
	public _03_FootballClub(String name, String club, String position, String country, int back) {
		this.name = name;
		this.club = club;
		this.position = position;
		this.country = country;
		this.back = back;
	}
	
	public _03_FootballClub(String name, String position, String country, int back) {
		this.name = name;
		this.position = position;
		this.country = country;
		this.back = back;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getClub() {
		return club;
	}
	
	public void setClub(String club) {
		this.club = club;
	}
	
	public int getBack() {
		return back;
	}
	
	public void setBack(int back) {
		this.back = back;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void printInfo() {
		System.out.println(getName() + "선수의 등번호는 " + getBack() + "번입니다.");
		System.out.println(getName() + "선수는 " + getCountry() + " 국적의 선수입니다.");
		System.out.println(getName() + "선수의 포지션은 " + getPosition() + "입니다.");
	}
}
