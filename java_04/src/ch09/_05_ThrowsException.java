package ch09;

import java.util.*;

public class _05_ThrowsException {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		try {
			int age = readAge();
			System.out.println("나이 : " +age);
		} catch (Exception e) {
			System.out.println("메시지 : "+e.getMessage());
		} finally {
			try {
				sc.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("정상종료^^");
	}
	
	public static int readAge() throws Exception {
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if(age < 0) {
			throw new Exception("나이는 0보다 큽니다.!!");
		} 
		return age;
	}
}
