package chapter11;

import java.util.HashSet;
import java.util.Iterator;

public class Study06Ex1_1 {

	public static void main(String[] args) {
		
		HashSet list = new HashSet(); //Set은 Collection의 자손 

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
		

//		HashSet으로 변경 시 get() 메소드가 없어서 사용할 수 없음
//		System.out.println("for문으로");
//		
//		for(int i = 0 ; i < list.size();i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//		}
	}

}
