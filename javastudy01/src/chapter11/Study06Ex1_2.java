package chapter11;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Study06Ex1_2 {

	public static void main(String[] args) {
		
		//���������� ������ ���� ���� �� ���ؾ���
		
		Collection collection = new HashSet();  
//		Collection collection = new TreeSet();  

		collection.add("1");
		collection.add("2");
		collection.add("3");
		collection.add("4");
		collection.add("5");
		
		Iterator iterator = collection.iterator(); 
		
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
