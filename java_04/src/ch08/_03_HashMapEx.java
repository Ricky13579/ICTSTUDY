package ch08;

import java.util.*;

public class _03_HashMapEx {
	public static void main(String[] args) {
		//	선언
		//  - HashMap<Key 클래스타입, value 클래스타입> map = new HashMap<Key 클래스타입, value 클래스타입>();
		//  - Map<Key 클래스타입, value 클래스타입> map = new HashMap<Key 클래스타입, value 클래스타입>(); // 다형성 적용
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "아이유");
		map.put(2, "유재석");
		map.put(3, "박명수");
		map.put(4, "박나래");
		
		System.out.println("<<< 전체 데이터 출력 - for문 >>>");
		// 전체 데이터 출력 - for문
		for(int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i+1)); // map.get(key)
		}
		System.out.println();
		
		System.out.println("<<< 박나래 출력 >>>");
		System.out.println(map.get(4));
		System.out.println();
		
		System.out.println("<<< 박나래 삭제후 전체 데이터 출력 >>>");
		map.remove(4);
		for(int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i+1));
		}
		System.out.println();
		
		// 데이터가 비어있는지 확인 : isEmpty()
		System.out.println(map.isEmpty());
		System.out.println();
		
		System.out.println("<<< 해당 키가 있는지 여부 : containsKey(key) >>>");
		System.out.println(map.containsKey(1));
		System.out.println(map.containsKey(2));
		System.out.println(map.containsKey(3));
		System.out.println(map.containsKey(4));
		System.out.println();
		
		System.out.println("<<< 해당 값이 있는지 여부 : containsValue(value) >>>");
		System.out.println(map.containsValue("아이유"));
		System.out.println(map.containsValue("유재석"));
		System.out.println(map.containsValue("박명수"));
		System.out.println(map.containsValue("박나래"));
		System.out.println();
		
		System.out.println("<<< 해당 개수 : map.size() >>>");
		System.out.println("해당 개수 : " + map.size());
		System.out.println();
	}
}
