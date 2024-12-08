package jdbc.Ex03;

public class FootballDTO {
	private int cno, lno, tno, mno, pno;
	private String cname, lname, tname, mname, pname;
	private String bdate, hdate, fdate;
	
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public int getLno() {
		return lno;
	}
	public void setLno(int lno) {
		this.lno = lno;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public String getHdate() {
		return hdate;
	}
	public void setHdate(String hdate) {
		this.hdate = hdate;
	}
	public String getFdate() {
		return fdate;
	}
	public void setFdate(String fdate) {
		this.fdate = fdate;
	}

	@Override
	public String toString() {
		return "정보 [국가번호=" + cno + ", 리그번호=" + lno + ", 팀번호=" + tno + ", 감독번호=" + mno + ", 선수번호" + pno
				+ ", 국가명=" + cname + ", 리그명=" + lname + ", 팀명=" + tname + ", 감독명=" + mname + ", 선수명=" + pname
				+ ", 팀 설립일=" + bdate + ", 감독 부임일/선수 영입일=" + hdate + ", 감독 해고일/선수 이적일=" + fdate + "]";
	}
}
