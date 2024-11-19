package ch10;

public class _03_StringEx {
	public static void main(String[] args) {
		
		String str = "A Barking dog";
		String s1, s2, s3, s4, s5;
		
		// 문자열 길이 : length()
		System.out.println("문자열 길이 : " + str.length()); // 문자열 길이 : 13
		
		// 문자열 결합 : concat("연결할 문자열")
		s1 = str.concat(" never Bites!!");
		System.out.println("s1 : " + s1); // s1 : A Barking dog never Bites!!
		
		// 문자열 교환 : replace(oldChar, newChar)
		s2 = s1.replace("dog", "cat");
		System.out.println("s2 : " + s2); // s2 : A barking cat never bites!!
		
		// 부분 문자열 : substring(beginIndex, endIndex) => beginIndex <= 추출값 < endIndex
		// beginIndex는 0부터 시작 / endIndex = endIndex - 1
		s3 = s1.substring(5,9);
		System.out.println("s3 : " + s3); // s3 : king
		
		// 대문자로 변환 : toUpperCase()
		s4 = s2.toUpperCase();
		System.out.println("s4 : " + s4); // s4 : A BARKING CAT NEVER BITES!!
		
		// 소문자로 변환 : toLowerCase()
		s5 = s2.toLowerCase();
		System.out.println("s5 : " + s5); // s5 : a barking cat never bites!!
	}
}
