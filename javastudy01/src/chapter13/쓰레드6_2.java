package chapter13;

import javax.swing.JOptionPane;

/**
 * *interrupt()
 * -대기상태(WATITIN)인 쓰레드를 실행대기 상태(RUNNABLE)로 만듦
 * void interrupt() //쓰레드의 interrupted상태를 false에서 true로 변경
 * boolean isInterrupted() //쓰레드의 interrupted상태를 반환
 * static boolean interrupted() //현재 쓰레드의 interrupted상태를 알려주고, false로 초기화
 */

class Thread6_2 extends Thread{
	public void run() {
		int i = 10;
		
		while(i!=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0;x<250000000000L;x++); //시간지연
		}
		System.out.println("카운트가 종료됨");
		
		System.out.println("th1의 isInterrupted() : " + this.isInterrupted());
		System.out.println("th1의 interrupted() : " + Thread.interrupted()); //isInterrupted()와 달리 interrupted()는 interrupted라는 상태변수를 false로 초기화 
		System.out.println("th1의 interrupted() : " + Thread.interrupted());  
	}
}

public class 쓰레드6_2 {

	public static void main(String[] args) {

		Thread6_2 th1 = new Thread6_2();
		th1.start();
		
		System.out.println("isInterrupted() : " + th1.isInterrupted());
		String input = JOptionPane.showInputDialog("아무 값이나 입력");
		System.out.println("입력한 값은 " + input);
		th1.interrupt(); //interrupt()를 호출하면 interrupted상태가 true가 됨
		System.out.println("isInterrupted() : " + th1.isInterrupted());
		System.out.println("main 쓰레드의 interrupted() : " + Thread.interrupted()); //main쓰레드가 interrupt되었는지 확인
	}

}
