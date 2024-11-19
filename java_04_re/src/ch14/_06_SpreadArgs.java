package ch14;

public class _06_SpreadArgs {
	
	public _06_SpreadArgs() {}
	
	public void Countries(String ...country) {
		for(int i = 0; i < country.length; i++) {
			System.out.println("내가 가고 싶은 나라 중 "+ (i+1) + "번째 나라는 " + country[i] + "이다.");
		}
	}
}
