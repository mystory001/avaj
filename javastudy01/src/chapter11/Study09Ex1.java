package chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Study09Ex1 {
	
	public static void main(String[] args) {

		Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4","5","5"};
		Set set = new HashSet();		
		
		for(int i = 0; i<objArr.length;i++) {
//			set.add(objArr[i]); //HashSet에 objArr 요소를 저장
			System.out.println(objArr[i]+" = " + set.add(objArr[i]));
		}
		
		System.out.println(set); //HashSet에 저장된 요소 출력. 순서를 보장하지 않음. [1, 1, 2, 3, 4, 5] 
		
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) { //hasNext() 읽어 올 요소가 있는지 확인
			System.out.println(iterator.next()); //next() 요소 하나 꺼내오기
		}
		
	}

}
