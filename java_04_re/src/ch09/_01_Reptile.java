package ch09;
// 파충류
public class _01_Reptile {
	private String kind;
	private int legs;
	private int speed;
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void printInfo() {
		System.out.println(getKind() + "의 다리의 개수는 " + getLegs() + "개입니다.");
		System.out.println(getKind() + "의 속도는 시속 " + getSpeed() + "km입니다.");
	}
}
