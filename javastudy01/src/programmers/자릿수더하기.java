package programmers;

public class �ڸ������ϱ� {

	public static void main(String[] args) {
		
		int n = 1234;
		int answer = 0;
		
		
		/*
		n�� ���ڿ��� �ٲ㼭 ������ ���ڿ��� ���Ѱ����� �Ϸ��� ��
		String nString = n+"";
		for(int i = 0; i < nString.length(); i++) {
			answer += Integer.parseInt(nString, nString.charAt(i));
		}
		=> ��� java.lang.NumberFormatException. �߰������� �״��� ���� ����� �ƴ� �� ����
		*/
		
		
		int mod = 0;
		while(n>0) {
			mod = n%10;
			n/=10;
			answer += mod;
		}
		
		/*
		 * n = 1234%10 = 4
		 * n = 123%10 = 3
		 * n = 12%10 = 2
		 * n = 1%10 = 1
		 * answer = 4 + 3 + 2 + 1
		 */
		
		System.out.println(answer);
		
		//���� ������ ���
		while(n>0) {
			answer+=n%10;
			n/=10;
		}
		
		//�ٸ� ���
		//String�� ��� length()�� ����������, int�� �������� ���� �� ��� Math�Լ��� �̿��ؾ���
		int length = (int)(Math.log10(n)+1);
		System.out.println("n�� ���� : " + length);
		for(int i = 0; i< length; i++) {
			answer+=n%10;
			n/=10;
		}
				

	}

}
