package programmers;

import java.util.Arrays;

public class ��������� {

	public static void main(String[] args) {

		String my_string = "apporoograpemmemprs";
		int[] indices = { 1, 16, 6, 15, 0, 10, 11, 3 };
		String answer = "";

		StringBuilder sb = new StringBuilder(my_string);

		Arrays.sort(indices); // ����

		for (int i = indices.length - 1; i >= 0; i--) { // �������� ���� => �ڿ��� ������ �������� ������ ��
			sb.deleteCharAt(indices[i]);
		}

		answer = sb.toString();
		System.out.println(answer);

		// �ٸ� Ǯ��
		String[] tmp = my_string.split("");
		for (int i = 0; i < indices.length; i++) {
			tmp[indices[i]] = "";
		}
		for (String a : tmp) {
			answer += a;
		}
		
	}

}
