package jdbc.Ex03;

import java.util.Scanner;

public interface Manager {
	public int managerInsert(FootballDTO dto);
	
	public int managerUpdate(Scanner sc);
	
	public int managerDelete(int managerNo);
	
	public int managerSelect();
}
