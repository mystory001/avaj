package chapter09;

public class Study10Ex3 {

	public static void main(String[] args) {

		int i = 10;
		
		//�⺻���� ���������� �� ��ȯ(����ȯ ���� ����)
		Integer integer = (Integer)i; //Integer intger = Integer.valueOf(i);
		Object obj = (Object)i; //Object obj = (Object)Integer.valueOf(i);
		
		Long long1 = 100L; //Long long1 = new Long(100L);
		int i2 = integer + 10; //�������� �⺻������ ����. ����
		long l = integer +long1; //������ ���� ���� ����
		
		Integer integer2 = new Integer(20);
		int i3 = (int)integer2; //�������� �⺻������ ����ȯ�� ����(����ȯ ��������)
		
		//������ �� �ڵ�
		//Integer integer = (Integer)i;
		//Object obj = (Object)i;
		//Long long1 = 100L;
		
		//������ �� �ڵ�
		//Integer integer = Integer.valueOf(i);
		//Object obj = (Object)Integer.valueOf(i);
		//Long long1 = new Long(100L);
		
	}
	
}
