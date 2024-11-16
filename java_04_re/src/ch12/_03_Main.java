package ch12;

import java.util.*;

public class _03_Main {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		int total = 0;
		double avg = 0;
		
		list.add("국어");
		list.add("수학");
		list.add("영어");
		list.add("선택과목1");
		list.add("선택과목2");
		
		System.out.println("<<< 11월 14일 수능, 당신의 결과는? >>>");
		for(int i = 0; i < list.size(); i++) {
			System.out.print("점수를 입력해주세요 : ");
			map.put(list.get(i), sc.nextInt());
			total += map.get(list.get(i));
		}
		sc.close();
		avg = total / list.size();
		gradeInfo(avg);
	}
	
	public static void gradeInfo(double avg) {
		switch(((int)avg) / 10) {
			case 10: case 9:
				System.out.println("당신의 평균은 " + avg + "점입니다.");
				System.out.println("당신은 1등급입니다.");
				break;
			case 8:
				System.out.println("당신의 평균은 " + avg + "점입니다.");
				System.out.println("당신은 2등급입니다.");
				break;
			case 7:
				System.out.println("당신의 평균은 " + avg + "점입니다.");
				System.out.println("당신은 3등급입니다.");
				break;
			case 6:
				System.out.println("당신의 평균은 " + avg + "점입니다.");
				System.out.println("당신은 4등급입니다.");
				break;
			case 5:
				System.out.println("당신의 평균은 " + avg + "점입니다.");
				System.out.println("당신은 5등급입니다.");
				break;
			case 4:
				System.out.println("당신의 평균은 " + avg + "점입니다.");
				System.out.println("당신은 6등급입니다.");
				break;
			case 3:
				System.out.println("당신의 평균은 " + avg + "점입니다.");
				System.out.println("당신은 7등급입니다.");
				break;
			case 2:
				System.out.println("당신의 평균은 " + avg + "점입니다.");
				System.out.println("당신은 8등급입니다.");
				break;
			case 1: case 0:
				System.out.println("당신의 평균은 " + avg + "점입니다.");
				System.out.println("당신은 9등급입니다.");
				break;
			default:
				System.out.println("시스템 오류입니다.");
				break;
		}
	}
}
