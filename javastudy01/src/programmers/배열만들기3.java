package programmers;

import java.util.ArrayList;

public class 배열만들기3 { //일전에 풀어보려고 했으나 문제를 이해 못함
	
	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		int[][] intervals = {{1,3},{0,4}}; //인덱스{{a1,a2}{b1,b2}} => a1인덱스에서 a2인덱스를 포함하며 안의 숫자를
		
//		int[] answer = {}; //배열의 길이를 구하는 것이 가장 큰 문제가 될 듯?, 만약 길이를 구하지 않으려면 => ArrayList를 사용
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0; i < intervals.length; i++) {
			for(int j = intervals[i][0]; j <= intervals[i][1]; j++) {
				al.add(arr[j]);
			}
		}
		
		int[] answer = new int[al.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = al.get(i);
		}
		for(int a : answer) {
			System.out.println(a);
		}
	}

}
