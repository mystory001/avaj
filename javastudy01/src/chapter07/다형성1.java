package chapter07;
//������ �ൿ : �����̴�, �Դ�, �Ҹ��� ����.
class ����{
	
	public ����() {} //�⺻ ������
	
	void �����̴�() {
		System.out.println("������ �����Դϴ�.");
	}
	
	void �Դ�() {
		System.out.println("������ ����� �ϰ� �Ļ縦 �մϴ�.");
	}
	
	void �Ҹ�������() {
		System.out.println("������ �Ҹ��� ���ϴ�.");
	}
}

//���
class ��� extends ����{

	@Override
	void �����̴�() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}

	@Override
	void �Դ�() {
		System.out.println("����� ������ �ؼ� �Խ��ϴ�.");
	}

	@Override
	void �Ҹ�������() {
		System.out.println("����� �Ҹ��� �ǻ������ �մϴ�.");
	}
	
	void ����ϴ�() {
		System.out.println("����� ������ ����մϴ�.");
	}
	
}

class �� extends ����{

	@Override
	void �����̴�() {
		System.out.println("�Ұ� �� �߷� �����Դϴ�.");
	}

	@Override
	void �Դ�() {
		System.out.println("�Ұ� Ǯ�� ��� �Խ��ϴ�.");
	}

	@Override
	void �Ҹ�������() {
		System.out.println("�� ���� �Ҹ�");
	}
	
}

public class ������1 {
	
	public static void main(String[] args) {

		���� a = new ����();
		���� b = new ���();
		���� c = new ��();
//		��� d = new ����(); => ��� Ŭ������ ��� 4��, ���� Ŭ���� ��� 3�� => ����� �� ����. ���� Ŭ���������� ���� Ŭ������ ��ü�� ������ �� ����.
		
		if(c instanceof ��) {
			System.out.println("c instance of ��");
			((��)c).�Ҹ�������();
		}
		
		
	}

}
