package exercise.chapter06;

//getTotal(), getAverage()�� �߰�
class Student2{
	String name; //�л��̸�
	int ban; //��
	int no; //��ȣ
	int kor; //��������
	int eng; //��������
	int math; //��������
	
	int getTotal() { //����,����,������ ������ ��� ���ؼ� ��ȯ
		return kor+eng+math;
	}
	
	float getAverage() { //������ ������� ���� ����� ����
		return (float) ((int)(((getTotal()/3.0F)*10+0.5)))/10;
	}
	
}

public class Ex04 {

	public static void main(String[] args) {
		
		Student2 s = new Student2();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸� : " + s.name);
		System.out.println("���� : " + s.getTotal());
		System.out.println("��� : " + s.getAverage());

	}

}
