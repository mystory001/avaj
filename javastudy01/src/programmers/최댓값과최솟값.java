package programmers;

import java.util.Arrays;

public class 최댓값과최솟값 { // Lv.2

	public static void main(String[] args) {
		
		String s = "-1 -2 -3 -4";
		
		String answer = "";
		
		String[] sArr = s.split(" ");
//		Arrays.sort(sArr); // [1, 2, 3, 4]
//		System.out.println(Arrays.toString(sArr));
//		
//		if(sArr[0].contains("-") && sArr[sArr.length -1].contains("-")) {
//			answer = sArr[sArr.length - 1] + " " + sArr[0];
//		} else {
//			answer =  sArr[0] + " " + sArr[sArr.length - 1];
//		}
//		
//		System.out.println(answer);
		
		// 코드 실행 후 실행 결과는 모두 성공하였으나 채점 결과는 모두 틀림
		
		int size = sArr.length;
		
		int[] intArr = new int[size];
		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = Integer.parseInt(sArr[i]);
		}
		
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));
		
		answer = intArr[0] + " " + intArr[intArr.length -1];
		System.out.println(answer);
		
		// 다른 풀이
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
		for(String str : s.split(" ")) {
			int num = Integer.parseInt(str);
			min = Math.min(min, num);
			max = Math.max(max, num);
		}

	}

}
