package chapter11;

public class Study11 {

	public static void main(String[] args) {
		
		//HashMap, Hashtable - 순서X 중복(키X, 값O)
		//Map 인터페이스를 구현. 데이터를 키와 값의 쌍으로 저장
		//HashMap(동기화X), Hashtable(동기화O)의 새로운 버전
		
		//HashMap
		//Map인터페이스를 구현한 대표적인 컬렉션 클래스
		//순서를 유지하려면, LinkedHashMap클래스를 사용하면 됨
		
		//TreeMap≒TreeSet
		//범위 검색과 정렬에 유리한 컬렉션 클래스
		//HashMap보다 데이터 추가, 삭제에 시간이 더 걸림(비교 저장)
		

		//HashMap의 키(key)와 값(value)
		//해싱(hashing)기법으로 데이터를 저장. 데이터가 많아도 검색이 빠름
		//Map인터페이스를 구현. 데이터를 키와 값의 쌍으로 저장
		//키(key) 컬렉션 내의 키(key) 중에서 유일(ex, id)
		//값(value) 키(key)와 달리 데이터의 중복을 허용(ex, pw)
		/*
		 HashMap hashMap = new HashMap();
		 hashMap.put("id1","1234");
		 hashMap.put("id2","4567");
		 hashMap.put("id2","1234");
		 	키	값
		 	id1 1234
		 	id2 1234(덮어씀)
		 */
		
		//해싱(hashing)
		//key값을 넣으면 배열의 index(저장위치 => hashCode)를 알려줌. 즉, 해시함수를 이용해서 저장하고 읽어 오기
		//해시함수(hash function)로 해시테이블(hash table)에 데이터를 저장, 검색
		//해시테이블은 배열과 링크드 리스트가 조합된 형태(2차원 배열, 링크드 리스트를 배열로 묶은것(변경이 쉽게)). 해시테이블 : 배열의 장점 접근성, 링크드 리스트 변경 유리
		//해시테이블에 저장된 데이터를 가져오는 과정
		//ⓐ키로 해시함수를 호출해서 해시코드를 얻음
		//ⓑ해시코드(해시함수의 반환값)에 대응하는 링크드 리스트를 배열에서 찾음
		//ⓒ링크드리스트에서 키와 일치하는 데이터를 찾음
		//※해시함수는 같은 키에 대해 항상 같은 해시코드를 반환(저장 및 읽어오기 시)해야함. 서로 다른 키일지라도 같은 값의 해시코드를 반환할 수 있음
		
		//HashMap 주요 메서드
		//해시테이블 = 배열 + 링크드리스트
		//HashMap() : 생성자
		//HashMap(int initialCapacity) : 배열 초기용량
		//HashMap(int initialCapacity, float loadFactor) : 배열 초기용량
		//HashMap(Map m)
		//Object put(Object key, Object value)
		//void putAll(Map m)
		//Object remove(Object key)
		//Object replace(Object key, Object value)
		//boolean replace(Object key, Object oldValue, Object newValue)
		//Set entrySet()
		//Set keySet()
		//Collection values()
		//Object get(Object key)
		//Object getOrDefault(Object key, Object defaultValue)
		//boolean containsKey(Object key)
		//boolean containsValue(Object value)
		//int size()
		//boolean isEmpty()
		//void clear()
		//Object clone()
		

	}

}
