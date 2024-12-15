package programmers;

import java.util.Arrays;

public class Çà·ÄÀÇµ¡¼À {
	
	public static void main(String[] args) {

		int[][] arr1 = {{1,2},{2,4}};
		int[][] arr2 = {{3,4},{5,6}};
		//arr1.length = 2, arr1[0].length = 2;
		
//		int[][] arr1 = {{1},{2}};
//		int[][] arr2 = {{3},{5}};
		//arr1.length = 2, arr1[0].length = 1;
		
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[0].length; j++) {
				// arr1[0][0] + arr2[0][0] = answer[0][0]
				// arr1[0][1] + arr2[0][1] = answer[0][1], ...
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		System.out.println(Arrays.toString(answer));
		
		// ´Ù¸¥ Ç®ÀÌ
//		answer = arr1;
		
	}

}
