package programmers;

public class �������Ǻ� {

	public static void main(String[] args) {
		
		//���� n�� ��������� 1, �ƴ϶�� 2
		int n = 9;
		
		int answer = 0;

		//Math.sqrt() : ��Ʈ
		//Math.pow() : �ŵ�����
		if(Math.sqrt(n)%1==0) {
			answer = 1;
		} else {
			answer = 2;
		}
		
		System.out.println(answer);
		
		//�ٸ� Ǯ��
		if(n%Math.sqrt(n)==0) {
			answer = 1;
		} else {
			answer = 2;
		}
		

	}

}
