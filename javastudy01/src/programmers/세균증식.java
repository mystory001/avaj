package programmers;

public class �������� {
	
	public static void main(String[] args) {

		int n = 7; //ó�� ������ ���� ��
		int t = 15; //�ð�
		
		//1�ð� �� => n = 7*2
		//2�ð� �� => n = n*2
		//3�ð� �� => n = n*2
		// ...
		// n �ð� �� = n = n*2^t
		
		int answer = n*(int)Math.pow(2, t);
		System.out.println(answer);
		
	}

}
