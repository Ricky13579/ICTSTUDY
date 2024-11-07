package ch01;

public class _04_VariableEx {
	public static void main(String[] args) {
		/*
		 * 소 -> 대 : 자동 형변환(묵시적 형변환) => 형변환 생략 가능 => 자료 손실이 발생하지 않으므로
		 * 대 -> 소 : 강제 형변환(명시적 형변환) => 형변환 생략 불가 => 자료 손실이 발생하므로
		 */
		
		System.out.println("*** 묵시적 형변환 ***");
		int bnum = 10;
		int inum = bnum;
		
		System.out.println(bnum);
		System.out.println(inum);
		
		int inum2 = 20;
		float fnum = inum2;
		
		System.out.println(inum);
		System.out.println(fnum);
		
		double dnum;
		dnum = fnum + inum;
		System.out.println(dnum);
		
		
		
		System.out.println("*** 명시적 형변환 ***");
		double dnum1 = 1.2;
		float fnum2 = 0.9f;
		
		int inum3 = (int)dnum1 + (int)fnum2;
		int inum4 = (int)(dnum1 + fnum2);
		System.out.println("inum3 : "+ inum3); // 1+0=1
		System.out.println("inum4 : "+ inum4); // 1.2+0.9=2
		
		
		double a = 1/3; // int / int => 결과 0.333333을 int로 바꿔니 0 => double 0.0
		System.out.println(a); // 작은값을 큰값으로 도출 int > double로 변경할때는 묵시적 형변환
		//앞에 int 붙일필요 없음
		
		//응용해서 문제풀이
		byte bnum6 = 10;
		double dnum6 = 2.0;

		int inum8 = bnum6 + (int)dnum6;
		System.out.println(inum8);
		
		
		double dnum12 = 3.3;
		float fnum15 = 2.9f;
		
		int inum10 = (int)dnum12 + (int)fnum15;
		int inum11 = (int)(dnum12 + fnum15);
		System.out.println("inum10 : "+ inum10);
		System.out.println("inum11 : "+ inum11);
				
		
		double dnum40 = 6.87;
		float fnum59 = 54.34f;
		
		int inum76 = (int)dnum40 +(int) fnum59;
		int inum77 = (int)(dnum40+fnum59);
		System.out.println("inum76 : "+inum76);
		System.out.println("inum77 : "+inum77	);
		
		
	
	}
}

