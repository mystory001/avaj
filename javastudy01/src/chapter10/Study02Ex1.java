package chapter10;

import java.util.Calendar;

public class Study02Ex1 {
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"��" + (date.get(Calendar.MONTH)+1) + "��" + date.get(Calendar.DATE) + "��";
	}

	public static void main(String[] args) {

		final String[] DAY_OF_WEEK = {"", "��", "��", "ȭ", "��", "��", "��", "��"}; //������ 1���� �����ϱ� ������ [0]�� �����
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		//���� ��� 0���� �����ϱ� ������ '����� - 1'�� �������
		c1.set(2024, 3, 5); //2024�� 4�� 5�Ϸ� ��¥ ����
		//== c1.set(2024, Calendar.MAY, 5);
		System.out.println("c1 " + toString(c1) + DAY_OF_WEEK[c1.get(Calendar.DAY_OF_WEEK)] + "����");
		System.out.println("c2 " + toString(c2) + DAY_OF_WEEK[c2.get(Calendar.DAY_OF_WEEK)] + "����");
		
		//�� ��¥���� ���̸� ��������, getTimeInMillis() õ���� ���� ������ ��ȯ
		long diff = Math.abs(c1.getTimeInMillis() - c2.getTimeInMillis())/1000;
		System.out.println("c1���� c2���� " + diff + "�ʰ� ����");
		System.out.println("��(day)�� ����ϸ� " + diff/(24*60*60) + "��"); //1�� = 24*60*60
	}

}
