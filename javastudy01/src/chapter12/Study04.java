package chapter12;

public class Study04 {
	
	public static void main(String[] args) {
		/*
		 
		 *Iterator<E>
		 -Ŭ������ �ۼ��� ��, Object Ÿ�� ��� T�� ���� Ÿ�� ������ ���
			 �Ϲ�Ŭ����
			 public interface Iterator{ 
			 	boolean hasNext();
			 	Object next();
			 	void remove();
			 } 
		 
		 => ���׸� Ŭ����
		  	public interface Iterator<E>{ 
			 	boolean hasNext();
			 	E next();
			 	void remove();
			 }
		  ex) Iterator it = list.iterator();
		  	  while(it.hasNext()){
		  	  	Student s = (Student)it.next(); //Object Ŭ�����̹Ƿ� Ÿ�� ����ġ�� ����� ����ȯ�� �������
		  	  }
		   => Iterator<Student> it = list.iterator();
		  	  while(it.hasNext()){
		  	  	Student s = it.next(); //Student Ŭ���� ���� ��ġ
		  	  }  
		  
		 */
		
		/*
		 
		 * HashMap<K,V>
		 -���� ���� Ÿ�� ������ �ʿ��� ���, �޸�(,)�� �����ڷ� ����
		 key�� value�� Ÿ���� �ٸ� �� ����
		 public class HashMap<K,V> extends AbstractMap<K,V>{
		 	(...����...)
		 	public V get(Object key){~~~}
		 	public V put(K key, V value){~~~}
		 	public V remove(Object key){~~~}
		 	(...����...)
		 }
		 
		ex) 	
		 public class HashMap<K,V> extends AbstractMap<K,V>{
		 	(...����...)
		 	public Student get(Object key){~~~}
		 	public Student put(String key, Student value){~~~}
		 	public Student remove(Object key){~~~}
		 	(...����...)
		 }
		 	
		 HashMap<String, Student> map = new HashMap<String, Student>(); //����
		 map.put("ȫ�浿", new Student("ȫ�浿",1,1,100,100)); // ������ ����

		 */
	}

}
