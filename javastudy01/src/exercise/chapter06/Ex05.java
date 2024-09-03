package exercise.chapter06;

//�����ڿ� info() �߰�
class Student3{
	String name; //�л��̸�
	int ban; //��
	int no; //��ȣ
	int kor; //��������
	int eng; //��������
	int math; //��������
	
	public Student3() {} //�⺻������
	public Student3(String name, int ban, int no, int kor, int eng, int math) {
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	int getTotal() { //����,����,������ ������ ��� ���ؼ� ��ȯ
		return kor+eng+math;
	}
	
	float getAverage() { //������ ������� ���� ����� ����
		return (float) ((int)(((getTotal()/3.0F)*10+0.5)))/10;
	}
	
	String info() {
		return name+", "+ ban+", "+no+", "+ kor+", "+ eng+", "+math+", " +getTotal()+", "+ getAverage();
	}
	
}

public class Ex05 {

	public static void main(String[] args) {
		
		Student3 s = new Student3("ȫ�浿", 1, 1, 100, 60, 76);
		System.out.println(s.info());

	}

}
