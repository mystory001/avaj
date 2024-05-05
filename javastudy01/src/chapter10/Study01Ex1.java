package chapter10;

import java.util.Calendar;

public class Study01Ex1 {
	
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();  //���� ��¥�� �ð����� ����

		//get()���� ��¥�� �ð� �ʵ� �������� - int get(int field)
		int thisYear = calendar.get(Calendar.YEAR); //���ذ� �� �⵵����
		int lastDayOfMonth = calendar.getActualMaximum(Calendar.DATE); //�� ���� ������ ��
		System.out.println(thisYear);
		System.out.println(lastDayOfMonth);
		
		//Calendar�� ���ǵ� �ʵ�
		//��¥
		//YEAR : ��
		//MONTH : ��(0���ͽ���)
		//WEEK_OF_YEAR : 1�� 1�Ϻ��� ���ݱ��� �� ��° ��
		//WEEK_OF_MONTH : �� ���� �� ��° ��
		//DATE : ��
		//DAY_OF_MONTH : �� ���� �� ��° �� 
		//DAY_OF_YEAR : �� ���� �� ��°��
		//DAY_OF_WEEK : ����(1 �Ͽ���) 
		//DAY_OF_WEEK_IN_MONTH : �� ���� �� ��° ����
		
		//�ð�
		//HOUR : �ð�(0~11)
		//HOUR_OF_DAY : �ð�(0~23)
		//MINUTE : ��
		//SECOND : ��
		//MULLISECOND : õ ���� ����
		//ZONE_OFFSET : GMT ���� ����(õ ���� ���� ����)
		//AM_PM : ����/����
		
	}
	
}
