package chapter08;

public class Study03Ex1 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch (ArithmeticException e) {
			e.printStackTrace(); //�������� a�� ���� ������ ArithmeticException �ν��Ͻ��� ���� ����
			System.out.println("���� �޽��� : " + e.getMessage());
		}
		
		System.out.println(5);
		
	}

}
