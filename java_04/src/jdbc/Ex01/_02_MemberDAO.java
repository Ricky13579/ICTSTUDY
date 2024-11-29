package jdbc.Ex01;

import java.util.Scanner;

public interface _02_MemberDAO {
	
	public int login(Scanner sc);
	
	public int memberInsert(_02_MemberDTO dto, Scanner sc);
	
	public int memberUpdate(Scanner sc);
	
	public int memberDelete(Scanner sc);
	
	public void memberSelect(Scanner sc);

}
