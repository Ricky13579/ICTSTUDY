package jdbc.Ex01;

import java.util.ArrayList;
import java.util.*;

public class _02_MemberService {
	public static void main(String[] args) {
		
		// 메서드호출 => 참조변수.메서드명();
		_02_MemberDAOImpl dao = new _02_MemberDAOImpl();
		_02_MemberDTO dto = new _02_MemberDTO();
		List<_02_MemberDTO> list = new ArrayList<_02_MemberDTO>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*----------------*");
		System.out.println("로그인을 하시겠습니까?");
		System.out.println("*----------------*");
		System.out.print("◇ yes / no : ");
		String login = sc.nextLine();
		boolean islogin = false;
		switch(login) {
			case "yes":
				int cnt = dao.login(sc);
				if(cnt == 1) {
					islogin = true;
				}else {
					islogin = false;
				}
				while(islogin) {
					System.out.println("*---------------------------------------------*");
					System.out.println("1. 추가  2. 수정  3. 삭제  4. 조회  5.목록  6. 종료");
					System.out.println("*---------------------------------------------*");
					System.out.print("◇ 메뉴 선택 : ");
					int menu = sc.nextInt();
					sc.nextLine();
					switch(menu) {
						case 1:
							dao.memberInsert(dto, sc);
							break;
						case 2:
							dao.memberUpdate(sc);
							break;
						case 3: 
							dao.memberDelete(sc);
							break;
						case 4:
							dao.memberSelect(sc.next());
							break;
						case 5:
							System.out.println("회원 목록입니다.");
							list = dao.memberList();
							// 호출
//							for(int i = 0; i < list.size(); i++) {
//								System.out.println(list.get(i));
//							}
							
							// 방법 1.
							for(_02_MemberDTO mdto : list) {
								System.out.println(mdto);
							}
							
							// 방법 2.
//							Iterator iterator = list.iterator();
//							while(iterator.hasNext()) {
//								System.out.println(iterator.next());
//							}
							
							list.clear();
							break;
						case 6:
							System.out.println("시스템을 종료합니다.");
							System.exit(0);
							break;
						default:
							System.out.println("잘못 입력하셨습니다. 다시 해주십시오");
							break;
						}
				}
				break;
			case "no":
				System.out.println("안녕히 가십시오~~~");
				System.exit(0);
				break;
			default :
				System.out.println("yes나 no중에서 입력을 해주십시오");
				break;
		}
		
	}
}
