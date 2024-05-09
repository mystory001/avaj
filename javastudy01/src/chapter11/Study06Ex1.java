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
		
		//iterator는 1회용임
		Iterator iterator = list.iterator(); 
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//		==
//		while(iterator.hasNext()) {
//			Object obj = iterator.next();
//			System.out.println(obj);
//		}
		
		
		//재사용하고자 할 때 다시 얻어와야함
		iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("for문으로");
		
		for(int i = 0 ; i < list.size();i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}

}
