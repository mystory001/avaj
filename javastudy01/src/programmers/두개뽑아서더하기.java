package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class 두개뽑아서더하기 {
	
	public static void main(String[] args) {

		//정수 배열 numbers가 주어집니다. 
		//numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
		
		int[] numbers = { 5,0,2,7 }; // [2,3,4,5,6,7]
//		int[] answer = {};
		
		Arrays.sort(numbers); // [1, 1, 2, 3, 4]
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		
		int[] answer = new int[set.size()];
		
		int idx = 0;
		for(Integer i : set) {
			answer[idx++] = i;
		}
		Arrays.sort(answer); // Set은 순서가 보장되지 않으므로 넣어줘야함
		
		// 다른 풀이 (Iterator 사용)
		HashSet<Integer> set2 = new HashSet<Integer>();
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				set2.add(numbers[i] + numbers[j]);
			}
		}
		int idx2 = 0;
		Iterator<Integer> it = set2.iterator();
		while(it.hasNext()) {
			answer[idx2] = (int)it.next();
			idx2++;
		}
		
		
	}

}
