package jdbc.Ex03;

import java.util.Scanner;

public interface Team {
	public int teamInsert(FootballDTO dto);
	
	public int teamUpdate(Scanner sc);
	
	public int teamDelete(int teamNo);
	
	public int teamSelect();
}
