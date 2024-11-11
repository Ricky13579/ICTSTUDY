package ch04;

import java.text.DecimalFormat;

public class _04_Car {
	
	// 천 단위 기호
	DecimalFormat df = new DecimalFormat("###,###");
	
	// 멤버변수
	private String brand;
	private String model;
	private String color;
	private int price;
	
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void CarInfo() {
		System.out.println("제가 타고 싶은 차의 브랜드는 "+getBrand()+"입니다.");
		System.out.println("제가 타고 싶은 차의 모델은 "+getModel()+"입니다.");
		System.out.println("차의 색깔은 "+getColor()+"으로 하고 싶습니다.");
		System.out.println("차의 가격은 "+df.format(getPrice())+"원 정도면 적당할 것 같습니다.");
	}
}
