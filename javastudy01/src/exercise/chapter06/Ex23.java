package exercise.chapter06;

import java.util.Arrays;

public class Ex23 {

	static int max(int[] arr) {
		if(arr==null||arr.length==0) 
			return -999999;
		
		int max = arr[0]; //배열의 첫 번째값으로 최대값을 초기화
		for(int i =1; i<arr.length;i++) { //i = 1 =>max를 배열의 첫번째 값으로 초기화했으므로 0번 인덱스 값을 비교할 필요 없음
			if(arr[i]>max) { //비교해서 최대값(0번 인덱스)보다 크면 그 값을 변수 max에 저장
				max=arr[i];
			}
		}
		return max;
		
	}
	
	
	public static void main(String[] args) {
		
		int[] data = {3,2,9,4,7};
		System.out.println(Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
		System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[0]));
		System.out.println("최대값 : " + max(new int[] {}));

	}

}
