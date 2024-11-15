package programmers;

import java.util.Arrays;

public class 문자열정렬하기2 {
	
	public static void main(String[] args) {

		String my_string = "Bcad";
		String answer = "";

		//문자열을 문자배열로 => char[] 변수명 = 문자열.toCharArray();
		char[] charArr = my_string.toLowerCase().toCharArray();
		Arrays.sort(charArr);
		
		//문자배열을 문자열로 변환
		//1. String 생성자 이용 : new String(문자배열)
		//2. String.valueOf() : String.valueOf(문자배열)
		//3. String.copyValueOf() : String.copyValueOf(문자배열)
		answer = new String(charArr);
		
		System.out.println(answer);
		
	}

}
