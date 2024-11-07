package ch01;

public class _07_OperatorEx {
	public static void main(String[] args) {
		
		
		/*
		 * 연산
		 * 
		 */
		System.out.println("=== 사칙 연산자 ===");
		
		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println("총점: "+totalScore);
		int avgScore = totalScore / 2;
		System.out.println("평균 : "+ avgScore);
		double avgScore2 = totalScore / 2.0;
		System.out.println("더블(소수점)평균 :"+ avgScore2);
		
		   /*
	       * 연산
	       * 2.증감연산자 => 매우 중요
	       * 1) 전위연산자 => y = ++x; => x값을 먼저 1증가시키고, 증가한 값을 y에 대입한다.
	       * 2) 후위연산자 => y = x++; => x값을 먼저 y에 대입한 후, x값을 1증가시킨다.
	       */
		
		int c =5;
		int nextC = ++c;
		
		System.out.println("c : "+ c);
		System.out.println("nextC : " +nextC );
		System.out.println("---------------");
		int d =5;
		int nextD = d++;
		
		System.out.println("nextD : " +nextD );
		System.out.println("d :" + d);
		System.out.println("---------------");
		
		int e = 2, f = 3, result1 = 0; //뒤에,붙이면 int 생략가능
		//System.out.println(e++ + --f * --e); // 2+2*2=6
		//System.out.println(++e + --f * e--); // 3+1*3=6
		System.out.println(e++ + --f * e--); // 2+0*3=2
		System.out.println("e : " + e); // 2
		System.out.println("f : " + f); // 0
		
		result1 = ++e + --f * e--;
		System.out.println("result1 : " + result1); //3+1*3=6
		System.out.println("e: " + e); // 2
		System.out.println("f: " + f); // 1
		// 단항연산자가 사칙연산자보다 우선순위가 높다.
		// 동일한 변수에는 최종값이 대입된다.
		
		
		/*
		 * 연산
		 * 3.관계연산자 => 매우 중요
		 * - >, <, >=, 같다(==), 같지않다 (!=)
		 * - 결과값은 boolean 타입 : 참(ture), 거짓(false)
		 */
		System.out.println("=== 관계연산자 ===");
		
		int c1 = 10;
		int c2 = 20;
		System.out.println("c1 == c2 :" +(c1 == c2)); // false
		System.out.println("c1 != c2 :" +(c1 != c2)); // ture
		System.out.println("c1 > c2 :" +(c1 > c2)); // false
		System.out.println("c1 < c2 :" +(c1 < c2)); // ture
		System.out.println("c1 >= c2 :" +(c1 >= c2)); //false
		System.out.println("c1 <= c2 :" +(c1 <= c2)); //ture
		
		System.out.println("=== 논리연산자 ===");
		
		/*
		 *  * - 1 => 참(true) | 0 => 거짓(false)
         * - &&(논리곱) : 
         * - ||(논리합) :  
         */
		
		int z1 = 4, y1 = 5;
		System.out.println(z1==4 && y1==5);  // T && T = 1*1 = ture
		System.out.println(z1==4 && y1==10); // T && F = 1*0 = false
		System.out.println(z1==4 || y1==7);  // T || F = 1+0 = ture(논리합)
		System.out.println(z1==7 || y1==7);  // F || F = 0+0 = false
		
		/*
		 *  연산
         * 5.복합대입연산자 => 매우 중요
         */
        System.out.println("=== 5.복합대입연산자 ===");
        
        int ii = 5;
        ii +=10;
        System.out.println("ii : " + ii);
        ii -=10;
        System.out.println("ii : " + ii);
        ii *=10;
        System.out.println("ii : " + ii);
        ii /=10;
        System.out.println("ii : " + ii);
        ii %=10;
        System.out.println("ii : " + ii);
		
        
        
	}
}
