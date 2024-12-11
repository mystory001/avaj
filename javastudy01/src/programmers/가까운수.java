package programmers;

import java.util.Arrays;

public class 가까운수 {
	
	public static void main(String[] args) {

		int[] array = {3,10,28};
		int n = 20;
		
		int answer = 0;
		
		// 테스트 5, 테스트 13 에서 실패 => 비슷한 경우를 찾아봤는데 n이 배열 요소의 딱 중앙의 값일 때 오류가 생김
//		int[] diff = new int[array.length];
//		int minDiff = Integer.MAX_VALUE;
//		int idx = -1;
//		
//		for(int i = 0; i < array.length; i++) {
//			diff[i] = array[i]-n;
//		} 
//		
//		System.out.println(Arrays.toString(diff)); // [-17, -10, 8]
//
//	      // diff 배열을 순차적으로 확인하면서 0에 가장 가까운 값을 찾음
//        for (int i = 0; i < diff.length; i++) {
//            if (Math.abs(diff[i]) < minDiff) {  // 차이가 더 작으면 업데이트
//                minDiff = Math.abs(diff[i]);
//                idx = i;
//            }
//        }
//        
//        answer = array[idx];
//        System.out.println(answer);
		
		int minDiff = Math.abs(array[0]-n);
		answer = array[0];
		
		for(int i = 0; i < array.length; i++) {
			int diff = Math.abs(array[i] - n);
			if(diff < minDiff || (diff == minDiff && answer > array[i])) {
				minDiff = diff;
				answer = array[i];
			}
		}
		
		// 다른 풀이
		answer = 0;
		Arrays.sort(array);
		
		for(int i = 1; i < array.length; i++) {
			if(Math.abs(n-array[0])>Math.abs(n-array[i])) {
				array[0] = array[i];
			}
		}
        answer = array[0];
        
		
	}

}
