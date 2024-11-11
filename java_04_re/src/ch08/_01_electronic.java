package ch08;

import java.text.DecimalFormat;

// 가전제품(생성자)
public class _01_electronic {
	DecimalFormat df = new DecimalFormat("###,###");
	
	private String type;
	private String brand;
	private String color;
	private int price;
	
	public _01_electronic() {}
	
	public _01_electronic(String type, String brand, String color, int price) {
		this.type = type;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public _01_electronic(String type, String brand) {
		this.type = type;
		this.brand = brand;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
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
	
	public void myInfo() {
		System.out.println("제가 사고 싶은 가전제품은 "+getType()+"입니다.");
		System.out.println("제가 원하는 가전제품의 브랜드는 "+getBrand()+"입니다.");
		System.out.println("제가 원하는 가전제품의 색깔은 "+getColor()+"입니다.");
		System.out.println("제가 원하는 가전제품의 가격은 "+df.format(getPrice())+"원입니다.");
		System.out.println();
	}
	
	public void elecInfo() {
		System.out.println("제가 사고 싶은 가전제품은 "+getType()+"입니다.");
		System.out.println("제가 원하는 가전제품의 브랜드는 "+getBrand()+"입니다.");
		System.out.println();
	}
}
