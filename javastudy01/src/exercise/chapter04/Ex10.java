package exercise.chapter04;

public class Ex10 {

	public static void main(String[] args) {
		
		//intŸ���� ���� num, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ�
		//���� num�� ���� 12345���, '1+2+3+4+5'�� ����� 15�� ���
		//��, ���ڿ��� ��ȯ�������� ���ڷθ� ó��
		
		int num = 12345;
		int sum = 0;
		
//		System.out.println(num/10000);
//		System.out.println(num%10000/1000);
		//...
//		sum = num/10000 + num%10000/1000 + num%1000/100 + num %100/10 + num%10/1;
		
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		
		System.out.println("sum = " + sum);
	}

}
