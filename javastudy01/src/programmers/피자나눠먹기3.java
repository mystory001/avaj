package programmers;

public class ���ڳ����Ա�3 {

	public static void main(String[] args) {

		int slice = 7; // ���� ������
		int n = 10; // ��� ��
		int answer = (n%slice)==0?(n/slice):(n/slice)+1;
		//�ٸ� Ǯ�� : (n+slice-1)/slice
		
		System.out.println(answer);
		
		
	}

}
