package chapter10;

import java.util.Calendar;
import java.util.Date;

public class Study02 {

	public static void main(String[] args) {

		//set()���� ��¥�� �ð� ����
		//����� �Ǵ� ����Ͻú��ʱ��� ����
		//���ǻ��� ��¥ �����ϴ� ������� ���� 0���� ����
		Calendar c1 = Calendar.getInstance();
		c1.set(2024, 4, 5); //=> 2024�� 5�� 5��
		c1.set(Calendar.YEAR, 2024);
		c1.set(Calendar.MONTH, 4); //5��
		c1.set(Calendar.DATE, 5);

		//�ð� ����
		//�ú��ʸ� �����ϴ� �޼���� ���� ������ ���� �������
		Calendar t1 = Calendar.getInstance();
		t1.set(Calendar.HOUR_OF_DAY, 16);
		t1.set(Calendar.MINUTE, 50);
		t1.set(Calendar.SECOND, 20);
		
		System.out.println();
		
		//clear()�� Calendar ��ü�� ��� �ʵ带 �ʱ�ȭ
		Calendar dt = Calendar.getInstance();
		System.out.println(new Date(dt.getTimeInMillis()));
		dt.clear();
		System.out.println(new Date(dt.getTimeInMillis())); //EPOCH Time
		
		//clear(int field)�� Calendar ��ü�� Ư�� �ʵ带 �ʱ�ȭ
		
		
	}

}
