package programmers;

import java.util.Arrays;

public class 배열의길이에따라다른연산하기 {

	public static void main(String[] args) {
		
		int[] arr = {444, 555, 666, 777};
		int n = 100;
		
		//arr 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을 반환
		//arr 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 반환
		
		int[] answer = new int[arr.length];
		
		if(arr.length%2!=0) {
			for(int i = 0; i<arr.length;i++) {
				if(i%2!=0) {
					answer[i] = arr[i];
				} else {
					answer[i]=arr[i]+n;
				}
			}
		} else {
			for(int i = 0 ; i<arr.length;i++) {
				if(i%2!=0) {
					answer[i] = arr[i]+n;
				} else {
					answer[i] = arr[i];
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
		//다른 풀이
		for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 0 && i % 2 != 0) {  
                answer[i] = arr[i] + n;
            } else if (arr.length % 2 != 0 && i % 2 == 0) {
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }
		 
		 //다른 풀이
	     for(int idx=arr.length%2==0?1:0; idx<arr.length; idx+=2) {
	            arr[idx]+=n;
	        }
	}

}
