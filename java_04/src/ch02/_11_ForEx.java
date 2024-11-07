package ch02;

public class _11_ForEx {
	public static void main(String[] args) {
		/*
	       * 반복문 : 조건이 참인동안 반복(while문, for문)
	       * 
	       * for(초기값; 조건식; 증감식) {  // 반복횟수
	       *     수행문1;
	       *     수행문2;...
	       * }
	       */
	      
	      // 출력 => HappyDay1^^   HappyDay2^^  HappyDay3^^  HappyDay4^^  HappyDay5^^
	        //        반복문 종료^^   
		
		/*// 1.초기값 ->
		int count = 3;
		// 2.조건값 ->
		// 3.증감식 ->
		
		while(count <= 5) {
			System.out.print("HappyDay"+count+"^^");
			count++;
		}
		System.out.println(""
				+ "\n반복문 종료");
		 * 
		 */
		
		
		int count = 1;
		for(count = 1; count <=5; count++)
		{
			System.out.println("HappyDay" + count + "^^");
		}
		System.out.println("==입력문 종료==");
			
		
		// 출력 => HappyDay5^^   HappyDay4^^  HappyDay3^^  HappyDay2^^  HappyDay1^^
        //        반복문 종료^^ 반대로 출력필요
		int count2 = 5;
		for(count2=5; count2 >= 1; count2--) {
			System.out.println("HappyDay" + count2 + "^^");
		}
		System.out.println("==입력문 종료==");
		System.out.println();
		
		
		
		for(int dan=2; dan <=9; dan++)
		{
			System.out.println(dan + "단");
			for( int j=1; j<=9; j++ ) {
				System.out.println(dan + "*" + j + "=" + (dan*j));
			}
			System.out.println();
		}
		
		
		
		for(int dan2 = 3; dan2 <= 9; dan2++) {
			
		}
		
}
}
