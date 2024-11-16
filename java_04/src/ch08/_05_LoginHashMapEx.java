package ch08;

import java.util.*;

public class _05_LoginHashMapEx {
	public static void main(String[] args) {
		/* [플젝]
	       * 1. id, pwd 5건을 hashtable에 저장(hashMap에 저장) - put
	       * 2. 콘솔로부터 id, password를 입력받는다.(로그인을 위해)
	       *    1과 2를 비교해서
	       * 3. 아이디가 없으면 "입력하신 아이디가 존재하지 않습니다." 출력
	       *    아이디가 있으면 비밀번호와 비교해서 일치시 "로그인 성공" 출력
	       *                                불일치시 "비밀번호가 불일치" 출력
	       * 4. id입력시 Q나 q를 입력시 종료  :  System.exit(0) // 정상종료, break, return;
	       * 문자열 비교 =>  입력값.equals(비교값)  
	       * 
	       *  key      value    
	       *    id       password
	       * "park"   "park1234"
	       * "kim"    "kim1234"
	       * "lee"    "lee1234"
	       * "son"    "son1234"
	       * "choi"   "choi1234"
	    */
		
		// 아이디와 비밀번호를 담을 hashmap 생성
		Map<String , String> map = new HashMap<String, String>();
		
		// Scanner 객체 생성(입력받은 값 유효성 검사에 필요)
		Scanner sc = new Scanner(System.in);
		
		// map에 키값(아이디), 밸류값(비번) 5개 추가
		map.put("park", "park1234");
		map.put("kim", "kim1234");
		map.put("lee", "lee1234");
		map.put("son", "son1234");
		map.put("choi", "choi1234");
		
		// 
		System.out.print("아이디를 입력하세요 : ");
		IdCheck(sc.nextLine(), map);
		
		sc.close();
	}
	
	// 아이디를 Scanner로 입력받고 이에대한 유효성 검사를 진행하는 메서드
	// 맞으면 패스워드에 관한 유효성 검사를 틀리면 에러메시지나 강제종료를 진행
	public static void IdCheck(String str, Map<String, String> map) {
		if(map.containsKey(str)) {
			Scanner sc = new Scanner(System.in);
			System.out.print("비밀번호를 입력하세요 : ");
			PwCheck(sc.nextLine(), map);
			sc.close();
		}else {
			ErrorCheck(str);
		}
	}
	
	// 아이디를 입력받을 때 Q,q 중 하나만을 입력하면 강제종료 시키고 그렇지 않으면 에러메시지를 출력하는 메서드
	public static void ErrorCheck(String str) {
		if(str.equals("Q") || str.equals("q")) {
			System.out.println("시스템을 강제종료합니다.");
			System.exit(0);
		}else {
			System.out.println("입력하신 아이디가 존재하지 않습니다.");
		}
	}
	
	// 비밀번호에 관한 유효성 검사를 진행하는 코드
	public static void PwCheck(String str, Map<String, String> map) {
		if(map.containsValue(str)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("비밀번호 불일치");
		}
	}
}
