package ch03;
// 공배수인지 아닌지 가리기
public class _04_IfMul {
	public static void main(String[] args) {
		int number = 20, a = 6, b = 4;
		String result = "";
		if(number % a == 0 && number % b ==0) {
			result = "공배수입니다.";
		}else {
			result = "공배수가 아닙니다.";
		}
		System.out.println(number+"은(는) "+a+"와(과) "+b+"의 "+result);
	}

}
