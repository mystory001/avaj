package programmers;

import java.util.Arrays;

public class 콜라츠수열만들기 {
	
	public static void main(String[] args) {

		int n = 10;
		int tmp = n;
		//1. 배열 길이를 구하기 => 1이 될 때까지 
		//2. 각 배열 요소를 배열에 담기
		int length = 0; //배열 길이
		
		while(n>0) {
			length++;
			if(n == 1) {
				break;
			}else {
				if(n%2==0) { //짝수
					n/=2;
				} else { //홀수
					n = 3*n+1;
				}
			}
		}
		
		int[] answer = new int[length];
		n = tmp;
		int idx = 0;
		while(n!=1) {
			answer[idx++] = n;
			if(n%2==0) {
				n/=2;
			} else {
				n = 3*n+1;
			}
		}
		answer[idx] = 1;
		System.out.println(Arrays.toString(answer));
	}

}
