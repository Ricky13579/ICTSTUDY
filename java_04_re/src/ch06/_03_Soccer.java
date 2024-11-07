package ch06;

public class _03_Soccer {
	String league; // 소속 리그
	String team; // 소속팀
	String pos; // 선수 포지션
	private int trophy; // 트로피 개수
	private double height; // 선수 키
	private double weight; // 선수 몸무게
	private String name; // 선수 이름
	
	public void setTrophy(int trophy) {
		this.trophy = trophy;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void soccerinfo() {
		System.out.println(name+" 선수는 "+league+"에 있는 "+team+"에서 뛰고 있는 "+pos+"입니다.");
		System.out.println(name+" 선수의 트로피 개수는 현재 "+trophy+"개입니다.");
		System.out.println(name+" 선수의 키는 "+height+"cm이며, 몸무게는 "+weight+"kg입니다.");
	}
}
