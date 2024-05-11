package chapter11;

public class Study09 {

	public static void main(String[] args) {

		//TreeSet
		//범위 검색(from ~ to)과 정렬에 유리한 컬렉션 클래스
		//HashSet보다 데이터 추가, 삭제 시간이 더 걸림

		//HashSet
		//Set인터페이스를 구현한 대표적인 컬렉션 클래스
		//순서를 유지하려면, LinkedHashSet클래스를 사용하면 됨
		//HashSet 주요 메서드
		//HashSet()
		//HashSet(Collection c) 생성자
		//HashSet(int initialCapacity) 초기용량
		//HashSet(int initialCapacity, float loadFactor) float loadFactor언제 초기 용량을 늘릴것인지
		//boolean add(Object o) 
		//boolean addAll(Collection c) 합집합
		//boolean remove(Object o)
		//boolean removeAll(Collection c) 교집합
		//boolean retainAll(Collection c) 조건부 삭제(c에 있는 것만 남기고 나머지 삭제), 차집합
		//void clear()
		//boolean contains(Object o)
		//boolean containsAll(Collection c)
		//Iterator iterator()
		//boolean isEmpty()
		//int size()
		//Object[] toArray()
		//Object[] toArray(Object[] a)
		
		//HashSet은 객체를 저장하기 전에 기존에 같은 객체가 있는지 확인
		//같은 객체가 없으면 저장하고, 있으면 저장하지 않음
		//boolean add(Object o)는 저장할 객체의 equals()와 hashCode()를 호출
		/*
		 class Person{
		 String name;
		 int age;
		 
		 Person(String name, int age){
		 	this.name = name;
		 	this.age = age;
		 }
		 
		 	public String toString(){
		 		return name +" = " + age;
		 	}	
		 }
		 
		 public boolean equals(Object obj){
		 	if(!(obj instanceof Person return false;
		 
			Person tmp = (Person)obj;
		 	return name.equals(tmp.name) && age == tmp.age; 
		 }
		 
		 public int hashCode(){
//		 	return (name+age).hashCode();
		 	return Objects.hash(name, age); //최신방식
		 }
		 
		 */
		
		
		
		
		
		
		
	}
	
}
