package chapter13;

/**
 * *main ������
 * -main �޼ҵ��� �ڵ带 �����ϴ� ������
 * -������� '����� ������'�� '���� ������' �� ������ ����
 *  ����� ������ : main������, ���� ������ : ���� ������
 * -���� ���� ����� �����尡 �ϳ��� ���� �� ���α׷��� �����
 */

class Thread3_1 extends Thread{
	public void run() {
		for(int i = 0; i<300;i++) {
			System.out.print(new String("-"));
		}
	}
}
class Thread3_2 extends Thread{
	public void run() {
		for(int i = 0; i<300;i++) {
			System.out.print(new String("|"));
		}
	}
}

public class ������3_1 {

	public static void main(String[] args) {
		
		Thread3_1 th1 = new Thread3_1();
		Thread3_2 th2 = new Thread3_2();
		th1.start();
		th2.start();
		long startTime = System.currentTimeMillis();
		
		try {
			th1.join(); //join() : main �����尡 th1 �۾��� ���������� ��ٸ�
			th2.join();  
		} catch (InterruptedException e) {
		}
		
		System.out.println("�ҿ�ð� : " + (System.currentTimeMillis()-startTime));

	}

}
