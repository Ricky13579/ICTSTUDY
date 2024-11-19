package ch10;

import java.util.*;

public class _05_Main {
	public static void main(String[] args) {
		
		_05_EnumEx cat = new _05_EnumEx(Animal.CAT, "야옹이");
		_05_EnumEx dog = new _05_EnumEx(Animal.DOG, "댕댕이");
		_05_EnumEx fish = new _05_EnumEx(Animal.FISH, "물고기");
		
		List<_05_EnumEx> list = new ArrayList<_05_EnumEx>();
		list.add(cat);
		list.add(dog);
		list.add(fish);
		
		for(_05_EnumEx i : list) {
			System.out.println(i); // i.toString() 호출 => 재정의가 안 되면 주소값 출력
		}
	}
}
