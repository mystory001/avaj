package chapter12;

public class Study04 {
	
	public static void main(String[] args) {
		/*
		 
		 *Iterator<E>
		 -클래스를 작성할 때, Object 타입 대신 T와 같은 타입 변수를 사용
			 일반클래스
			 public interface Iterator{ 
			 	boolean hasNext();
			 	Object next();
			 	void remove();
			 } 
		 
		 => 제네릭 클래스
		  	public interface Iterator<E>{ 
			 	boolean hasNext();
			 	E next();
			 	void remove();
			 }
		  ex) Iterator it = list.iterator();
		  	  while(it.hasNext()){
		  	  	Student s = (Student)it.next(); //Object 클래스이므로 타입 불일치로 명시적 형변환을 해줘야함
		  	  }
		   => Iterator<Student> it = list.iterator();
		  	  while(it.hasNext()){
		  	  	Student s = it.next(); //Student 클래스 형이 일치
		  	  }  
		  
		 */
		
		/*
		 
		 * HashMap<K,V>
		 -여러 개의 타입 변수가 필요한 경우, 콤마(,)를 구분자로 선언
		 key와 value의 타입은 다를 수 있음
		 public class HashMap<K,V> extends AbstractMap<K,V>{
		 	(...생략...)
		 	public V get(Object key){~~~}
		 	public V put(K key, V value){~~~}
		 	public V remove(Object key){~~~}
		 	(...생략...)
		 }
		 
		ex) 	
		 public class HashMap<K,V> extends AbstractMap<K,V>{
		 	(...생략...)
		 	public Student get(Object key){~~~}
		 	public Student put(String key, Student value){~~~}
		 	public Student remove(Object key){~~~}
		 	(...생략...)
		 }
		 	
		 HashMap<String, Student> map = new HashMap<String, Student>(); //생성
		 map.put("홍길동", new Student("홍길동",1,1,100,100)); // 데이터 저장

		 */
	}

}
