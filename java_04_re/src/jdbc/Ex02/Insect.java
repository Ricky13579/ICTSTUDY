package jdbc.Ex02;

import java.util.Scanner;

public interface Insect {
	
	public int InsectInsert(InsectDTO dto);
	
	public int InsectUpdate(Scanner sc);
	
	public int InsectDelete(int insectNo);
	
	public int InsectSelect();
	
}
