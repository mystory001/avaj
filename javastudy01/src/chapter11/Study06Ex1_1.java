package chapter11;

import java.util.HashSet;
import java.util.Iterator;

public class Study06Ex1_1 {

	public static void main(String[] args) {
		
		HashSet list = new HashSet(); //Set�� Collection�� �ڼ� 

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator iterator = list.iterator(); 
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//		==
//		while(iterator.hasNext()) {
//			Object obj = iterator.next();
//			System.out.println(obj);
//		}
		

//		HashSet���� ���� �� get() �޼ҵ尡 ��� ����� �� ����
//		System.out.println("for������");
//		
//		for(int i = 0 ; i < list.size();i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//		}
	}

}
