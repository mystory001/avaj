package programmers;

import java.util.Arrays;

public class ����������¼��ڹ迭 {

	public static void main(String[] args) {
		
		//ó�� �� ������ ���� �� 2���� ���
		//1. answer�� ���̸� ���ϰ� ���� �ִ� ���
		//2. List-> �ߺ� Set
		//3. ��Ʈ�� �̿�
		
		
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		int size = 0;
		
		for(int i =0; i < arr.length; i++) {
			if(arr[i]%divisor==0) {
				size++;
			}
		}
		
		if(size == 0) {
			int[] answer = {-1};
		} else {
			int[] answer = new int[size];
			int number = 0;
			for(int i = 0; i <arr.length; i++) {
				if(arr[i]%divisor==0) {
					answer[number]=arr[i];
					number++;
				}
			}
			Arrays.sort(answer);
		}

//		for(int i = 0; i <arr.length; i++) {
//			if(arr[i]%divisor==0) {
//				answer[number]=arr[i];
//				number++;
//			}
//		}
//		Arrays.sort(answer);

	}

}
