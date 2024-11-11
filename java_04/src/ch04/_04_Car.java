package ch04;

import java.text.DecimalFormat;

public class _04_Car {
	
	// 천 단위 기호
	DecimalFormat df = new DecimalFormat("###,###");
	
	// 멤버변수
	private String brand;
	private String model;
	private int price;
	private String madein;
	
	// 생성자 => new 연산자에 의해 호출된다. 클래스이름과 같고, 반환값이 없다. (void 불가)
	// 1-1. 기본생성자(디폴트생성자) => 인스턴스 생성시점에 호출 
	// => 생성자가 하나도 없을때 자바 컴파일러가 자동추가
	// 매개변수 생성자가 존재시 컴파일러가 디폴트생성자를 자동추가하지 않음
	// 개발자가 추가하지 않으면 컴파일 오류 발생
	
	// 디폴트(기본) 생성자 - 자바 컴파일러가 자동으로 생성
	public _04_Car() {
		System.out.println("디폴트 생성자 호출");
	}
	
	// 매개변수 생성자
	public _04_Car(String brand, String model, int price, String madein) {
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.madein = madein;
	}
	
	// 멤버메서드
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMadein() {
		return madein;
	}
	public void setMadein(String madein) {
		this.madein = madein;
	}
	public void CarInfo() {
		System.out.println("제가 타고 싶은 차의 브랜드는 "+getBrand()+"입니다.");
		System.out.println("제가 타고 싶은 차의 모델은 "+getModel()+"입니다.");
		System.out.println("차의 가격은 "+df.format(getPrice())+"원 정도면 적당할 것 같습니다.");
		System.out.println("이 차는 "+getMadein()+"에서 만들었습니다.");
	}
}
