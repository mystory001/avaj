package chapter13;

import javax.swing.JOptionPane;

/**
 * *interrupt()
 * -������(WATITIN)�� �����带 ������ ����(RUNNABLE)�� ����
 * void interrupt() //�������� interrupted���¸� false���� true�� ����
 * boolean isInterrupted() //�������� interrupted���¸� ��ȯ
 * static boolean interrupted() //���� �������� interrupted���¸� �˷��ְ�, false�� �ʱ�ȭ
 */

class Thread6_2 extends Thread{
	public void run() {
		int i = 10;
		
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0;x<250000000000L;x++); //�ð�����
		}
		System.out.println("ī��Ʈ�� �����");
		
		System.out.println("th1�� isInterrupted() : " + this.isInterrupted());
		System.out.println("th1�� interrupted() : " + Thread.interrupted()); //isInterrupted()�� �޸� interrupted()�� interrupted��� ���º����� false�� �ʱ�ȭ 
		System.out.println("th1�� interrupted() : " + Thread.interrupted());  
	}
}

public class ������6_2 {

	public static void main(String[] args) {

		Thread6_2 th1 = new Thread6_2();
		th1.start();
		
		System.out.println("isInterrupted() : " + th1.isInterrupted());
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է�");
		System.out.println("�Է��� ���� " + input);
		th1.interrupt(); //interrupt()�� ȣ���ϸ� interrupted���°� true�� ��
		System.out.println("isInterrupted() : " + th1.isInterrupted());
		System.out.println("main �������� interrupted() : " + Thread.interrupted()); //main�����尡 interrupt�Ǿ����� Ȯ��
	}

}
