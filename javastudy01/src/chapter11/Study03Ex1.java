package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Study03Ex1 {

	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
	
	public static void main(String[] args) {
		//�⺻ ����(�뷮, capacity)�� 10�� ArrayList�� ����
		ArrayList list1 = new ArrayList(10);
		list1.add(0); //ArrayList���� ��ü�� ���尡��. �����Ϸ��� �⺻���� ���������� ��ȯ.(autoboxing)
		list1.add(new Integer(1));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(3));
		//ArrayList(Collection c)
		ArrayList list2 = new ArrayList(list1.subList(2, 5)); //subList �б� ����
		
		print(list1, list2);
		
		//����
		Collections.sort(list1); //list1 ����
		Collections.sort(list2); //list2 ���� //Collections.sort(List 1)
		//Collection�� �������̽�, Collections�� ��ƿ Ŭ����
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2)); //list2�� ��ҵ��� list1�� ��� ���ԵǴ���
		
		list2.add("C");
		list2.add("B");
		list2.add(3, "A"); //Ư�� ��ġ�� ��Ҹ� �߰�
		print(list1, list2);
		
		list2.set(3, "AA"); //Ư�� ��ġ�� ��Ҹ� ����
		print(list1, list2);
		
		list1.add(0,"1");
		System.out.println("indexOf = " + list1.indexOf("1")); //indexOf()�� ������ ��ü�� ��ġ(�ε���)�� �˷���
		System.out.println("indexOf = " + list1.indexOf(1));
		list1.remove(0); //�ε����� 1�� ��ü�� ����
		//list1.remove(new Integer(1)); //1�� ����
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2)); //list1�� list2�� ��ġ�� �κи� ����� �������� ����
		print(list1, list2);
		
		//list2���� list1�� ���Ե� ��ü���� ����
		for(int i = list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	}

}
