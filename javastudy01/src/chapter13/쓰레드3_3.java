package chapter13;

import javax.swing.JOptionPane;

/**
 * *�������� I/O ���ŷ
 * -�̱۾����� ����ڷκ��� �Է��� ��ٸ��� ���� �ƹ� �۾��� ���� ����
 * -��Ƽ������ ����ڷκ��� �Է��� ��ٸ��� ���� �ٸ� �۾��� ������
 */

public class ������3_3 {

	public static void main(String[] args) {
		
		//�̱�
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� �� " + input);
		for(int i = 10; i>0 ; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

		//��Ƽ
//		Thread3_3a th1 = new Thread3_3a();
//		th1.start();
		String input1 = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���.");
		System.out.println("�Է��� ���� " + input1);
		
	}

class Thread3_3a extends Thread{
	public void run() {
		for(int i = 0;i>0;i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
	
}
