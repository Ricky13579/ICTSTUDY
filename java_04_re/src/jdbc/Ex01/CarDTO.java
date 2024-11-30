package jdbc.Ex01;

public class CarDTO {
	private int carNo;
	private String kind;
	private String manu_comp;
	private int price;
	
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getManu_comp() {
		return manu_comp;
	}
	public void setManu_comp(String manu_comp) {
		this.manu_comp = manu_comp;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CarDTO [carNo=" + carNo + ", kind=" + kind + ", manu_comp=" + manu_comp + ", price=" + price + "]";
	}
	
}
