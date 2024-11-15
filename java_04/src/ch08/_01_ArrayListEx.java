package ch08;

import java.util.*;

public class _01_ArrayListEx {
	public static void main(String[] args) {
	/*
       * [ArrayList]
       * 
       * Collection 인터페이스
       * - List 인터페이스 : 클래스 종류는 ArrayList, Vector, LinkedList
       * - Set 인터페이스 : 클래스종류는 HashSet, TreeSet
       * - Map 인터페이스 : 클래스종류는 HashMap, HashTable, TreeMap
       * 
       *  <면접>
       *  1. 특징
       *  List 인터페이스 : 순서가 있는 자료관리, 중복허용한다.
       *                 index를 사용하여 요소에 접근한다.
       *                 리스트에 들어있는 요소들의 인덱스는 0부터 시작한다.
       *                 클래스종류는 ArrayList, Vector, LinkedList
       *                 
       *  Set 인터페이스 : 순서가 없는 자료관리, 중복허용 않는다.
       *                클래스종류는 HashSet, TreeSet
       * 
       * 2. 선언
       * 클래스명<데이터타입클래스> 참조변수 = new 클래스명<데이터타입클래스>();
       * ArrayList<String> list = new ArrayList<String>();
       * String[] arr = new String[5];  // 배열 : 정해진갯수만큼
       * 
       * 다형성 적용
       * List<String> list = new ArrayList<String>();
       * 
       * 3. 특징 : 데이터 순서가 있다. 중복허용된다.
       * 4. 추가 : list.add(값);  // 앞에서부터 순서대로 추가
       *         list.add(추가할 위치 index, 값);  // 지정한 인덱스에 값을 추가, 그 뒤의 값은 밀려난다.
       * 5. 값 가져오기 : list.get(가져올 index);   // list.size()만큼 반복        
       * 6. 교체 : list.set(교체할 위치 index, 값); // 지정한 인덱스의 값을 변경.. 그 뒤값은 그대로이다.
       * 7. 삭제 : list.remove(삭제할 위치 index);
       * 8. 검색 : list.indexOf(검색할 값);    // 중요
       *         => 리스트에서 검색할 값과 똑같은 값을 갖는 첫번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.
       *
       *         list.lastIndexOf(검색할 값)
       *          => 리스트에서 검색할 값과 똑같은 값을 갖는 마지막번째 데이터를 찾아서 그 위치의 인덱스를 리턴한다.         
       *
       *         검색할 값과 일치한 데이터가 없으면 -1을 리턴한다.
       *         
       * 9. 전체 삭제 : list.clear();
       * 10. 반복자 : Iterator<E> iterator : while(hasNext())  { next() }
      */
		
		// 선언
		// 클래스명<데이터타입클래스> 참조변수 = new 클래스명<데이터타입클래스>();
		List <String> season = new ArrayList<String>();
		season.add("봄");	// 0
		season.add("여름");	// 1
		season.add("가을");	// 2
		season.add("겨울");	// 3
		
		System.out.println("[방법1. for문]");
		for(int i = 0; i < season.size(); i++) {
			System.out.println("사계절 중 "+(i+1)+"번째 계절은 "+season.get(i)+"이다.");
		}
		System.out.println();
		
		System.out.println("[방법2. 향상된 for문]");
		for(String str : season) {
			System.out.println("사계절은 " + str + "이다.");
		}
		System.out.println();
		
		List<String> snacks = new ArrayList<String>();
		snacks.add("얼큰오뎅탕");
		snacks.add("육회");
		snacks.add("치즈계란말이");
		snacks.add("조개술찜");
		snacks.add("모둠 소세지");
		snacks.add("마른 오징어");
		snacks.add("파스타");
		snacks.add("명란파밥");
		snacks.add("야끼만두");
		snacks.add("돼지껍데기");
		System.out.println("[방법1. for문]");
		for(int i = 0; i < snacks.size(); i++) {
			System.out.println("내가 좋아하는 안주 중 " + (i+1) + "번째는 " + snacks.get(i)+"입니다.");
		}
		System.out.println();
		
		System.out.println("[방법2. 향상된 for문]");
		for(String a : snacks) {
			System.out.println(a+"는(은) 내가 좋아하는 안주 중 하나다.");
		}
	}
}
