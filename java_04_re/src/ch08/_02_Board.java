package ch08;
// 게시판
public class _02_Board {
	static int serialNum = 1000; 	// 회원번호
	String id; 		// 회원번호
	String title; 	// 글 제목
	
	public _02_Board(){
		serialNum++;
		this.id = "S" + serialNum;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void boardInfo() {
		System.out.println("오늘 회원번호 "+getId()+"번 회원이 \""+getTitle()+"\"란 제목으로 게시판에 글을 올리셨습니다.");
		System.out.println();
	}
}
