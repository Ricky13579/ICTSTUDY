package ch06;

// 부모클래스(공통)
public class _02_Car {
	
	// 멤버변수
	private String kind;		
	private int speed;		
	private String color;	
	
	// 멤버메서드 getter, setter
	public String getKind() {
		return kind;
	}
			
	public void setKind(String kind) {
		this.kind = kind;
	}
			
	public int getSpeed() {
		return speed;
	}
			
	public void setSpeed(int speed) {
		this.speed = speed;
	}
			
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void printInfo() {
		System.out.println(getKind() + "의 속도는 시속 " + getSpeed() + "km입니다.");
		System.out.println(getKind() + "의 색깔은 " + getColor() + "입니다.");
	}
}
