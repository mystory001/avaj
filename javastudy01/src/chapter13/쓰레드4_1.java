package chapter13;

/**
 * *�������� �켱����(priority of thread)
 * -�۾��� �߿䵵�� ���� �������� �켱������ �ٸ��� �Ͽ� Ư�� �����尡 �� ���� �۾��ð��� ���� �� �� ����
 * void setPriority(int newPriority) //�������� �켱������ ������ ������ ����
 * int getPriority() // �������� �켱������ ��ȯ
 * public static final int MAX_PRIORITY = 10; //�ִ� �켱����
 * public static final int MIN_PRIORITY = 1; //�ּ� �켱����
 * public static final int NORM_PRIORITY = 5; //���� �켱����(�⺻��)
 * �켱������ �����ָ� �ݵ�� �켱������ ���� �۵��ϴ� ���� �ƴ�. ������ OS �����ٷ��� ���� �۾��� �����
 */

class ThreadEx4_1a extends Thread{
	public void run() {
		for(int i = 0; i<300;i++) {
			System.out.print("-");
			for(int x = 0; x<10000000;x++); //�ð������� for��
		}
	}
}
class ThreadEx4_1b extends Thread{
	public void run() {
		for(int i = 0; i<300;i++) {
			System.out.print("|");
			for(int x = 0; x<10000000;x++);
		}
	}
}


public class ������4_1 {

	public static void main(String[] args) {
		ThreadEx4_1a th1 = new ThreadEx4_1a();
		ThreadEx4_1b th2 = new ThreadEx4_1b();
		
		th2.setPriority(7);
		System.out.println("th1�� �켱����(-) " + th1.getPriority());
		System.out.println("th2�� �켱����(|) " + th2.getPriority());

		th1.start();
		th2.start();
	}

}
