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
		//기본 길이(용량, capacity)가 10인 ArrayList를 생성
		ArrayList list1 = new ArrayList(10);
		list1.add(0); //ArrayList에는 객체만 저장가능. 컴파일러가 기본형이 참조형으로 변환.(autoboxing)
		list1.add(new Integer(1));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(3));
		//ArrayList(Collection c)
		ArrayList list2 = new ArrayList(list1.subList(2, 5)); //subList 읽기 전용
		
		print(list1, list2);
		
		//정렬
		Collections.sort(list1); //list1 정렬
		Collections.sort(list2); //list2 정렬 //Collections.sort(List 1)
		//Collection은 인터페이스, Collections는 유틸 클래스
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2)); //list2의 요소들이 list1에 모두 포함되는지
		
		list2.add("C");
		list2.add("B");
		list2.add(3, "A"); //특정 위치에 요소를 추가
		print(list1, list2);
		
		list2.set(3, "AA"); //특정 위치의 요소를 변경
		print(list1, list2);
		
		list1.add(0,"1");
		System.out.println("indexOf = " + list1.indexOf("1")); //indexOf()는 지정된 객체의 위치(인덱스)를 알려줌
		System.out.println("indexOf = " + list1.indexOf(1));
		list1.remove(0); //인덱스가 1인 객체를 삭제
		//list1.remove(new Integer(1)); //1을 삭제
		print(list1, list2);
		
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2)); //list1에 list2와 겹치는 부분만 남기고 나머지는 삭제
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체들을 삭제
		for(int i = list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	}

}
