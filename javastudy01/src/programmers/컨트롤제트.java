package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ��Ʈ����Ʈ {

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

		// Z������ ��Ҹ� ã�Ƴ��� answer = tmp - Z ������ ���

		for (int i = 0; i < sArr.length; i++) {
			if (sArr[i].equals("Z")) {
				tmp -= Integer.parseInt(sArr[i - 1]);
			}
		}
		answer = tmp;
		System.out.println(answer);

		// �ٸ� Ǯ��
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
