package ch13;

import java.util.*;

public class _04_Dust {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double pm10;
		try {
			pm10 = readDense();
			System.out.println("미세먼지 농도 : "+pm10);
			dustGrade(pm10);
		} catch (Exception e) {
			System.out.println("메시지 : "+e.getMessage());
		} finally {
			try {
				sc.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("정상종료!!!");
	}
	
	public static double readDense() throws Exception{
		double pm10;
		System.out.print("오늘 미세먼지의 농도는 몇입니까? : ");
		pm10 = sc.nextDouble();
		if(pm10 < 0) {
			throw new Exception("미세먼지 농도는 적어도 0이상입니다.");
		}
		return pm10;
	}
	
	public static void dustGrade(double pm10) {
		if(pm10 >= 0 && pm10 <= 30) {
			System.out.println("오늘 미세먼지의 등급은 \"좋음\"입니다.");
		}
		else if(pm10 >= 31 && pm10 <= 80) {
			System.out.println("오늘 미세먼지의 등급은 \"보통\"입니다.");
		}
		else if(pm10 >= 81 && pm10 <= 150) {
			System.out.println("오늘 미세먼지의 등급은 \"나쁨\"입니다.");
		}
		else {
			System.out.println("오늘 미세먼지의 등급은 \"매우 나쁨\"입니다.");
		}
	}
}
