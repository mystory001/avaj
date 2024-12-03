package programmers;

import java.util.Arrays;

public class 칠의개수 {
	
	public static void main(String[] args) {

		int[] array = {7,77,17};
		int answer = 0;
		
		//int[] array를 문자열로 변경하여 7의 개수를 센다
		//배열을 문자열로 변경하려면?
		//문자열을 배열로
		//String.split() : 입력받은 정규표현식 또는 특정 문자를 기준으로 문자열을 나누어 배열에 저장하여 리턴
		//ex) String s = "1234";
		//String[] list = s.split("");
		//System.out.println(Arrays.toString(list)); //[1, 2, 3, 4]
		
		//배열을 문자열로
		//String.join() : 각 요소 사이에 지정된 구분 기호를 사용하여 문자열 배열의 모든 요소를 연결
		//ex)String[] list = ["a", "b", "c"];
		//String s = String.join("", list); //abc
		
		//현재 경우 int 배열을 문자열로 합쳐야함 => 참고 https://priming.tistory.com/178
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < array.length; i++) {
			sb.append(array[i]);
		}
		System.out.println(sb.toString()); //77717
		
		for(int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i)=='7') {
				answer++;
			}
		}
		System.out.println(answer);

		
		
	}

}
