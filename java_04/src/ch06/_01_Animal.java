package ch06;

// 부모클래스(공통)
public class _01_Animal {
	
	// 멤버변수
	private String kind;	// 종류	고양이		멍뭉이
	private int legs;		// 다리	4		4
	private int weight;		// 체중	5		10
		
	// 디폴트 생성자
	public _01_Animal() {}
		
	// getter, setter
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
		
	public int getWeight() {
		return weight;
	}
		
	public void setWeight(int weight) {
		this.weight = weight;
	}
		
	// 멤버변수 정보 출력
	public void printInfo() {
		System.out.println(getKind() + "의 다리의 개수는 "+getLegs() + "개입니다.");
		System.out.println(getKind() + "의 몸무게는 "+getWeight() + "Kg 정도입니다.");
	}
}
