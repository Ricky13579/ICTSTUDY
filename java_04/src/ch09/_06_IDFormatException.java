package ch09;

// 사용자 정의 Exception - Exception을 상속받아야 한다.
public class _06_IDFormatException extends Exception{
	
	// 매개변수 생성자
	public _06_IDFormatException(String message){
		super(message); // 부모(=Exception) 매개변수 생성자 호출
	}
}
