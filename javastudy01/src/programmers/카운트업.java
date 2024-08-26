package programmers;

import java.util.stream.IntStream;

public class 카운트업 {
	
	public static void main(String[] args) {

		int start_num = 3;
		int end_num = 10;
		int[] answer = new int[(end_num-start_num)+1];
		
		for(int i = start_num, j = 0; i <= end_num; i++,j++) {
			answer[j] = start_num++;
		}
		
		System.out.println(answer);
		
		for(int a:answer) {
			System.out.print(a);
		}
		
		
		//다른 풀이
		IntStream.range(start_num, end_num).toArray();
		
	}

}
