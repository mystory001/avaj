package programmers;

import java.util.Arrays;

public class �ִ񰪸���� {
	
	public static void main(String[] args) {
		int answer = 0;
		int[] numbers = {1, 2, 3, 4, 5};
		Arrays.sort(numbers);
		int a = 0;
		int b = numbers.length-1;
		while (a<b) {
			int tmp = numbers[a];
			numbers[a] = numbers[b];
			numbers[b] = tmp;
			a++;
			b--;
		}
		
		answer = numbers[0] * numbers[1];
		
		//�ٸ� Ǯ��
		//numbers[numbers.length-1]*numbers[numbers.length-2];
		
	}

}
