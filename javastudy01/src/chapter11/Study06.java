package chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Study06 {
	
	public static void main(String[] args) {

		//Iterator, Enumeration, Map
		//컬렉션에 저장된 데이터를 접근하는데 사용되는 인터페이스(읽어오기)
		//Enumeration은 Iterator의 구버전(≒ Iterator)
		//ListIterator는 Iterator의 접근성을 향상시킨 것(단방향에서 양방향으로)
		//Iterator 인터페이스의 메서드
		//boolean hasNext() : 읽어올 요소가 남아있는지 확인. 있으면 true, 없으면 false 반환
		//Object next() : 다음 요소를 읽어옴. next()를 호출하기 전에 hasNext()를 호출해서 읽어 올 요소가 있는지 확인하는 것이 안전
		//void remove() : next()로 읽어온 요소를 삭제. next()를 호출한 다음에 remove()를 호출해야함(선택적 기능)
		//void forEachRemaining(Consumer<? super E> action) : 컬렉션에 남아있는 요소들에 대해 지정된 작업(action)을 수행. 람다식을 사용하는 디폴트 메서드
		//Enumeration 인터페이스 메서드
		//boolean hasMoreElements() : 읽어 올 요소가 남아있는지 확인. 있으면 true, 없으면 false 반환.Iterator의 hasNext()와 같음
		//Object nextElement() : 다음 요소를 읽어옴. nextElement()를 호출하기 전 hasMoreElements()를 호출해서 읽어올 요소가 남아있는지 확인하는 것이 안정 Iterator의 next()와 같음

		//컬렉션(List, Set, Map)에 저장된 요소들을 읽어오는 방법을 표준화한 것. Iterator로 hasNext()로 확인 후 Object next()로 읽기
		//컬렉션에 iterator()를 호출해서 Iterator를 구현한 객체를 얻어서 사용
		List list = new ArrayList(); //다른 컬렉션으로 변경할 때 이 부분만 고치면 됨
		Iterator it = list.iterator();
		while (it.hasNext()) { //읽어 올 요소가 있는지 확인
			System.out.println(it.next()); //다음 요소를 읽어옴
		}
		
//		Set set = new Set();
//		Iterator iter = set.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		//Map과 Iterator
		//Map에는 iterator()가 없음. keySet(), entrySet(), values()를 호출해야함
		//Map map = new HashMap();
		//(...생략...)
		//Iterator iterator = map.entrySet().iterator(); == Set eSet = map.entrySet(); Iterator it = eSet.iterator();
		
		
		

		
	}

}
