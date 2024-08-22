package chapter13;

/**
 * sleep()
 * -���� �����带 ������ �ð����� ���߰� ��
 * static void sleep(long millis)
 * -����ó���� �ؾ���(InterruptedException(Exception�� �ڼ�)�� �߻��ϸ� ���)
 * try{
 * 	Thread.sleep(1000); //�����带 1�ʵ��� ���߰� ��
 * } catch(InterruptedException e){}
 * => void delay(long millis){
 * 	try{
 *     	Thread.sleep(millis);
 *     } catch(InterruptedException e){}
 *  }
 *  -Ư�� �����带 �����ؼ� ���߰� �ϴ� ���� �Ұ�����
 *  try{
 *  	th1.sleep(1000);
 *  } catch(InterruptedException e){}
 *  =>
 *  try{
 *  	Thread.sleep(1000); //Ŭ���� �̸�(static �޼ҵ�)
 *  } catch(InterruptedException e){}
 */

class ������6_1a extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++) System.out.print("-");
		System.out.println("<<th1>>����");
	}
}
class ������6_1b extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++) System.out.print("|");
		System.out.println("[[th2]]����");
	}
}


public class ������6_1 {

	public static void main(String[] args) {

		������6_1a th1 = new  ������6_1a();
		������6_1b th2 = new  ������6_1b();
		
		th1.start();
		th2.start();
		
//		try {
////			th1.sleep(2000); //th1�� ���ڴ� ���� �ƴ� main �����尡 ���ڱ�
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//		}
		delay(2000);
		
		System.out.println("((main))����");
		
	}
	
	static void delay(long millis) {
	try {
//		th1.sleep(2000); //th1�� ���ڴ� ���� �ƴ� main �����尡 ���ڱ�
		Thread.sleep(2000);
	} catch (InterruptedException e) {
	}
}	


}
