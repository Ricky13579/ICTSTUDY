package ch07;

public class _03_PhoneMain {
	public static void main(String[] args) {
		_03_Phone mine = new _03_Phone();
		
		mine.setType("Samsung 갤럭시 S21");
		mine.setBrand("SKT");
		mine.setPrice(0);
		mine.setBattery(91);
		
		mine.myInfo();
	}

}
