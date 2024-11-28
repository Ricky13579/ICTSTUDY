package jdbc.Ex01;

import java.util.Scanner;

public interface _02_MemberDAO {
	
	public void login(String id, String pw);
	
	public int memberInsert(Scanner sc);
	
	public int memberUpdate(Scanner sc);
	
	public int memberDelete(Scanner sc);
	
	public void memberSelect(Scanner sc);

}
