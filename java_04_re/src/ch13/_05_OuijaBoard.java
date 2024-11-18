package ch13;

public class _05_OuijaBoard {
	private String answer;
	
	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String answer) throws _05_GhostException {
		if(answer == "예") {
			this.answer = answer;
		} else if(answer == "아니요") {
			this.answer = answer;
		} else {
			throw new _05_GhostException("대답은 예나 아니요로만 들을 수 있습니다.");
		} 
	}
}
