package jdbc.Ex01;

import java.util.Scanner;

public class _02_MemberService {
	public static void main(String[] args) {
		
		// 메서드호출 => 참조변수.메서드명();
		_02_MemberDAOImpl dao = new _02_MemberDAOImpl();
		_02_MemberDTO dto = new _02_MemberDTO();
		Scanner sc = new Scanner(System.in);
		
		dao.login(sc.next(), sc.next());
//		dao.memberInsert(sc);
//		dao.memberSelect(sc);
//		dao.memberUpdate(sc);
//		dao.memberDelete(sc);
	}
}
