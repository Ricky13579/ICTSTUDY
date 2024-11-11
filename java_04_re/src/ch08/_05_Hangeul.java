package ch08;

public class _05_Hangeul {
	public static void main(String[] args) {
		String[][] korean = {{"ㄱ", "ㄴ"}, {"ㄷ", "ㄹ"}, 
							{"ㅁ", "ㅂ"},	 {"ㅅ", "ㅇ"}, 
							{"ㅈ", "ㅊ"}, {"ㅋ", "ㅍ"},
							{"ㅌ", "ㅎ"}};
		int sum = 0;
		for(int i = 0; i < korean.length; i++) {
			for(int j = 0; j < korean[i].length; j++) {
				System.out.println(korean[i][j]);
				sum++;
			}
		}
		System.out.println();
		System.out.println("세종대왕님이 만드신 한글의 자음은 쌍자음을 제외하고 총 "+sum+"개의 자음이 있습니다.");
		
	}
}
