package jdbc.Ex01;

import java.util.Scanner;

public interface Car {
	
	public int carInsert(CarDTO dto);
	
	public int carUpdate(Scanner sc);
	
	public int carDelete(int carNo);
	
	public int carSelect();
	
}
