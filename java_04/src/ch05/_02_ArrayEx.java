package ch05;

public class _02_ArrayEx {
	public static void main(String[] args) {
		// 방법 2)
		// 음료수)
		String[] drink = new String[5];
		drink[0] = "제로콜라";
		drink[1] = "제로사이다";
		drink[2] = "아이스 아메리카노";
		drink[3] = "코코팜";
		drink[4] = "바나나맛 우유";
		for(int i = 0; i < drink.length; i++) {
			System.out.println("제가 좋아하는 음료수 "+drink.length+"개 중 "+(i+1)+"번째는 "+drink[i]+"입니다.");
		}
		System.out.println();
		
		// 방법 4)
		// 음식)
		String[] food = {"부대찌개", "카레", "솥밥", "제육볶음", "볶음밥"};
		for(int i = 0; i < food.length; i++) {
			System.out.println("제가 좋아하는 음식 "+food.length+"개 중 "+(i+1)+"번째는 "+food[i]+"입니다.");
		}
		System.out.println();
		
		// 향상된 for문
		// 배열 요소값을 변수에 하나씩 가져와서 변수에 대입 후 실행
		// for(변수 : 배열){
		// }
		System.out.println("<<< 향상된 for문 >>>");
		String[] foodArr = {"부대찌개", "카레", "솥밥", "제육볶음", "볶음밥"};
		for(String arr : foodArr) {
			System.out.println("제가 좋아하는 음식은 "+arr+"입니다.");
		}
	}
}
