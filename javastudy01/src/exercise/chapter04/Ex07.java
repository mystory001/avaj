package exercise.chapter04;

public class Ex07 {

	public static void main(String[] args) {
		
		//Math.random()�� �̿��ؼ� 1���� 6������ ������ ������
		//���� value�� �����ϴ� �ڵ带 �ϼ�
		int value = (int)(Math.random()*6)+1;
		//6�� ���� �� int������ ��ȯ => 0���� 5������ ����
		//+1�� ���ϸ� 1���� 6������ ������ ����
		System.out.println("value = " + value);

	}

}
