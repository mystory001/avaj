package programmers;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {
	
	public static void main(String[] args) {

		//접근 방법 
		//1. 정렬을 만든다. => 중간에 코드 절수 있다. 위험 요소가 큼
		//2. n을 배열로 만들고 => 배열을 다시 long형으로 변경한다.
		long n = 118372;
		long answer = 0;
		String nString = Long.toString(n); //문자형으로 변경
		String[] tmp = new String[nString.length()];
		for(int i = 0; i < nString.length(); i++) {
			tmp[i] = nString.charAt(i)+"";
		}
		
		Arrays.sort(tmp);

		String answerString = "";
		for(int i = tmp.length - 1; i >= 0; i--) {
			answerString += tmp[i];
		}
		System.out.println("answerString : " + answerString);
		
		answer = Long.parseLong(answerString);
		
		//다른 사람 풀이
		//String valueOf(n).split("");
	}

}
