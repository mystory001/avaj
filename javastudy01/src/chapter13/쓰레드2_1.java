package chapter13;

/**
 * *�������� ������ ����
 * -Thread Ŭ������ ���
 * -Runnable �������̽��� ���� �� �� ����
 */

//Thread Ŭ������ ���
//class MyThread extends Thread{ //�ڹٴ� ���� ��Ӹ� ����
//	public void run(){ //Thead Ŭ������ run()�� �������̵�
//		/* �۾� ���� */    
//    }
//}
//������ ������ ����
//MyThread t = new MyThread();
//t.start();


//Runnable �������̽��� ����
//class MyThread2 implements Runnable{
//	public void run(){ //Runnable �������̽��� �߻�޼ҵ� run()�� ����
//    	/* �۾� ���� */
//    }
//}
//������ ������ ����
//Runnable r = new MyThread2();
//Thread t = new Thread(r); //Thread(Runnable r)
////���� �� �� Thread t = new Thread(new MyThread2());
//t.start();

//Thread Ŭ������ ����ؼ� �����带 ����
class Thread1_1 extends Thread{
	public void run() {
		for(int i = 0; i < 500;i++) {
			System.out.print(0); //���� Thread�� getName() ȣ��
		}
	}
}

//Runnable �������̽��� �����ؼ� �����带 ����
class Thread1_2 implements Runnable{
	public void run() {
		for(int i = 0; i<500;i++) {
			System.out.print(1); //Thread.currentThread() ���� �������� Thread�� ��ȯ
		}
	}
}

public class ������2_1 {
	
	public static void main(String[] args) {

		Thread1_1 t1 = new Thread1_1();
		t1.start();

		Runnable r = new Thread1_2();
		Thread t2 = new Thread(r);
		t2.start();
	}

}
