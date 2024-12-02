package jdbc.Ex02;

public class InsectDTO extends HabitatDTO{
	private int insectNo;
	private String insectname;
	private int habitatNo;
	private int predatorNo;
	private String taste;
	public int getInsectNo() {
		return insectNo;
	}
	public void setInsectNo(int insectNo) {
		this.insectNo = insectNo;
	}
	public String getInsectname() {
		return insectname;
	}
	public void setInsectname(String insectname) {
		this.insectname = insectname;
	}
	public int getHabitatNo() {
		return habitatNo;
	}
	public void setHabitatNo(int habitatNo) {
		this.habitatNo = habitatNo;
	}
	public int getPredatorNo() {
		return predatorNo;
	}
	public void setPredatorNo(int predatorNo) {
		this.predatorNo = predatorNo;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
}
