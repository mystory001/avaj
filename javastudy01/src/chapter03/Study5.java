package chapter03;

public class Study5 {
	
	public static void main(String[] args) {

		//���� �������� ����� ������
		//��� ��ȯ : ���� �� �ǿ������� Ÿ���� ��ġ ��Ű�� ��
		//�� ���� ��Ģ�� �ݵ�� �ϱ��� ��
		//��Ģ 1. �� �ǿ������� Ÿ���� ���� ��ġ��Ŵ(���� ū Ÿ������ ��ġ, �� �ս��� �ּ�ȭ�ϱ� ���ؼ�)
		//long + int => long + long ==> long
		//float + int => float + float ==> float
		//double + float => double + double ==> double
		//��Ģ 2. �ǿ������� Ÿ���� int���� ���� Ÿ���̸� int�� ��ȯ
		//byte + short => int + int => int
		//char + short => int + int => int
		char a = '2', b = '0';
		System.out.println(a-b); //���ڿ��� ���ڷ� ����ȯ�� �� -'0'�� �ϴ� ����
		
		System.out.println();
		
		int x = 1000000;
		int y = 2000000;
		
		long z = x * y; //�����÷ο찡 �߻���
		long z1 = (long)x * y; //�����÷ο찡 �߻����� �������� x�� y�� �� ��ȯ�������
		System.out.println(z);
		System.out.println(z1);
		
	}

}
