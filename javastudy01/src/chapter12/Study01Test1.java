package chapter12;

import java.util.ArrayList;

public class Study01Test1 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add("30"); //String �߰�
		
//		Integer integer = (Integer)list.get(2); //������ OK(�����Ϸ� �Ѱ�)
		
		System.out.println(list); //����ȯ ����(����� �߻��ϴ� ����)

		//����
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
//		list1.add("30"); //String �߰�. ������ ����
		list1.add(30); //Ÿ�� üũ�� ��ȭ��
		
		Integer integer1 = list1.get(2); //����ȯ ���� ����
		
		System.out.println(list); 

		
		
	}

}
