package programmers;

import java.util.Arrays;

public class 최솟값만들기 { // Lv.2

	public static void main(String[] args) {

		int[] A = { 1, 4, 2 };
		int[] B = { 5, 4, 4 };

		int answer = 0;

		// A배열에서 가장 작은 수 * B배열에서 가장 큰 수
		
		Arrays.sort(A); // [ 1, 2, 4 ]
		Arrays.sort(B); // [ 4, 4, 5 ]
		
		for(int i = 0, j = B.length-1; i < A.length && j>=0; i++, j--) {
			answer += (A[i]*B[j]);
		}

		System.out.println(answer);
	}

}
