package programmers;

import java.util.ArrayList;
import java.util.List;

public class 배열만들기1 {

	public static void main(String[] args) {
		
		int n = 10;
		int k = 3;
		int[] answer = new int[n/k];
		
		for(int i = 0; i<answer.length;i++) {
			answer[i] = k*(i+1);
		}
		
		for(int a : answer) {
			System.out.println(a);
		}
		
		//다른 풀이
//		List<Integer> list = new ArrayList<Integer>();
//		for(int i = k; i<=n; i+=k) list.add(i);
//		answer = list.stream().mapToInt(Integer::intValue).toArray();
	}

}
