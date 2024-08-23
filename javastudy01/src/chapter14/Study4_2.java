package chapter14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * *컬렉션 프레임워크와 함수형 인터페이스
 * -함수형 인터페이스를 사용하는 컬렉션 프레임워크의 메소드(와일드카드 생략)
 * Collection 인터페이스
 * => boolean removeif(Predicate<E> fillter) : 조건에 맞는 요소를 삭제
 * List 인터페이스
 * => void replaceAll(UnaryOperator<E> operator) : 모든 요소를 변환하여 대체
 * Iterable 인터페이스
 * => void forEach(Consumer<T> action) : 모든 요소에 작업 action을 수행
 * Map 인터페이스
 * => V compute(K key, BiFunction<K,V,V> f) :  지정된 키의 값에 작업 f를 수행
 * V computeIfAbsent(K key, Function<K,V> f) : 키가 없으면, 작업 f 수행 후 추가
 * V computeIfPresent(K key, BiFunction<K, V, V> f) : 지정된 키가 있을 때, 작업 f 수행
 * V merge(K key, V value, BiFunction<V,V,V> f) : 모든 요소에 병합작업 f를 수행
 * void forEach(BiConsumer<K,V> action) : 모든 요소에 작업 action을 수행
 * void repaceAll(BiFunction<K,V,V>f) : 모든 요소에 치환작업 f를 수행
 */

public class Study4_2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i<10; i++)
			list.add(i);
		
		//list의 모든 요소를 출력
		list.forEach(i->System.out.print(i+","));
		System.out.println();
		//람다식이 아닐 경우
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
		System.out.println();
		
		//list에서 2 또는 3의 배수를 제거
		list.removeIf(x->x%2==0||x%3==0);
		System.out.println(list);
		
		list.replaceAll(i->i*10); //list의 각 요소에 10을 곱함
		System.out.println(list);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		//map의 모든 요소를 {k,v}의 형식으로 출력
		map.forEach((k,v)->System.out.print("{"+k+", "+v+"}, "));

	}

}
