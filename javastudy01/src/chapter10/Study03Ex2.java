package chapter10;

import java.util.Calendar;

public class Study03Ex2 {

	public static void main(String[] args) {
		//Run - Run configuration���� �����ؾ���
		if(args.length != 2) {
			System.out.println();
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0; //1���� ����
		int END_DAY = 0;
		
		Calendar startDay = Calendar.getInstance(); //������
		Calendar endDay = Calendar.getInstance(); //����
		
		startDay.set(year, month-1, 1); //���� ��� 0���� 11�� ���� �����Ƿ� 1�� �������
		endDay.set(year, month, 1);
		
		endDay.add(Calendar.DATE, -1); //������ 1�Ͽ��� �Ϸ縦 ���� ���� ��(month)�� ������ ��
		
		START_DAY_OF_WEEK = startDay.get(Calendar.DAY_OF_WEEK); //ù ��° ������ ���� �������� �˾Ƴ�
		END_DAY = endDay.get(Calendar.DATE);
		
		System.out.println(year + "�� " + month + "��");
		System.out.println(" �� �� ȭ �� �� �� ��");
		
		//�ش� ���� 1���� ��� ���������� ���� ������ ���
		//���� 1���� �������̶�� ������ 3�� ��´�.
		for(int i=1;i < START_DAY_OF_WEEK ;i++) {
			System.out.print(" ");
		}
		
		for(int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.print((i<10)? " " + i : " "+i);
			if(n%7==0)
				System.out.println();
		}
		
		
		//1. ������ �� ���ϱ� ������ 1�� - 1��
		//2. 1���� ���� ���ϱ�
		
	}
	
}
