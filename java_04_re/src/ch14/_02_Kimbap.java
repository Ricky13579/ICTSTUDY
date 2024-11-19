package ch14;

public class _02_Kimbap {
	
	private String kind;
	private int price;
	private String brand;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return brand + "에서 파는 " + kind + "의 가격은 " + price + "원입니다.\n";
	}
	
	
}
