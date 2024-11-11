package ch05;

public class _04_ArrayEx {
	public static void main(String[] args) {
		int [][] arr = {{1, 2, 3}, 		// 0행
						{4, 5, 6}}; 	// 1행
		
		for(int i = 0; i < arr.length; i++) { // 행 => 배열.length
			for(int j = 0; j < arr[i].length; j++) { // 열 => 행.length
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < 2; i++) { // 행 => 배열.length
			for(int j = 0; j < 3; j++) { // 열 => 행.length
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		
		String[][] str = {{"A", "B", "C"},
							{"D", "E", "F"}, 
							{"G", "H", "I"}};
		for(int i = 0; i < str.length; i++) {
			for(int j = 0; j < str[i].length; j++) {
				System.out.println(str[i][j]);
			}
			System.out.println();
		}
		
	}
}
