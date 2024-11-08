package ch07;

import java.text.DecimalFormat;
// 내가 좋아하는 커피의 정보
public class _01_Coffee {
	DecimalFormat df = new DecimalFormat("###,###");
	
	private String type; // 커피 종류
	private String brand; // 커피 브랜드
	private int price; // 커피 가격
	private String size; // R : 레귤러 	L : 라지
	
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void coffeeInfo() {
		System.out.println("<<< 멤버변수로 출력 >>>");
		System.out.println("제가 좋아하는 커피는 "+type+"입니다.");
		System.out.println("제가 좋아하는 커피 브랜드는 "+brand+"입니다.");
		System.out.println("제가 좋아하는 커피의 가격은 "+df.format(price)+"원입니다.");
		System.out.println("전 보통 커피를 "+size+" 사이즈로 사서 마십니다.");
		System.out.println("------------------------------");
	}
	
	public void getCoffee() {
		System.out.println("<<< getter로 출력 >>>");
		System.out.println("제가 좋아하는 커피는 "+getType()+"입니다.");
		System.out.println("제가 좋아하는 커피 브랜드는 "+getBrand()+"입니다.");
		System.out.println("제가 좋아하는 커피의 가격은 "+df.format(getPrice())+"원입니다.");
		System.out.println("전 보통 커피를 "+getSize()+" 사이즈로 사서 마십니다.");
		System.out.println("------------------------------");
	}
}
