package programmers;

import java.util.Arrays;

public class 정수찾기 {

	public static void main(String[] args) {
		
		int[] num_list = {1, 2, 3, 4, 5};
		int n = 3;
		int answer = 0;
		
		for(int i = 0; i<num_list.length;i++) {
			if(num_list[i] == n)
				answer = 1;
		}
		System.out.println(answer);
		
		//다른 풀이
//		Arrays.stream(num_list).anyMatch(a-> a==n)1:0;
	}

}
