package chapter10;

import java.util.Calendar;
import java.util.Date;

public class Study03 {

	public static void main(String[] args) {
		
		//���ʵ� �б� get() �ʵ� ���� set() �ʵ��ʱ�ȭ clear()
		//add() Ư�� �ʵ��� ���� ���� �Ǵ� ����(�Ϸ� �Ͽ��� ���� �����)
		Calendar dateAdd = Calendar.getInstance();
		dateAdd.clear(); //��� �ʵ� �ʱ�ȭ
		dateAdd.set(2024, 4, 6); //2024�� 5�� 6�Ϸ� ����
		
		dateAdd.add(Calendar.DATE,1); //��¥(DATE)�� 1�� ����
		dateAdd.add(Calendar.MONTH, -4); //��(MONTH)���� 4�� ��
		
		//roll() Ư�� �ʵ��� ���� ���� �Ǵ� ����(�Ϸ� �Ͽ��� ���� ������� ����)
		Calendar dateRoll = Calendar.getInstance();
		dateRoll.clear(); //��� �ʵ� �ʱ�ȭ
		dateRoll.set(2024, 4, 6); //2024�� 5�� 6�Ϸ� ����
		
		dateRoll.roll(Calendar.DATE,-7); //��¥(DATE)�� 1�� ����
		dateRoll.roll(Calendar.MONTH, -4); //��(MONTH)���� 4�� ��
		
		//Date�� Calendar���� ��ȯ
		//Date�� �޼���� ��κ� deprecated�Ǿ����� ������ ���
		//1. Calendar -> Date�� ��ȯ
		Calendar cal1 = Calendar.getInstance();
		Date d1 = new Date(cal1.getTimeInMillis());
		
		//2. Date�� Calendar�� ��ȯ
		Date d2 = new Date();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);

	}

}
