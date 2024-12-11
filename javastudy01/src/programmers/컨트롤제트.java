package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class 컨트롤제트 {

	public static void main(String[] args) {

		String s = "1 2 Z 3";
		int answer = 0;

		String[] sArr = s.split(" "); // [1, 2, Z, 3]

		int tmp = 0;
		for (int i = 0; i < sArr.length; i++) {
			if (!sArr[i].equals("Z")) {
				tmp += Integer.parseInt(sArr[i]);
			}
		}
		System.out.println(tmp);

		// Z이전의 요소를 찾아내서 answer = tmp - Z 이전의 요소

		for (int i = 0; i < sArr.length; i++) {
			if (sArr[i].equals("Z")) {
				tmp -= Integer.parseInt(sArr[i - 1]);
			}
		}
		answer = tmp;
		System.out.println(answer);

		// 다른 풀이
		answer = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for (String w : s.split(" ")) {
			if (w.equals("Z")) {
				stack.pop();
			} else {
				stack.push(Integer.parseInt(w));
			}
		}
		for (int i : stack) {
			answer += i;
		}
		
	}

}
