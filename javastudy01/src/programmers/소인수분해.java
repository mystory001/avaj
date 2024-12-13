package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ���μ����� {

	public static void main(String[] args) {

		int n = 420;
		int[] answer = {}; // length�� ���ϴ� ���� �ʿ��ұ�?

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				while (n % i == 0) {
					n /= i;
				}
				list.add(i);
			}
		}

		System.out.println(list);

		answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		System.out.println(Arrays.toString(answer));

		// �ٸ� Ǯ��
		if (n < 3) {
			answer = new int[] { 2 };
		}

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				set.add(i);
				n /= i;
				i = 1;
			}
		}

		if (set.size() == 0) {
			answer = new int[] { n };
		}

		set.stream().mapToInt(Integer::intValue).toArray();
	}

}
