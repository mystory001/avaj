package programmers;

import java.util.Arrays;

public class ���������������ι�ġ�ϱ� {
	
	public static void main(String[] args) {

		//���� ��� 
		//1. ������ �����. => �߰��� �ڵ� ���� �ִ�. ���� ��Ұ� ŭ
		//2. n�� �迭�� ����� => �迭�� �ٽ� long������ �����Ѵ�.
		long n = 118372;
		long answer = 0;
		String nString = Long.toString(n); //���������� ����
		String[] tmp = new String[nString.length()];
		for(int i = 0; i < nString.length(); i++) {
			tmp[i] = nString.charAt(i)+"";
		}
		
		Arrays.sort(tmp);

		String answerString = "";
		for(int i = tmp.length - 1; i >= 0; i--) {
			answerString += tmp[i];
		}
		System.out.println("answerString : " + answerString);
		
		answer = Long.parseLong(answerString);
		
		//�ٸ� ��� Ǯ��
		//String valueOf(n).split("");
	}

}
