package programmers;

import java.util.Arrays;

public class �迭�ڸ��� {
	
	public static void main(String[] args) {

		int[] numbers = {1,2,3,4,5};
		int num1 = 2;
		int num2 = 3;
		int[] answer = new int[num2-num1+1];
		
		
		for(int i = 0, j = num1; j <= num2; i++,j++) {
			answer[i] = numbers[j];
		}
		
		for(int a : answer) {
			System.out.println(a);
		}
		
		//�ٸ� Ǯ��
		answer = Arrays.stream(numbers,num1,num2+1).toArray();
		
		for(int i = 0; i<num2-num1+1; i++) {
			answer[i] = numbers[num1++];
		}
		
	}

}
