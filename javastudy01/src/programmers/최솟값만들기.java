package programmers;

import java.util.Arrays;

public class �ּڰ������ { // Lv.2

	public static void main(String[] args) {

		int[] A = { 1, 4, 2 };
		int[] B = { 5, 4, 4 };

		int answer = 0;

		// A�迭���� ���� ���� �� * B�迭���� ���� ū ��
		
		Arrays.sort(A); // [ 1, 2, 4 ]
		Arrays.sort(B); // [ 4, 4, 5 ]
		
		for(int i = 0, j = B.length-1; i < A.length && j>=0; i++, j--) {
			answer += (A[i]*B[j]);
		}

		System.out.println(answer);
	}

}
