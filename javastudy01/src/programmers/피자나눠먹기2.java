package programmers;

public class ���ڳ����Ա�2 {
	
	public static void main(String[] args) {

		//���� �� �ǿ� ���� 6�� => ��� ���� ���� ���� ������ �Ծ���Ҷ�
		int n = 4; //���ڸ� �������� ����� ��
		int answer = 1; //�ּ� �� �� ���Ѿ���?
		
		//n= 10, x = 6
		//10 5 2 1
		//6 3 2 1
		
		while(true) {
			if(6*answer%n==0) break;
			answer++;
		}
		
		System.out.println(answer);
		
	}

}
