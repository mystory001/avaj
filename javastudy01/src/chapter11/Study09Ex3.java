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
		//int hash(Object ... values); //가변인자
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		Person p = (Person)obj;
		//this의 이름과 나이를 p와 비교
		return this.name.equals(p.name) && this.age==p.age;
	}
	
}

public class Study09Ex3 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		
		set.add("홍길동");
		set.add("홍길동"); //중복이기 때문에 저장 안됨
		set.add(new Person("김아무개", 10));
		set.add(new Person("김아무개", 10)); //중복이기 때문에 저장 안됨
		
		System.out.println(set); //[김아무개 10, 홍길동]

	}

}
