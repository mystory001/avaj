package chapter11;

public class Study02 {

	public static void main(String[] args) {
		
		//Collection 인터페이스의 메서드
		//List 순서 있고, 중복 가능, Set 순서가 없고, 중복 불가능, List 순서가 없고, 중복(키는 불가능, 값은 가능)
		//boolean add(Object o), boolean addAll(Collection c) : 지정된 객체(o) 또는 Collection(c)의 객체들을 Collection에 추가
		//void clear() : Collection의 모든 객체를 삭제
		//boolean constarins(Object o), boolean(Collection c) : 지정된 객체(o) 또는 Collection의 객체들이 Collection에 포함되어 있는지 확인
		//boolean equals(Object o) : 동일한 Collection인지를 비교
		//int hashCode() : Collection의 hash code를 반환
		//boolean isEmpty() : Collection이 비어있는지 확인
		//Iterator iterator() : Collection의 Iterator를 얻어 반환
		//boolean remove(Object o) : 지정된 객체를 삭제
		//boolean removeAll(Collection c) : 지정된 Collection에 포함된 객체들을 삭제
		//boolean retainAll(Collection c) : 지정된 Collection에 포함된 객체만을 남기고 다른 객체들은 Collection에서 삭제. 이 작업으로 Collection에 변화가 있으면 true, 그렇지 않으면 false 반환
		//int size() : Collection에 지정된 객체의 개수를 반환
		//Object[] toArray() : Collection에 저장된 객체를 객체배열(Object[])로 반환
		//Object[] toArray(Object[] a) : 지정된 배열에 Collection의 객체를 저장해서 반환
		
		//List 인터페이스 - 저장 순서 O, 중복 O
		//Vector ArrayList LinkedList
		//void add(int index, Object element), boolean addAll(int index, Collection c) : 지정된 위치(index)에 객체(element) 또는 컬렉션에 포함된 객체들을 추가
		//Object get(int index) : 지정된 위치(index)에 있는 객체를 반환
		//int indexOf(Object o) : 지정된 객체의 위치(index)를 반환(List의 첫 번째 요소부터 순방향으로 찾음)
		//int lastIndexOf(Object o) : 지정된 객체의 위치(index)를 반환(List의 마지막 요소부터 역방향으로 찾음)
		//ListIterator listIterator(), ListIterator listIterator(int index) : List의 객체에 접근할 수 있는 ListIterator를 반환
		//Object remove(int index) : 지정된 위치(index)에 있는 객체를 삭제하고 삭제된 객체를 반환
		//Object set(int index, Object element) : 지정된 위치(index)에 객체(element)를 저장
		//void sort(Comparator c) : 지정된 비교자(comparator)로 List를 정렬
		//List subList(int fromIndex, int toIndex) : 지정된 범위(fromIndex부터 toIndex)에 있는 객체를 반환

		//Set 인터페이스 - 저장 순서 X, 중복 X
		//HashSet, TreeSet
		//Collection 인터페이스와 동일한 메서드를 가짐
		//boolean addAll(Collection c) : 지정된 Collection(c)의 객체들을 Collection에 추가(합집합)
		//boolean constrainsAll(Collection c) : 지정된 Collection의 객체들이 Collection에 포함되어 있는지 확인(부분집합)
		//boolean removeAll(Collection c) : 지정된 Collection에 포함된 객체들을 삭제(차집합)
		//boolean retainAll(Collection c) : 지정된 Collection에 포함된 객체만들 남기고 나머지는 Collection에서 삭제(교집합)
		//※집합과 관련된 메서드 Collection에 변화가 있으면 true, 아니면 false
		
		//Map 인터페이스 - 순서 X, 중복(key X, value O)
		//HashMap, TreeMap
		//void clear() : Map의 모든 객체를 삭제
		//boolean constrainsKey(Object key) : 지정된 key객체와 일치하는 Map의 key객체가 있는지 확인
		//boolean containsValue(Object value) : 지정된 value객체와 일치하는 Map의 value객체가 있는지 확인
		//Set entrySet() : Map에 저장되어 있는 key-value쌍을 Map.Entry타입의 객체로 저장한 Set으로 반환
		//boolean equals(Object o) : 동일한 Map인지 비교
		//Object get(Object key) : 지정된 key객체에 대응하는 value객체를 찾아서 반환
		//int hashCode() : 해시코드를 반환
		//boolean isEmpty() : Map이 비어있는지 확인
		//Set keySet() : Map에 저장된 모든 key객체를 반환
		//Object put(Object key, Object value) : Map에 value객체를 key객체에 연결(mapping)하여 저장
		//void putAll(Map t) : 지정된 Map의 모든 key-value쌍을 추가
		//Object remove(Object Key) : 지정한 key객체와 일치하는 key-value객체를 삭제
		//int size() : Map에 저장된 key-value쌍의 개수를 반환
		//Collection values() : Map에 저장된 모든 value객체를 반환

		
		
		
		
		
		
		
	}

}
