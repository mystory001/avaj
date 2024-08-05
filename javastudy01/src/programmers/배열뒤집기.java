package programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 배열뒤집기 {

	public static void main(String[] args) {
		
		int[] num_list = {1,2,3,4,5,6,7};
		
		int[] answer = new int[num_list.length];
		
		for(int i = num_list.length-1, j=0; i>=0 ; i--, j++) {
			answer[j] = num_list[i];
		}
		
		for(int a : answer) {
			System.out.print(a);
		}
		
		//다른 풀이 1 -> ??
		List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
		Collections.reverse(list);
		list.stream().mapToInt(Integer::intValue).toArray();

	}

}
