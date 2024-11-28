package jdbc.Ex01;

// DTO (DATA TRNASFER OBJECT : 데이터 전송 객체) 생성
// 화면데이터를 담을 때 setter, 데이터 받아서 꺼낼 때 getter
public class _02_MemberDTO {
	
	private String id;
	private String password;
	private String gender;
	private String email;
	private String address;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return id + "님의 회원정보입니다.\n "
				  + "[id=" + id + ", password=" + password 
				  + ", gender=" + gender + ", email=" + email
				  + ", address=" + address + "]";
	}
	
	
}
