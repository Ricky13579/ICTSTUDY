package ch13;

import java.util.*;

public class _01_Exception {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("원피스");
		list.add("나루토");
		list.add("블리치");
		list.add("드래곤볼");
		
		try {
			for(int i = 0; i <= list.size(); i++) {
				System.out.println(list.get(i));
			}
		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println("예외처리 메시지 : "+e.getMessage());
		}finally {
			System.out.println("프로그램 종료");
		}
		System.out.println("정상종료");
		
	}
}
