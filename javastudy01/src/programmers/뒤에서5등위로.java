package programmers;

import java.util.Arrays;

public class �ڿ���5������ {
	
	public static void main(String[] args) {

		int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		int[] answer = new int[num_list.length-5];
		
		Arrays.sort(num_list); //[1, 4, 10, 12, 14, 15, 32, 38, 46, 56]
		for(int i = 5; i<num_list.length ; i++) {
			answer[i-5] = num_list[i];
		}
		
		//�迭 ����
		//���� �迭�� �Ϻθ� ����� : System.arraycopy(������ ���, ������ �迭(A)�� ���� �ε���, ����� ��, ����� �迭(B), ���� �ε���, ������ ����)
	 	//Ư�� ���� �迭 ���� : Arrays.copyOfRange(�����迭, �����Ϸ��� ���� ����� �ε���, �����Ϸ��� ������ ����� �ε����� ���� �ε���)
		Arrays.copyOfRange(num_list, 5, num_list.length);
		

	}

}
