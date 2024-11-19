package ch14;

public class _02_Main {
	public static void main(String[] args) {
		_02_Kimbap tuna = new _02_Kimbap();
		tuna.setBrand("얌샘");
		tuna.setKind("참치김밥");
		tuna.setPrice(3500);
		System.out.print(tuna);
		
		_02_Kimbap cheese = new _02_Kimbap();
		cheese.setBrand("김가네");
		cheese.setKind("치즈김밥");
		cheese.setPrice(4000);
		System.out.println(cheese);
	}
}
