package programmers;

public class x��ŭ�������ִ�n���Ǽ��� {
	
	public static void main(String[] args) {

		int x = 4;
		int n = 3;
		long[] answer = new long[n];
		
		for(int i = 0; i<answer.length;i++) {
			answer[i] = (long)x*(i+1); //����� ����ȯ �ʼ�
		}
		
		for(long a: answer) {
			System.out.println(a);
		}
		
	}

}
