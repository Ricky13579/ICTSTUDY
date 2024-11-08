package ch07;

public class _03_Phone {
	private String type; // 휴대폰 기종
	private String brand;// 휴대폰 통신사
	private int price;
	private int battery;
	
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
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	public void myInfo() {
		System.out.println("제 핸드폰의 기종은 "+getType()+"입니다.");
		System.out.println("제 핸드폰의 통신사는 "+getBrand()+"입니다.");
		System.out.println("제 핸드폰의 가격은 "+getPrice()+"원입니다.");
		System.out.println("제 핸드폰의 현재 배터리 잔량은 "+getBattery()+"%입니다.");
	}
}
