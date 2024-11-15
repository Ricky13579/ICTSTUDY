package ch12;

import java.util.*;

public class _01_Main {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "대한민국");
		map.put(2, "쿠웨이트");
		for(int i = 0; i < map.size(); i++) {
			if(map.get(i+1) == "대한민국") {
				System.out.println(map.get(i+1) + "의 승리로 종료되었습니다.");
			}else {
				System.out.println(map.get(i+1) + "의 패배로 종료되었습니다.");
			}
		}
	}
}
