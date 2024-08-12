package chapter12;

import java.util.HashMap;

class Student04Ex2{
	String name = "";
	int grade;
	int no;
	int kor;
	int eng;
	
	public Student04Ex2(String name, int grade, int no,int kor,int eng) {
		this.name = name;
		this.grade = grade;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
	}
}

public class Study04Ex2 {

	public static void main(String[] args) {
		
		HashMap<String, Student04Ex2> map = new HashMap<>(); //생성자에 타입지정 생략 가능
		map.put("홍길동", new Student04Ex2("홍길동", 1, 1, 100, 100));
		
		//public V get(Object key) { //V => Student로 변경
		Student04Ex2 s = map.get("홍길동");
		
		System.out.println(map.get("홍길동").name);
	}

}
