package chapter11;

public class Study09 {

	public static void main(String[] args) {

		//TreeSet
		//���� �˻�(from ~ to)�� ���Ŀ� ������ �÷��� Ŭ����
		//HashSet���� ������ �߰�, ���� �ð��� �� �ɸ�

		//HashSet
		//Set�������̽��� ������ ��ǥ���� �÷��� Ŭ����
		//������ �����Ϸ���, LinkedHashSetŬ������ ����ϸ� ��
		//HashSet �ֿ� �޼���
		//HashSet()
		//HashSet(Collection c) ������
		//HashSet(int initialCapacity) �ʱ�뷮
		//HashSet(int initialCapacity, float loadFactor) float loadFactor���� �ʱ� �뷮�� �ø�������
		//boolean add(Object o) 
		//boolean addAll(Collection c) ������
		//boolean remove(Object o)
		//boolean removeAll(Collection c) ������
		//boolean retainAll(Collection c) ���Ǻ� ����(c�� �ִ� �͸� ����� ������ ����), ������
		//void clear()
		//boolean contains(Object o)
		//boolean containsAll(Collection c)
		//Iterator iterator()
		//boolean isEmpty()
		//int size()
		//Object[] toArray()
		//Object[] toArray(Object[] a)
		
		//HashSet�� ��ü�� �����ϱ� ���� ������ ���� ��ü�� �ִ��� Ȯ��
		//���� ��ü�� ������ �����ϰ�, ������ �������� ����
		//boolean add(Object o)�� ������ ��ü�� equals()�� hashCode()�� ȣ��
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
		 	return Objects.hash(name, age); //�ֽŹ��
		 }
		 
		 */
		
		
		
		
		
		
		
	}
	
}
