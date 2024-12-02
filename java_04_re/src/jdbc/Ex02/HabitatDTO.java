package jdbc.Ex02;

public class HabitatDTO extends PredatorDTO{
	private int habitatNo;
	private String habitat;
	public int getHabitatNo() {
		return habitatNo;
	}
	public void setHabitatNo(int habitatNo) {
		this.habitatNo = habitatNo;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
}
