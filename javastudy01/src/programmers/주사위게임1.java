package programmers;

public class �ֻ�������1 {

	public static void main(String[] args) {
		//�� �ֻ����� ���� ���� ���ڸ� ���� a, b
		//a�� b�� ��� Ȧ����� a^2 + b^2�� ��
		//a�� b �� �� �� �ϳ��� Ȧ����� 2(a+b)
		//a�� b�� ��� ¦����� |a-b|
		
		int a = 3, b=2;
		int answer;
		if(a%2!=0 && b%2!=0) {
			answer = (int)Math.pow(a,2) + (int)Math.pow(b, 2);
		} else if((a%2==0 && b%2!=0) || (a%2!=0 && b%2==0)) {
			answer = 2*(a+b);
		} else {
			answer = Math.abs(a-b);
		}
		
		System.out.println("=====================");
		//Ǯ�� 1
		boolean x = a % 2 !=0;
		boolean y = b % 2 !=0;
		if(x&&y) {
			answer = a*a + b*b;
		} else if(x||y) {
			answer = 2 * (a+b);
		} else {
			answer = Math.abs(a-b);
		}
		
		//Ǯ�� 2
		answer = a % 2 != 0 && b % 2 != 0 ? (int) (Math.pow(a, 2) + Math.pow(b, 2)) : a % 2 != 0 || b % 2 != 0 ? 2 * (a + b) : Math.abs(a - b);

	}

}
