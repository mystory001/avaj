package chapter02;

public class Study4 {

	public static void main(String[] args) {

		//���ͷ��� ���λ�� ���̻�
		boolean power = true;
		char ch = 'A';
		String string ="ABC";
		byte b = 127;
		//byte b1 = 128; 
		int i = 100; //10����
		int oct = 0100; //8����
		int hex = 0x100; //16����
		//���λ� 0, 0x, 0b(2�� ���λ�)
		//���̻� L, F
		
		long l = 10_000_000_000L;
		long l1 = 100;
		
		float f = 3.14F;
		double d = 3.14; 
		
		//10. => 10.0
		//.10 => 0.10
		//10F => 10.0F
		//1e3 => 1000.0
		
		//������ ���ͷ��� Ÿ�� ����ġ
		//������ ���� > ���ͷ� �� ��� => ����
		int x = 'A'; //int > char
		long y = 123; //long > int
		double z = 3.14F; //double > float
		
		//������ ���� < ���ͷ� �� ��� => �Ұ���
		//int x1 = 30_0000_0000;
		//long y1 = 3.14F;
		//float z1 = 3.14;
		
		//byte, short ������ int ���ͷ� ���� ����
		//��, ������ Ÿ���� ���� �̳�������
		byte b1 = 100;
		//byte b2 = 128;
		
		
		
		
		
	}
}
