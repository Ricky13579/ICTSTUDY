package test.EX03;

import java.util.*;

public class _02_MemberService {
	public static void main(String[] args) {
		// 다형성 적용, 싱글톤 적용
		_02_MemberDAO instance = _02_MemberDAOImpl.getinstance();
		_02_MemberDTO mDTO = new _02_MemberDTO();
		Scanner sc = new Scanner(System.in);
		
		mDTO.setId("ricky");
		mDTO.setPassword("1234");
		mDTO.setGender("남");
		mDTO.setEmail("wlgjaudwns@naver.com");
		mDTO.setAddress("목동");
		
		instance.login("ricky", "1234", mDTO);
		instance.memberInsert(mDTO, "아이유","0123", "남성", "iu@email.com", "마포");
		instance.memberSelect(mDTO.getId(), mDTO);
		System.out.println("수정하시고 싶으신 회원 정보를 입력하세요");
		instance.memberUpdate(mDTO, sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
		instance.memberSelect(mDTO.getId(), mDTO);
		instance.memberDelete(mDTO.getId(), mDTO);
		instance.memberUpdate(mDTO, sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
		instance.memberSelect(mDTO.getId(), mDTO);
	}
}
