package ch05;

public class _03_ArrayEx {
	public static void main(String[] args) {
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
