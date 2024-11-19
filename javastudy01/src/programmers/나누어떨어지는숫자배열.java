package programmers;

import java.util.Arrays;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		
		//처음 이 문제를 봤을 때 2가지 방법
		//1. answer의 길이를 구하고 값을 넣는 방식
		//2. List-> 중복 Set
		//3. 스트림 이용
		
		
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		int size = 0;
		
		for(int i =0; i < arr.length; i++) {
			if(arr[i]%divisor==0) {
				size++;
			}
		}
		
		if(size == 0) {
			int[] answer = {-1};
		} else {
			int[] answer = new int[size];
			int number = 0;
			for(int i = 0; i <arr.length; i++) {
				if(arr[i]%divisor==0) {
					answer[number]=arr[i];
					number++;
				}
			}
			Arrays.sort(answer);
		}

//		for(int i = 0; i <arr.length; i++) {
//			if(arr[i]%divisor==0) {
//				answer[number]=arr[i];
//				number++;
//			}
//		}
//		Arrays.sort(answer);

	}

}
