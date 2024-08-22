package chapter13;

/**
 * *join()
 * -������ �ð����� Ư�� �����尡 �۾��ϴ� ���� ��ٸ�
 * void join() //�۾��� ��� ���������� ��ٸ�
 * void join(long millis) //õ���� ���� ����
 * void join(long millis, int nanos) //õ���� ���� + ������ ����
 * -����ó���� �ؾ���(InterruptedException�� �߻��ϸ� �۾� �簳)
 */

class Thread8_1a extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print(new String("-"));
		}
	}
}
class Thread8_1b extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++) {
			System.out.print(new String("|"));
		}
	}
}

public class ������8_1 {
	static long startTime = 0; //���� �ð�
	
	public static void main(String[] args) {
		Thread8_1a th1 = new Thread8_1a();
		Thread8_1b th2 = new Thread8_1b();
		
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		try {
			th1.join(); //main�����尡 th1�� �۾��� ���������� ��ٸ�
			th2.join(); //main�����尡 th2�� �۾��� ���������� ��ٸ�
		} catch (InterruptedException e) {
		}

		System.out.println("�ҿ�ð� : " + (System.currentTimeMillis()-startTime));
	}

}
