package test;

public interface _02_MemberDAO {
	
	public void login(String id, String password, _02_MemberDTO dto);
	
	public void memberInsert(_02_MemberDTO dto, String id, String password, String gender, String email, String address);
	
	public void memberUpdate(_02_MemberDTO dto, String id, String password, String gender, String email, String address);
	
	public void memberDelete(String id, _02_MemberDTO dto);
	
	public _02_MemberDTO memberSelect(String id, _02_MemberDTO dto);

}
