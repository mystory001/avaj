package chapter03;

public class Study4 {

	public static void main(String[] args) {

		//����ȯ ������
		//����ȯ? ���� �Ǵ� ����� Ÿ���� �ٸ� Ÿ������ ��ȯ
		//(Ÿ��)�ǿ�����
		double d = 85.4;
		int integer = (int)d;
		double cd = integer;
		System.out.println(d);
		System.out.println(cd);
		
		//�ڵ�����ȯ
		//�����Ϸ��� �ڵ����� ����ȯ
		float f = 1234;
		//== float f = (float)1234;
		//int i = 3.14f; 
		//ū -> ���� => �� �ս� �߻�
		int i = (int)3.14f;
		//���� ���� �ִ��� ������ �� �ִ� Ÿ������ �ڵ� ����ȯ��
		
		byte b1 = 100;
		byte b2 = (byte)100; //���ͷ�
		
		int i1 = 100;
		//byte b3 = i; i�� �����̰� i�� ���� �𸣱� ������ �����Ϸ��� �� �� ����-> ���� 
		byte b3 = (byte)i; //��������ȯ
		
		//byte b4 = 1000; byteŸ���� ������ ��� �� ���������� ����
		byte b4 = (byte)1000; //�� �ս��� �߻��Ͽ� b4���� -24�� ���� ����
		
		
	}
}
