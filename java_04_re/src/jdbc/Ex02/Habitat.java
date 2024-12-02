package jdbc.Ex02;

import java.util.Scanner;

public interface Habitat {
	
	public int HabitatInsert(HabitatDTO dto);
	
	public int HabitatUpdate(Scanner sc);
	
	public int HabitatDelete(int HabitatNo);
	
	public int HabitatSelect();
}
