package chapter06;

public class Study16 {

	public static void main(String[] args) {
		
		//�����ε�(Overloading, ����)
		//�� Ŭ���� �ȿ� ���� �̸��� �޼��� ���� �� ���� �޼��� n : �޼��� �̸� 1
		//��ǥ���� �� println()
		
		//�����ε��� �����ϱ� ���� ����(3���� ������ �� �����Ǿ����)
		//1. �޼��� �̸��� ���ƾ���
		//2. �Ű������� ���� �Ǵ� Ÿ���� �޶����
		//3. ��ȯ Ÿ���� ������ ����

		//ex1) int add(int a, int b){return a+b;}
		//	   int add(int x, int y){return x+y;}
		// �����ε� X
		
		//ex2) int add(int a, int b){return a+b;}
		//	   long add(int a, int b){return (long)(a+b);}
		// �����ε� X. �ߺ�����
		
		//ex3) long add(int a, long b){return a+b;}
		//	   long add(long a, int b){return a+b;}
		// �����ε� O
		//�� add(3,1)�̶�� �޼��� ȣ�� �� �����߻�(ambiguous)
		
	}

}
