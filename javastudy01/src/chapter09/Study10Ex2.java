package chapter09;

import java.util.ArrayList;

public class Study10Ex2 {

	public static void main(String[] args) {

		//JDK1.5�������� �⺻���� ������ ���� ������ �Ұ�������.
		//������ �� �ڵ�
		int i = 5;
		Integer iObj = new Integer(8);
		int sum = i + iObj;
		//������ �� �ڵ�
//		int i = 5;
//		Integer iObj = new Integer(8);
//		int sum = i + iObj.intValue(); //�����Ϸ��� ����Ŭ������ �⺻������ ��ȯ��		
		
		
		//�⺻���� ���� ��ü�� �ڵ���ȯ�ϴ� ���� ����ڽ�, �� �ݴ븦 ��ڽ�
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); //����ڽ�. 10 -> new Integer(10)
		//list.add(new Integer(10));
		int value = list.get(0); //��ڽ�. new Integer(10) -> 10
		
		Integer a = list.get(0); //list�� ����� ù��° ��ü�� ����
//		int a1 = list.get(0).intValue(); //intValue()�� Integer�� int�� ��ȯ
	}
	
}
