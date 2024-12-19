package useBean;

import java.util.*;

public class MemberInfo {
	
	// 멤버변수
	private String id;			// 아이디
	private String password;	// 비밀번호
	private String name;		// 이름
	private String address;		// 주소
	private String email;		// 이메일
	private Date registerDate;	// 등록일
	
	public MemberInfo() {}

	public MemberInfo(String id, String password, String name, String address, String email, Date registerDate) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.email = email;
		this.registerDate = registerDate;
	}
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	@Override
	public String toString() {
		return "MemberInfo [id=" + id + ", password=" + password + ", name=" + name +
				", address=" + address + ", email=" + email + ", registerDate=" + registerDate + "]";
	}
	
}
