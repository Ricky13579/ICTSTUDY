package ch08;

public class _03_HolJJak {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		String[] answer = new String[9];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				answer[i] = "짝수";
			}else if(arr[i] % 2 == 1){
				answer[i] = "홀수";
			}else {
				answer[i] = "";
			}
			System.out.println(arr[i] + "는(은) " + answer[i]);
		}
		
	}
}
