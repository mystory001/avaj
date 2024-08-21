package chapter13;

import javax.swing.JOptionPane;

/**
 * *쓰레드의 I/O 블락킹
 * -싱글쓰레드 사용자로부터 입력을 기다리는 구간 아무 작업도 하지 않음
 * -멀티쓰레드 사용자로부터 입력을 기다리는 구간 다른 작업을 수행함
 */

public class 쓰레드3_3 {

	public static void main(String[] args) {
		
		//싱글
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
		System.out.println("입력하신 값 " + input);
		for(int i = 10; i>0 ; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

		//멀티
//		Thread3_3a th1 = new Thread3_3a();
//		th1.start();
		String input1 = JOptionPane.showInputDialog("아무값이나 입력하세요.");
		System.out.println("입력한 값은 " + input1);
		
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
