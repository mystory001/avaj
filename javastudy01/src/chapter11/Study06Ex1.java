package chapter11;

import java.util.ArrayList;
import java.util.Iterator;

public class Study06Ex1 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		//iterator�� 1ȸ����
		Iterator iterator = list.iterator(); 
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//		==
//		while(iterator.hasNext()) {
//			Object obj = iterator.next();
//			System.out.println(obj);
//		}
		
		
		//�����ϰ��� �� �� �ٽ� ���;���
		iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("for������");
		
		for(int i = 0 ; i < list.size();i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}

}
