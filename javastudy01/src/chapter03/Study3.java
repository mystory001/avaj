package chapter03;

public class Study3 {
	
	public static void main(String[] args) {

		//���� ������
		//����������(++) �ǿ������� ���� 1 ����
		//���ҿ�����(--) �ǿ������� ���� 1 ����
		
		//������ ���� �����Ǳ� ���� ���� j = ++i;
		//j = ++i; => ++i; j=i; //���� �Ŀ� �����Ͽ� ����
		//������ ���� ������ �Ŀ� ���� j = i++; 
		//j = i++; => j=i; i++; //�����Ͽ� ���� �� ����
		
		//��, ���� �����ڰ� ���������� ���� ���, �������� �������� ���̰� ����
		
		int i = 3, j = 0;
		
		j = i++;
		System.out.println("������ ����������, i = " + i + " j = " + j);
		
		i = 3; j = 0;
		j = ++i;
		System.out.println("������ ����������, i = " + i + " j = " + j);
		
		//��ȣ ������
		int num = -10;
		num = +num;
		System.out.println(num);
		
		num = -10;
		num = -num;
		System.out.println(num);
		
		
	}
}
