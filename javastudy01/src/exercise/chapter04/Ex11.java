package exercise.chapter04;

public class Ex11 {

	public static void main(String[] args) {
		
		//�Ǻ���ġ ����(�� �� ���� ���� ���� ���� ����� ���ư��� ����)
		//1�� 1���� �����ϴ� �Ǻ���ġ ������ 10��° ���� �������� ����ϴ� ���α׷�
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 0; //����° ��
		System.out.print(num1+", "+num2);
		
		num3 = num1 + num2; //2
		num1 = num3;
		num3 = num1+ num2;//3
		num2 = num3;
		num3 = num1+num2;//5
		
		for(int i = 0; i < 8; i++) {
			num3 = num1+num2;
			System.out.print(", " + num3);
			num1 = num2;
			num2 = num3;
		}

	}

}
