package chapter10;

import java.util.Calendar;

public class Study01Ex2 {
	
	public static void main(String[] args) {

		Calendar today = Calendar.getInstance(); //�⺻������ ���� ��¥�� �ð����� ����
		System.out.println("������ �⵵(YEAR) : " + today.get(Calendar.YEAR));
		System.out.println("���� ��(MONTH) : " + today.get(Calendar.MONTH)); //(0~11)
		System.out.println("������ �� ��° ��(WEEK_OF_YEAR) : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("���� ���� �� ° ��(WEEK_OF_MONTH) : " + today.get(Calendar.WEEK_OF_MONTH));
		
		//DATE�� DAY_OF_MONTH�� ����
		System.out.println("�� ���� ��(DATE) : " + today.get(Calendar.DATE));
		System.out.println("�� ���� ��(DAY_OF_MONTH) : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("�� ���� �� ��(DAY_OF_YEAR) : " + today.get(today.DAY_OF_YEAR));
		System.out.println("���� ����(DAY_OF_WEEK) : " + today.get(Calendar.DAY_OF_WEEK)); //(1~7, 1 �Ͽ���)
		System.out.println("�� ���� �� ��° ����(DAY_OF_WEEK_IN_MONTH) : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("����_����(AM_PM) : " + today.get(Calendar.AM_PM) ); //(0 ����, 1 ����)
		System.out.println("�ð�(HOUR) : " + today.get(Calendar.HOUR)); //(0~11)
		System.out.println("�ð�(HOUR_OF_DAY) : " + today.get(Calendar.HOUR_OF_DAY)); //(0~23)
		System.out.println("��(MINUTE) : " + today.get(Calendar.MINUTE));
		System.out.println("��(SECOND) : " + today.get(Calendar.SECOND));
		System.out.println("1/1000(MILLISECOND) : " + today.get(Calendar.MILLISECOND)); //(0~999)
		System.out.println("TimeZone(ZONE_OFFSET) : " + today.get(Calendar.ZONE_OFFSET/3600000)); //-12~+12. õ���� 1�ʸ� �ð����� ǥ���ϱ� ���� 3600000���� ����.(1�ð� = 60*60��)
		System.out.println("�� ���� ������ ��(getActualMaximum(Calendar.DATE)) : " + today.getActualMaximum(Calendar.DATE));
		
	}

}
