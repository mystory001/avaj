package programmers;

import java.util.Arrays;

public class 문자열내침차순으로배치하기 {
	
	public static void main(String[] args) {

		String s = "Zbcdefg";
		String answer = "";
		//대문자는 소문자보다 작은 것으로 간주
		String[] sArr = s.split("");
		Arrays.sort(sArr); // [Z, b, c, d, e, f, g]

		for(int i = sArr.length - 1; i>=0; i--) {
			answer += sArr[i];
		}
		
		System.out.println(answer);
	}

}
