package ch05;

public class _01_ArrayEx {
	public static void main(String[] args) {
		/*
		    * 배열(Array) : 대량의 동일한 자료형의 데이터를 한꺼번에 저장할 수 있는 저장장소이다.
		    * 방법1) 선언과 생성을 따로 한다.
		    *       int[] scores;  // 선언
		    *       scores = new int[갯수];  // 생성
		    *       scores[index] = 값;
		    * 
		    * 방법2) 선언과 생성을 동시에 한다. .. 추천
		    *       int[] scores = new int[갯수];
		    *      scores[index] = 값;
		    *      
		    * 방법3) int[] scores = new int[] {값1, 값2,...}   // 갯수는 생략해야 함.  추천
		    * 
		    * 방법4) 선언과 할당을 동시에 한다. .. 제일 많이 사용
		    *       int[] scores = {값1, 값2,...};      
		 */
		
		// 방법2)
		System.out.println("<<< 방법 2 >>>");
		int[] scores = new int[5];
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		scores[3] = 40;
		scores[4] = 50;
		for(int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		System.out.println();
		
		// 방법4)
		System.out.println("<<< 방법 4 >>>");
		int[] score2 = {60, 70, 80, 90, 100};
		for(int i = 0; i < score2.length; i++) {
			System.out.println("score2[" + i + "] = " + score2[i]);
		}
	}
}
