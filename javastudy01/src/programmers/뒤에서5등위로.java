package programmers;

import java.util.Arrays;

public class 뒤에서5등위로 {
	
	public static void main(String[] args) {

		int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		int[] answer = new int[num_list.length-5];
		
		Arrays.sort(num_list); //[1, 4, 10, 12, 14, 15, 32, 38, 46, 56]
		for(int i = 5; i<num_list.length ; i++) {
			answer[i-5] = num_list[i];
		}
		
		//배열 복사
		//기존 배열의 일부만 덮어쓰기 : System.arraycopy(복사할 대상, 복사할 배열(A)의 시작 인덱스, 복사될 곳, 복사될 배열(B), 시작 인덱스, 복사할 길이)
	 	//특정 범위 배열 복사 : Arrays.copyOfRange(원본배열, 복사하려는 시작 요소의 인덱스, 복사하려는 마지막 요소의 인덱스의 다음 인덱스)
		Arrays.copyOfRange(num_list, 5, num_list.length);
		

	}

}
