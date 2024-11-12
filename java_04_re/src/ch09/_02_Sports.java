package ch09;

public class _02_Sports {
	private String kind;
	private String celebrity;
	private int member;
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String getCelebrity() {
		return celebrity;
	}
	
	public void setCelebrity(String celebrity) {
		this.celebrity = celebrity;
	}
	
	public int getMember() {
		return member;
	}
	
	public void setMember(int member) {
		this.member = member;
	}
	
	public void printInfo() {
		System.out.println(getKind() + "는 " + getMember() + "명이 한팀으로 하는 스포츠입니다.");
		System.out.println(getKind() + "에서 유명한 선수로는 " + getCelebrity() + " 선수가 있습니다.");
	}
}
