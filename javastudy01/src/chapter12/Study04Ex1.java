package chapter12;

import java.util.ArrayList;
import java.util.Iterator;

class Student04Ex1{
	String name = "";
	int grade;
	int no;
	
	public Student04Ex1(String name, int grade, int no) {
		this.name = name;
		this.grade = grade;
		this.no = no;
	}
}

public class Study04Ex1 {

	public static void main(String[] args) {
		
		ArrayList<Student04Ex1> list = new ArrayList<Student04Ex1>();
		list.add(new Student04Ex1("������", 1, 1));
		list.add(new Student04Ex1("�����", 1, 2));
		list.add(new Student04Ex1("�ٶ���", 2, 1));
		
		Iterator<Student04Ex1> it = list.iterator(); 
		while(it.hasNext()) {
//			Student student = it.next(); //���׸��� ����ϸ� �� ��ȯ�� �ʿ����� ����
//			System.out.println(student.name);
			//==
			System.out.println(it.next().name); //�� ��ȯ�� ���� ������ �� �ٷε� �ۼ� ����
		}

		System.out.println("================");
		
		Iterator it2 = list.iterator();
		while(it2.hasNext()) {
//			Student student = it2.next(); //���׸��� ������� ������ �� ��ȯ �ʿ�
//			Student student = (Student)it2.next();
//			System.out.println(student.name);
			//==
			System.out.println(((Student04Ex1)it2.next()).name);
		}

		
	}

}