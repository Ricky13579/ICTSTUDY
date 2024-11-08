package ch03;

import java.text.DecimalFormat;

public class _04_House {
	/* 클래스(설계도) = 멤버변수(속성) + 멤버메서드(기능)
	 * 객체 = 클래스를 기반으로 만들어진 힙 메모리 공간
	 */
	
	// DecimalFormat 클래스
	// 숫자의 format을 변경하는 클래스
	// 숫자 3자리마다 천 단위 구분 기호 붙이게 함
	DecimalFormat df = new DecimalFormat("###,###"); 
	
	// 멤버변수(속성)
	private String address;	// 집 주소
	private int price;		// 집 가격
	private String kind;	// 집 종류
	private int size;		// 평수
	
	// 멤버메서드(기능, 동작)
	// setter(set + 멤버변수 : 첫 글자만 대문자)
	public void setAddress(String address) { // 매개변수
		this.address = address; // this.멤버변수 = 매개변수;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	public void printInfo() {
		System.out.println("내 집은 "+address+"에 위치해 있다.");
		System.out.println("내 집 가격은 월세로 "+df.format(price)+"원이다.");
		System.out.println("내 집은 "+kind+"다.");
		System.out.println("내 집의 규모는 약 "+size+"평이다.");
	}	
}
