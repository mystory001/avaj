package chapter04;

public class Study5 {
	
	public static void main(String[] args) {

		//��ø for��
		
		for(int i = 2; i<= 9; i++) {
			System.out.println(i + "��");
			for(int j = 1; j <=9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		
		//���� for���� ���� ����� �� �ٱ�for���� 1�� ����
		
		System.out.println();
		//�����
		//**********
		//**********
		//**********
		//**********
		//**********
		
		//1.
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		System.out.println("**********");
		
		System.out.println();
		
		//2.
		for(int i = 1; i <=5 ; i++) {
			System.out.println("**********");
		}
		
		System.out.println();
		
		//3. ���� �ۼ��� ��
		for(int i = 1; i<=5; i++) {
			System.out.print("*");
			for(int j = 1; j<=9; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//4.
		for(int i = 1; i <=5 ; i++) {
			for(int j = 1; j <=10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <=10 ; i++) {
			for(int j = i; j <=10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <=10 ; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
