package programmers;

public class �������ǰ��� {
	
	public static void main(String[] args) {

		int n = 21;
		int answer = 0;
		
		//n�� ��� ���ϱ�
		for(int i = 1; i<=n;i++) {
			if(n%i==0) {
				answer++;
			}
		}
		
		System.out.println(answer);
	}

}
