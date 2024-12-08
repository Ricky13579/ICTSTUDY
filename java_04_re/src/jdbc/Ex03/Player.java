package jdbc.Ex03;

import java.util.Scanner;

public interface Player {
	public int playerInsert(FootballDTO dto);
	
	public int playerUpdate(Scanner sc);
	
	public int playerDelete(int playerNo);
	
	public int playerSelect();
}
