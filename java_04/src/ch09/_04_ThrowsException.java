package ch09;

import java.util.*;

public class _04_ThrowsException {
	
	static Scanner sc = new Scanner(System.in); // static 변수
	public static void main(String[] args){
		  /*
	       * 1. 강제예외발생 : throw new Exception(message);
	       * 2. 상위 메서드에게 예외 던지기
	       *    throws Exception
	       * 3. 예외 처리 : try ~ catch ~ finally
	       *    catch(던진 Exception e){e.getMessage()}로 받는다.
	       * 
	       * catch문이 여러개일때(다중 catch) 부모 Exception이 제일 아래오도록 한다. 실행순서는 위에서부터 실행
	       */
		 
		try {
			String name = readName();
			System.out.println("이름 : " + name);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("메시지 : " + e.getMessage());
		}finally {
			try {
				sc.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		 
		 System.out.println("<<< 정상종료 >>>");
	} // main
	
	public static String readName() throws Exception {
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		if(name.length() < 2) {
			// 1. 강제예외발생 : throw new Exception(message);
			throw new Exception("이름은 2글자 이상입니다."); // Exception 매개변수 생성자 호출
		}else {
			System.out.println("이름이 " +name.length()+"글자입니다.");
		}
		
		return name;
	}
}
