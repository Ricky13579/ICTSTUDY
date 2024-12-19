package useBean;

public class JoinInfo {
	private String id;
	private String pwd;
	private String gender;
	private String address;
	private String email;
	
	public JoinInfo() {
	
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "JoinInfo [id=" + id + ", pwd=" + pwd + ", gender=" + gender + ", address=" + address + ", email="
				+ email + "]";
	}
	
}
