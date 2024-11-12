package programmers;

import java.util.Arrays;

public class 접미사배열 {
	
	public static void main(String[] args) {

		String my_string = "banana";
		String[] answer = new String[my_string.length()];
		
		for(int i = 0; i < my_string.length(); i++) {
			answer[i] = my_string.substring(i);
		}
		//substring() : 문자열의 특정 부분을 잘라내는 데 사용
		
		System.out.println(Arrays.toString(answer));
		
		Arrays.sort(answer);
		
	}

}
