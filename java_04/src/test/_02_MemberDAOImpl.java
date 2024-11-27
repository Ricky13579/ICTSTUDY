package test;

// 인터페이스를 구현하는 클래스
public class _02_MemberDAOImpl implements _02_MemberDAO{
	
	// 싱글톤 작성
	private _02_MemberDAOImpl() {
		System.out.println("로그인 시작");
	}
	
	private static _02_MemberDAOImpl instance = new _02_MemberDAOImpl();
	
	public static _02_MemberDAOImpl getinstance() {
		if(instance == null) {
			instance = new _02_MemberDAOImpl();
		}
		return instance;
	}

	// 오버라이딩
	@Override
	public void login(String id, String password, _02_MemberDTO dto) {
		if(id.equals(dto.getId()) && password.equals(dto.getPassword())) {
			System.out.println(id+"님 로그인 되었습니다.");
			System.out.println();
		}else if(id.equals(dto.getId()) && !(password.equals(dto.getPassword()))){
			System.out.println(id+"님의 비밀번호가 잘못 입력되었습니다.");
			System.out.println();
		}else {
			System.out.println(id+"님의 정보가 없습니다.");
			System.out.println();
		}
	}

	@Override
	public void memberInsert(String id, String password, _02_MemberDTO dto) {
		if(!(dto.getId().equals(id)) && !(dto.getPassword().equals(password))) {
			System.out.println(id+"님 환영합니다.");
			System.out.println();
		}else {
			System.out.println("이미 존재하는 아이디입니다.");
			System.out.println();
		}
	}

	@Override
	public void memberUpdate(_02_MemberDTO dto, String id, String password, String gender, String email, String address) {
			if(dto.getId() != null) {
				dto.setId(id);
				if(dto.getPassword() != null) {
					dto.setPassword(password);
					if(dto.getGender() != null) {
						dto.setGender(gender);
						if(dto.getEmail() != null) {
							dto.setEmail(email);
							if(dto.getAddress() != null) {
								dto.setAddress(address);
								System.out.println(dto.toString());
								System.out.println(dto.getId() + "님의 회원정보 수정이 완료되었습니다.");
								System.out.println();
							}
						}
					}
				}
			}else {
				System.out.println("아이디가 존재하지 않습니다.");
				System.out.println();
			}
		}

	@Override
	public void memberDelete(String id, _02_MemberDTO dto) {
		if(!(id == null)) {
			dto.setId(null);
			dto.setPassword(null);
			dto.setGender(null);
			dto.setEmail(null);
			dto.setAddress(null);
			System.out.println(id + "님의 회원정보가 삭제되었습니다.");
			System.out.println();
		}
		else {
			System.out.println("회원정보가 존재하지 않습니다.");
			System.out.println();
		}
	}

	@Override
	public _02_MemberDTO memberSelect(String id, _02_MemberDTO dto) {
		if(!(id == null)) {
			System.out.println(dto.toString());
			System.out.println(id+"님의 회원정보를 성공적으로 조회했습니다.");
			System.out.println();
			return dto;
		}
		else {
			System.out.println("회원정보가 존재하지 않습니다.");
			System.out.println();
			return null;
		}
	}
	
}
