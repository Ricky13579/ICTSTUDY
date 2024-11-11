package ch08;

public class _01_ElectronicMain {
	public static void main(String[] args) {
		_01_electronic my = new _01_electronic();
		
		my.setType("에어컨");
		my.setBrand("삼성");
		my.setColor("블랙");
		my.setPrice(1000000);
		
		my.myInfo();
		
		_01_electronic mine = new _01_electronic("드럼세탁기", "LG", "화이트", 1000000);
		mine.myInfo();
		
		_01_electronic me = new _01_electronic("냉장고", "삼성");
		me.elecInfo();
	}

}
