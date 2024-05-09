package chapter11;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Study06Ex1_2 {

	public static void main(String[] args) {
		
		//참조변수의 종류를 정할 때도 잘 정해야함
		
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
		

//		HashSet으로 변경 시 get() 메소드가 없어서 사용할 수 없음
//		System.out.println("for문으로");
//		
//		for(int i = 0 ; i < list.size();i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//		}
		
	}

}
