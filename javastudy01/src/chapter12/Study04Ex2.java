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
		
		HashMap<String, Student04Ex2> map = new HashMap<>(); //�����ڿ� Ÿ������ ���� ����
		map.put("ȫ�浿", new Student04Ex2("ȫ�浿", 1, 1, 100, 100));
		
		//public V get(Object key) { //V => Student�� ����
		Student04Ex2 s = map.get("ȫ�浿");
		
		System.out.println(map.get("ȫ�浿").name);
	}

}
