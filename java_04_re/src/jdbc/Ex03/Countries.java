package jdbc.Ex03;

import java.util.*;

public interface Countries {
	public int countriesInsert(FootballDTO dto);
	
	public int countriesUpdate(Scanner sc);
	
	public int countriesDelete(int countryNo);
	
	public int countriesSelect();
}
