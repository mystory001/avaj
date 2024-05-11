package chapter11;

import java.util.HashSet;
import java.util.Objects;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name +" "+ age;
	}

	@Override
	public int hashCode() {
		//int hash(Object ... values); //��������
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		Person p = (Person)obj;
		//this�� �̸��� ���̸� p�� ��
		return this.name.equals(p.name) && this.age==p.age;
	}
	
}

public class Study09Ex3 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("ȫ�浿");
		set.add("ȫ�浿"); //�ߺ��̱� ������ ���� �ȵ�
		set.add(new Person("��ƹ���", 10));
		set.add(new Person("��ƹ���", 10)); //�ߺ��̱� ������ ���� �ȵ�
		
		System.out.println(set); //[��ƹ��� 10, ȫ�浿]

	}

}
