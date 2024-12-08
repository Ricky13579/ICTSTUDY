package jdbc.Ex03;

import java.util.Scanner;

public interface League {
	public int leagueInsert(FootballDTO dto);
	
	public int leagueUpdate(Scanner sc);
	
	public int leagueDelete(int leagueNo);
	
	public int leagueSelect();
}
