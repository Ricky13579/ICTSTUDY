package ch01;

public class _01_VariableEx {
	public static void main(String[] args) {
		/*
		 * 자바프로그램의 첫시작을 나타내는 main() 메서드 .. 소문자로 시작한다.
		 * 자바가상머신 ( JVM, JV Virtual Machine)이 프로그램을 시작하기 위해 호출하는 메서드
		 */
		System.out.println("*** 변수 ***");
		
		/*
		 * 변수 선언 및 대입 => 자료형 변수명 = 값;
		 * 변수는 소문자로 시작한다.
		 * 해당 자료형에 맞게 대입되어야 한다.
		 */
		
		//Int 정수일때 String 문자열일때
		
		
		System.out.println("*** 나의정보 ***");
		int favorite = 7; 	// 좋아하는 숫자
		
		String name = "지명준"; // 이름 (name)
		System.out.println("이름 : " + name);
		
		String address = "서울";// 주소 (address)
		System.out.println("주소 : " + address);
		
		String bloodtype = "A"; // 혈액형 (bloodtype)
		System.out.println("혈액형 : " + bloodtype);
		
		String dream = "자유"; // 꿈 (dream)
		System.out.println("과거꿈 : " + dream);
		dream = "돈많은 백수";
		System.out.println("\n현재꿈 : " + dream );
		
		System.out.println("내 이름은 : " + name + "\t혈액형은 " + bloodtype+  " 우리집 주소는 "+ address );
		
		
		String teable = "프랑스";
		System.out.println("\n여행지 : "+teable);
		
		
		System.out.println("\n좋아하는 숫자 : " + favorite);
		
		// 좋아하는 숫자는 문자이기 때문에 ""쌍따음표 입력필요
		
		
	}
}

