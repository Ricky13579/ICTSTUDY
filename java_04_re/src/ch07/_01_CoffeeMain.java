package ch07;

public class _01_CoffeeMain {

	public static void main(String[] args) {
		_01_Coffee fav = new _01_Coffee();
		
		fav.setType("아이스 아메리카노");
		fav.setBrand("메가 커피");
		fav.setPrice(2000);
		fav.setSize("레귤러");
		fav.coffeeInfo();
		
		fav.getCoffee();
	}

}
