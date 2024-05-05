package chapter10;

import java.util.Calendar;

public class Study02Ex2 {

	public static void main(String[] args) {

		final int[] TIME_UNIT = {3600, 60, 1}; //ū ������ �տ� ����
		final String[] TIME_UNIT_NAME = {"�ð�", "��", "��"};
		
		Calendar t1 = Calendar.getInstance();
		Calendar t2 = Calendar.getInstance();
		
		//t1�� 10�� 10�� 10�ʷ� ����
		t1.set(Calendar.HOUR_OF_DAY, 10);
		t1.set(Calendar.MINUTE, 10);
		t1.set(Calendar.SECOND, 10);
		
		//t2�� 20�� 20�� 20�ʷ� ����
		t2.set(Calendar.HOUR_OF_DAY, 20);
		t2.set(Calendar.MINUTE, 20);
		t2.set(Calendar.SECOND, 20);
		
		System.out.println("t1 : " + t1.get(Calendar.HOUR_OF_DAY) + "�� " + t1.get(Calendar.MINUTE)+ "�� " + t1.get(Calendar.SECOND) + "��");
		System.out.println("t2 : " + t2.get(Calendar.HOUR_OF_DAY) + "�� " + t2.get(Calendar.MINUTE)+ "�� " + t2.get(Calendar.SECOND) + "��");
		
		long diff = Math.abs(t2.getTimeInMillis() - t1.getTimeInMillis())/1000;
		System.out.println("t1�� t2�� ���̴� " + diff + "��");
		
		String temp = "";
		for(int i = 0; i<TIME_UNIT.length;i++) {
			temp += diff/TIME_UNIT[i] + TIME_UNIT_NAME[i];
			diff %= TIME_UNIT[i];
		}
		System.out.println("���̸� �ú��ʷ� ��ȯ�ϸ� " + temp);
		
	}

}
