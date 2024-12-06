package test;

import java.util.*;

public class Practice {
	public static void main(String[] args) {
		int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
		int idx = 0;
		if(arr.length >= arr[0].length) {
			idx = arr.length;
		}else {
			idx = arr[0].length;
		}
		int[][] answer = new int[idx][idx];
		if(arr.length > arr[0].length) {
			for(int i = 0; i < answer.length; i++) {
				for(int j = 0; i < answer[i].length; j++) {
					if(j >= arr[i].length) {
						answer[i][j] = 0;
					}else if(j < arr[i].length) {
						answer[i][j] = arr[i][j];
					}
					System.out.println(answer[i][j]);
				}
			}
		}else if(arr.length == arr[0].length){
			for(int i = 0; i < answer.length; i++) {
				for(int j = 0; i < answer[i].length; j++) {
					answer[i][j] = arr[i][j];
				}
			}
		}else {
			for(int i = 0; i < answer.length; i++) {
				for(int j = 0; i < answer[i].length; j++) {
					if(i >= arr.length) {
						answer[i][j] = 0;
					}else {
						answer[i][j] = arr[i][j];
					}
				}
			}
		}
		System.out.println(answer.length);
	}
}
