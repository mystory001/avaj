package programmers;

import java.util.Arrays;

public class 가장큰수찾기 {
	
	public static void main(String[] args) {

		int[] array = {1,3,9,5};
		int[] answer = new int[2]; //0번 인덱스 : 가장 큰 수, 1번 인덱스 : 인덱스
		
		answer[0] = Arrays.stream(array).max().getAsInt();
		answer[1] = Arrays.binarySearch(array, answer[0]);
		
		for(int a : answer) {
			System.out.println(a);
		}
		
		//다른 풀이
	       for(int i=0;i<array.length;i++) {
	            if(array[i] > answer[0]) {
	                answer[0] = array[i];
	                answer[1] = i;
	            }
	        }
		
	}
	
}
