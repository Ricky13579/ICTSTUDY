package ch12;

import java.util.*;

public class _02_Main {
	public static void main(String[] args) {
		List<String> song = new ArrayList<String>();
		song.add("피카츄");
		song.add("라이츄");
		song.add("파이리");
		song.add("꼬부기");
		song.add("버터플");
		song.add("야도란");
		song.add("피존투");
		song.add("또가스");
		song.add("서로 생긴 모습은 달라도");
		song.add("우리는 모두 친구");
		for(int i = 0; i < song.size(); i++) {
			System.out.println(song.get(i)+"~~~");
		}
	}
}
