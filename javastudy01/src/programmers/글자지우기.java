package programmers;

import java.util.Arrays;

public class 글자지우기 {

	public static void main(String[] args) {

		String my_string = "apporoograpemmemprs";
		int[] indices = { 1, 16, 6, 15, 0, 10, 11, 3 };
		String answer = "";

		StringBuilder sb = new StringBuilder(my_string);

		Arrays.sort(indices); // 정렬

		for (int i = indices.length - 1; i >= 0; i--) { // 오름차순 정렬 => 뒤에서 읽으면 내림차순 정렬이 됨
			sb.deleteCharAt(indices[i]);
		}

		answer = sb.toString();
		System.out.println(answer);

		// 다른 풀이
		String[] tmp = my_string.split("");
		for (int i = 0; i < indices.length; i++) {
			tmp[indices[i]] = "";
		}
		for (String a : tmp) {
			answer += a;
		}
		
	}

}
