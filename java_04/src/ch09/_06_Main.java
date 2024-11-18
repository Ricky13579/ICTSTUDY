package ch09;

public class _06_Main {
	public static void main(String[] args) {
		_06_IDFormat test = new _06_IDFormat();
		String id = null;
		
		try {
			test.setUserID(id);
		} catch (_06_IDFormatException e) {
//			e.printStackTrace();
			System.out.println("메시지 : " + e.getMessage());
		} finally {
			System.out.println("정상종료");
		}
		System.out.println("아이디 : " + test.getUserID());
		System.out.println();
		
		id = "아따맘마";
		try {
			test.setUserID(id);
		} catch (_06_IDFormatException e) {
//			e.printStackTrace();
			System.out.println("메시지 : "+e.getMessage());
		} finally {
			System.out.println("정상종료");
		}
		System.out.println("아이디 : "+test.getUserID());
		System.out.println();
		
		id = "wpzmfhtm";
		try {
			test.setUserID(id);
		} catch (_06_IDFormatException e) {
//			e.printStackTrace();
			System.out.println("메시지 : "+e.getMessage());
		} finally {
			System.out.println("정상종료");
		}
		System.out.println("아이디 : "+test.getUserID());
	}
}
