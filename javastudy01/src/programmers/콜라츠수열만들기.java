package programmers;

import java.util.Arrays;

public class �ݶ������������ {
	
	public static void main(String[] args) {

		int n = 10;
		int tmp = n;
		//1. �迭 ���̸� ���ϱ� => 1�� �� ������ 
		//2. �� �迭 ��Ҹ� �迭�� ���
		int length = 0; //�迭 ����
		
		while(n>0) {
			length++;
			if(n == 1) {
				break;
			}else {
				if(n%2==0) { //¦��
					n/=2;
				} else { //Ȧ��
					n = 3*n+1;
				}
			}
		}
		
		int[] answer = new int[length];
		n = tmp;
		int idx = 0;
		while(n!=1) {
			answer[idx++] = n;
			if(n%2==0) {
				n/=2;
			} else {
				n = 3*n+1;
			}
		}
		answer[idx] = 1;
		System.out.println(Arrays.toString(answer));
	}

}
