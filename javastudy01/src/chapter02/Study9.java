package chapter02;

public class Study9 {

	public static void main(String[] args) {
		
		//println()�� ����
		//1) ��� ������ ������ �� ���� : �Ǽ��� �ڸ����� ������ �� ���� - �Ҽ��� n�ڸ��� ����Ϸ���
		System.out.println(10.0/3);
		
		//2) ����� 10�����θ� ��µ�
		System.out.println(0x1A);
		
		//println�� ������ ���� => printf() : ��������� ������ �� ����
		System.out.printf("%.2f", 10.0/3);
		//"%.2f" -> �Ҽ��� ��°�ڸ�
		System.out.printf("%d", 0x1A);
		//"%d" -> 10����
		System.out.printf("%X\n", 0x1A);
		//"%X" -> 16����
		
		//printf() ������
		//%b : Boolean �������� ���
		//%d : 10��(decimal) ������ �������� ���
		//%o : 8��(octal) ������ �������� ���
		//%x, %X : 16��(hexa-decimal) ������ �������� ���
		//%f : �ε� �Ҽ���(floating-point)�� �������� ���
		//%e, %E : ����(exponent) ǥ������ �������� ���
		//%c : ����(character)�� ���
		//%s : ���ڿ�(string)�� ���
		System.out.printf("age:%d year:%d\n", 24, 2024);
		
		System.out.println();
		//������ 10����, 8����, 16������ ���
		// %n == \n ���๮�� 
		System.out.printf("%d%n", 15); //10����
		System.out.printf("%o%n", 15); //8����
		System.out.printf("%x%n", 15); //16����
		System.out.printf("%X%n", 15); //16����
		System.out.printf("%s%n", Integer.toBinaryString(15)); //2���� ��2����������ϴ� �����ڴ� ����
		
		System.out.println();
		
		//8������ 16������ ���λ� ���̱� #
		System.out.printf("%#o%n", 15);
		System.out.printf("%#x%n", 15);
		System.out.printf("%#X%n", 15);
		
		System.out.println();
		
		//�Ǽ� ����� ���� ������ %f, �������� %e, ������ ��� %g
		float f = 123.4567890F;
		System.out.printf("%f%n", f); //�Ҽ����Ʒ� 6�ڸ�(���е��� ���ؼ�=>���� double�� ���� ���)
		System.out.printf("%e%n", f); //��������
		System.out.printf("%g%n", 123.456789); //������ ����
		System.out.printf("%g%n", 0.000000001); //������ ����
		
		System.out.println();
		
		System.out.printf("[%5d]%n",10);
		System.out.printf("[%-5d]%n",10); //���� ����
		System.out.printf("[%05d]%n",10);
		
		System.out.println();
		
		//%��ü�ڸ�.�Ҽ��� �Ʒ��ڸ�f
		double d = 123.12345;
		System.out.printf("%14.10f%n", d);
		
		System.out.println();
		
		System.out.printf("[%s]%n", "github.com/mystory001");
		System.out.printf("[%30s]%n", "github.com/mystory001");
		System.out.printf("[%-30s]%n", "github.com/mystory001");
		System.out.printf("[%.10s]%n", "github.com/mystory001");
//		System.out.printf("[%-.10s]%n", "github.com/mystory001"); �̰� ������
		
		
		
	}
}
