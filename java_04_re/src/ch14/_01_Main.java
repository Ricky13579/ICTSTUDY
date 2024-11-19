package ch14;

public class _01_Main {
	public static void main(String[] args) {
		_01_Noodle snack = _01_Noodle.getInstance();
		snack.Water("스낵면");
		snack.Soup("스낵면");
		snack.Noodle("스낵면");
		snack.Else("스낵면");
		System.out.println();
		
		_01_Noodle raccoon = _01_Noodle.getInstance();
		raccoon.Water("너구리");
		raccoon.Soup("너구리");
		raccoon.Noodle("너구리");
		raccoon.Else("너구리");
		System.out.println();
	}
}
