package ch08;

import java.util.*;

public class _02_ArrayListEx {
	public static void main(String[] args) {
		/*
		8. 검색 : list.indexOf(검색할 값);    // 중요
	       *         => 리스트에서 검색할 값과 똑같은 값을 갖는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
	       *
	       *         list.lastIndexOf(검색할 값)
	       *          => 리스트에서 검색할 값과 똑같은 값을 갖는 마지막번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.         
	       *
	       *         검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
	      */
		// HONGKILDONG
		// ArrayList
		List<String> list = new ArrayList<String>();
//		list.add("H");
//		list.add("O");
//		list.add("N");
//		list.add("G");
//		list.add("K");
//		list.add("I");
//		list.add("L");
//		list.add("D");
//		list.add("O");
//		list.add("N");
//		list.add("G");
		
		String name = "HONGKILDONG";
		for(int i = 0; i < name.length(); i++) {
			list.add(Character.toString(name.charAt(i)));
		}
		
		// 일치하는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
		System.out.println("G문자의 인덱스 : "+list.indexOf("G")); // G문자의 인덱스 : 3
		System.out.println("N문자의 인덱스 : "+list.indexOf("N")); // N문자의 인덱스 : 2
		
		System.out.println("G문자의 마지막인덱스 : "+list.lastIndexOf("G")); // G문자의 마지막인덱스 : 10
		System.out.println("N문자의 마지막인덱스 : "+list.lastIndexOf("N")); // N문자의 마지막인덱스 : 9
		System.out.println("N문자의 마지막인덱스 : "+list.lastIndexOf("Z")); // N문자의 마지막인덱스 : -1
		System.out.println();
		
		// 전체 리스트 출력 => 향상된 for문
		System.out.print("내 이름은 : ");
		for(String a : list) {
			System.out.print(a);
		}
		System.out.println();
		System.out.println();
		
		System.out.println("<<< 7. 삭제 : list.remove(삭제할 위치 index) >>>");
		System.out.print("내 이름은 : ");
		list.remove(4);
		for(String a : list) {
			System.out.print(a);
		}
		System.out.println();
		System.out.println();
		
		System.out.println("<<< 9. 전체 삭제 : list.clear() >>>");
		list.clear();
		for(String a : list) {
			System.out.print(a);
		}
		System.out.println();
	}
}
