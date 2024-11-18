package ch09;

public class _06_IDFormat{
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws _06_IDFormatException {
		if(userID == null) {
			throw new _06_IDFormatException("아이디는 null이 될 수 없습니다.");
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new _06_IDFormatException("아이디는 8글자 이상 20글자 이하로 입력해주셔야 합니다.");
		}
		else {
			this.userID = userID;
		}
	}
	
	
}
