package ch14;

enum rainbow{빨강, 주황, 노랑, 초록, 파랑, 남색, 보라}

public class _05_RainBow {
	private rainbow color;
	private int rank;
	
	public _05_RainBow() {}
	
	public _05_RainBow(rainbow color, int rank) {
		this.color = color;
		this.rank = rank;
	}

	public rainbow getColor() {
		return color;
	}

	public void setColor(rainbow color) {
		this.color = color;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return color + "색은 무지개에서 " + rank +"번째의 색깔이다.";
	}
	
	
}
