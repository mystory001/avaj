package chapter06;

public class Study19 {

	public static void main(String[] args) {
		
		//������ �ʱ�ȭ
		//��������(lv)�� ��� �� ���� �ʱ�ȭ �ؾ���
		//�������(iv, cv)�� �ڵ� �ʱ�ȭ ��
		//ex) class Test{
		//		int x; //�ν��Ͻ� ����
		//		int y = x; //�ν��Ͻ� ����
		// void method(){
		//		int i; //���� ����
		//		int j = i; //���������� �ʱ�ȭ���� �ʰ� ���. ����
		//	}
		//}
		
		//�������(iv, cv)�� �ʱ�ȭ
		//1. ����� �ʱ�ȭ(=) ���� �� ���Կ����ڸ� �̿�
		//class Car{
		// int door = 4; //�⺻�� ������ �ʱ�ȭ
		// Engine e = new Engine(); //������ ������ �ʱ�ȭ
		//}
		//�������� ������ �ʱ�ȭ �ϴ� ����� null(�⺻��) �Ǵ� ��ü �ּ�
		//2. �ʱ�ȭ ��(������ �ʱ�ȭ)
		//�ν��Ͻ� �ʱ�ȭ �� : { } ���� ���� �ֱ�
		//Ŭ���� �ʱ�ȭ �� : static { }
		//3. ������(iv �ʱ�ȭ, ������ �ʱ�ȭ)
		//Car(String color, String type, int door){ //�Ű������� �ִ� ������
		// this.color = color; this.type = type; this.door = door;}
		
		//����
		//��������� �ʱ�ȭ - static{}
		//1. ����� �ʱ�ȭ(=)
		//2. �ʱ�ȭ �� -> {}, static{}
		//3. ������(iv �ʱ�ȭ)
		//static{} ex)
		//class StaticBlockTest{
		// static int[] arr = new int[10]; //����� �ʱ�ȭ
		// static{ //Ŭ���� �ʱ�ȭ �� - �迭 arr�� ������ ä��
		//		for(int i = 0; i < arr.length; i++){
		//			arr[i] = (int)(Math.random()*10)+1;
		//		}
		//	}
		
		//Ŭ���� ���� �ʱ�ȭ ���� : Ŭ������ ó��(�޸𸮿� �ö󰥶�) �ε��� �� �� �� ��
		//�ν��Ͻ� ���� �ʱ�ȭ ���� : �ν��Ͻ��� ������ �� ����
		
		//�ʱ�ȭ ����
		//cv - > iv
		//�ڵ� -> ���� -> ����
		
	}

}
