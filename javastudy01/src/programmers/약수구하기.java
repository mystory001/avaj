package programmers;

import java.util.Arrays;

public class ������ϱ� {
	
	public static void main(String[] args) {
		//�������� 0�� ��� ���
		int n = 24;
		int[] answer = new int[n]; //���Ƿ� �迭�� ���̸� ����(����̱� ������ n���� ����� ������ Ŭ �� ���� �ִ� ũ�ų� ����)
		
		int idx = 0;
		
		for(int i = 1; i<=n; i++) { //n�� ��� ���ϱ�
			if(n%i==0) {
				answer[idx++] = i;
			}
		}
		
		System.out.println(Arrays.toString(answer)); //[1, 2, 3, 4, 6, 8, 12, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		
		Arrays.copyOf(answer, idx);
		
		//�迭 ���� ��� ���ϱ�
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                //answer[cnt] = i;
                cnt++;
            }
        }

        answer = new int[cnt];

        cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[cnt] = i;
                cnt++;
            }
        }

	}

}
