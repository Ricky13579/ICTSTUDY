package ch08;

import java.util.*;

public class _04_LoginHashMapEx {
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
		
		Map<String , String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		// map에 키값(아이디), 밸류값(비번) 5개 추가
		map.put("park", "park1234");
		map.put("kim", "kim1234");
		map.put("lee", "lee1234");
		map.put("son", "son1234");
		map.put("choi", "choi1234");
		
		// Scanner로 각 입력값을 받기
		String a = sc.nextLine();
		String b = sc.nextLine();
		sc.close();
		System.out.print("아이디를 입력해주세요 : " + a + "\n");
		System.out.println("비밀번호를 입력해주세요 : " + b + "\n");
		
		// id와 비번이 유효한지 검사
		if(a.equals("park")) {
			// 아이디가 일치하면 비밀번호로 유효성 검사
			if(b.equals("park1234")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호 불일치");
			}
		}else if(a.equals("kim")){
			if(b.equals("kim1234")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호 불일치");
			}
		}
		else if(a.equals("lee")){
			if(b.equals("lee1234")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호 불일치");
			}
		}
		else if(a.equals("son")){
			if(b.equals("son1234")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호 불일치");
			}
		}
		else if(a.equals("choi")){
			if(b.equals("choi1234")) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호 불일치");
			}
		}
		// Q나 q를 입력하면 아예 시스템을 강제종료시켜버리기
		else if(a.equals("Q") || a.equals("q")){
			System.exit(0);
		// id에서 불일치하면 출력해주는 코드
		}else {
			System.out.println("입력하신 아이디가 존재하지 않습니다.");
		}
	}
}
