package ch02;

public class _10_SwitchCaseEx {
	public static void main(String[] args) {
		/*         
       [ while로 구구단 만드는 방법 ]
       1. 초기값;
       // 2. while(조건식) 
       		while (조건식) {
       		수행문1;
       		//2-1. 초기값;
       		 while (조건식) {// 2-2 조건식
       		수행문2;
       		증감식; //2-3 증감식
       	}
          증감식;  // 3. 증감식
		
		
		/*
	       * Test3. while문으로 구구단 작성
	       * 2~9단까지 출력
	       * 
	       * ****************
	       * *** 구구단 출력 ***
	       * ****************
	       * === 2단 ===
	       * 2 * 1 = 2
	       * ...
	       * 2 * 9 = 18
	       * === 9단 ===
	       * 9 * 1 = 9
	       * ...
	       * 9 * 9 = 81
	       * ==========  마지막에 한번만
	       */
	      
	      System.out.println("****************");
	      System.out.println("*** 구구단 출력 ***");
	      System.out.println("****************");
	      
	      int dan = 2;
	      while (dan < 10 ) {
	    	  System.out.println("=== 구구단 ===");
	    	  int y = 1;
	    	  while (y < 10) {
	    	  System.out.println(dan + "*" + y + "=" + (dan*y));
	    	  y += 1;
	      }
	      dan += 1;
	    
	      
	      System.out.println("=== 구구단 3단 출력 ===");
	      
	      int dan2 = 3;
	      int b = 1;
	      while (b < 10) {
	    	  System.out.println(dan2 + "*" + b + "=" + (dan2*b));
	    	  b += 1;
	      }
	      
	      System.out.println("=== 구구단 출력 복습===");
	      
	      int dan3 = 2;
	      while (dan3 <= 9) {
	    	  System.out.println("==구구단==");
	    	  int r = 1;
	    	  while (r <= 9) {
	    	  System.out.println(dan3 + "*" + r + "=" + (dan3*r));
		      r += 1; 
	    	  }
	    	  dan3 += 1;
	      }
	  
	      
	      System.out.println("((구구단복습 2번째))");
	      int dan4 = 1;
	      while (dan4 < 10) {
	    	  System.out.println("---구구단---");
	    	  int z = 1;
	    	  while (z < 10) {
	    	  System.out.println(dan4 + "*" + z + "=" + (dan4*z));
	    	  z += 1;
	    	  }
	     dan4 += 2 ;
	      }
	      //

	      
	      
	     System.out.println("--명준님 문제--");

	     int i = 0;
	      while(i<10) {
	         int j = 0;
	         while(j<=i) {
	            System.out.print("*");
	            j++;
	         }
	         System.out.println();
	         i++;
	      }

	      System.out.println();
	      
	      
	      System.out.println("=== 홀수 구구단 도출 ===");
	      
	      int dan8 = 1;
	      while (dan8 < 10) {
	    	  System.out.println("==구구단==");
	    	  int ii = 1;
	    	  while (ii < 10) {
	    	  System.out.println(dan8 + "*" + ii + "=" + (dan8*ii));
	    	  ii += 1;
	    	  }
	    	  dan8 += 2;
	      }

	      System.out.println("=== 짝수 구구단 도출===");
	      int dan10 = 2;
	      while (dan10 < 10) {
	    	  System.out.println("----구구단----");
	    	  int kk = 1;
	    	  while (kk < 10) {
	    	  System.out.println(dan10 + "*" + kk + "=" + (dan10*kk));
	    	  kk += 1;
	    	  }
	    	  dan10 += 2;
	      }
	      
	      
	      
	      
	      
	      
	      
	     }
	}
}
