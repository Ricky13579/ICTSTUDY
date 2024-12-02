package jdbc.Ex02;

import java.util.Scanner;

public interface Predator {
	
	public int PredatorInsert(PredatorDTO dto);
	
	public int PredatorUpdate(Scanner sc);
	
	public int PredatorDelete(int PredatorNo);
	
	public int PredatorSelect();
}
