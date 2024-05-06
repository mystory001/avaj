package chapter10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Study05 {

	public static void main(String[] args) throws ParseException {

		//SimpleDateFormat
		//��¥ �ð��� �پ��� �������� ����� �� �ְ� ����

		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //mm�� ���� ����
		
		//���� ��¥�� yyyy-MM-dd���·� ��ȯ�Ͽ� ��ȯ
		String todayResult = sdf.format(today);
		System.out.println(todayResult);
		
		//������ ��ȣ
		//G : ����(BC,AD)
		//y : �⵵
		//M : ��(1~12 �Ǵ� 1��~12��)
		//w : ���� �� ��° ��(1~53)
		//W : ���� �� ��° ��(1~5)
		//D : ���� �� ��° ��(1~366)
		//d : ���� �� ��° ��(1~31)
		//F : ���� �� ��° ����(1~5)
		//E : ����
		
		//Ư�� �������� �Ǿ� �ִ� ���ڿ����� ��¥�� �ð��� �̾Ƴ� �� ����
		DateFormat df1 = new SimpleDateFormat("yyyy�� MM�� dd��");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		Date date = df1.parse("2024�� 5�� 6��"); //���ڿ��� Date�� ��ȯ. ���� ó�� �ʿ���
		String dateResult = df2.format(date);
		System.out.println(dateResult); //2024/05/06
		
		//a : ����/����(AM,PM)
		//H : �ð�(0~23), h : �ð�(1~12), K(0~11), k(1~24)
		//m : ��(0~59)
		//s : ��(0~59), S : õ���� ����(0~999)
		//Z : Time zone(RFC822 time zone), z : Time zone(General time zone)
		//' : �̽�����������(Ư�����ڸ� ǥ���ϴµ� ���)
		
	}

}
