package ch03;

public class _01_OperatorEx {
	public static void main(String[] args) {
		System.out.println("*** 사칙연산자 ***");
		int mathScore = 70, engScore = 90;
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		double avgScore = totalScore / 2.0;
//		int avgScore = totalScore / 2.0; -> 안 됨
		System.out.println(avgScore+"\n");
		
		System.out.println("*** 증감연산자 ***");
		int a = 10, b = 30;
		System.out.println(++a + b++ + ++b); // 11 + 30 + 32 = 73;
		System.out.println("a : "+a); // 11
		System.out.println("b : "+b+"\n"); // 32
		
		System.out.println("*** 관계연산자 ***");
		int c = 15, d = 10;
		System.out.println("c == d : " +(c == d)); // False
		System.out.println("c != d : " +(c != d)); // True
		System.out.println("c > d : " +(c > d)); // True
		System.out.println("c < d : " +(c < d)); // False
		System.out.println("c <= d : "+(c <= d)); // False
		System.out.println("c >= d : "+(c >= d)+"\n"); // True
		
		System.out.println("*** 논리연산자 ***");
		int e = 55, f = 66;
		System.out.println(e == 55 && f == 65); // False
		System.out.println(e == 55 && f == 66); // True
		System.out.println(e == 55 || f == 65); // True
		System.out.println((e == 54 || f == 64)+"\n"); // False
		
		System.out.println("*** 복합대입연산자 ***");
		int i = 45;
		i += 15;
		System.out.println("i : "+i); // 60
		
		i -= 15;
		System.out.println("i : "+i); // 45
		
		i *= 15;
		System.out.println("i : "+i); // 675
		
		i /= 15;
		System.out.println("i : "+i); // 45
		
		i %= 15;
		System.out.println("i : "+i); // 0
		
	}
}
