package chapter13;

/**
 * *main 쓰레드
 * -main 메소드의 코드를 수행하는 쓰레드
 * -쓰레드는 '사용자 쓰레드'와 '데몬 쓰레드' 두 종류가 있음
 *  사용자 쓰레드 : main쓰레드, 데몬 쓰레드 : 보조 쓰레드
 * -실행 중인 사용자 쓰레드가 하나도 없을 때 프로그램은 종료됨
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

public class 쓰레드3_1 {

	public static void main(String[] args) {
		
		Thread3_1 th1 = new Thread3_1();
		Thread3_2 th2 = new Thread3_2();
		th1.start();
		th2.start();
		long startTime = System.currentTimeMillis();
		
		try {
			th1.join(); //join() : main 쓰레드가 th1 작업이 끝날때까지 기다림
			th2.join();  
		} catch (InterruptedException e) {
		}
		
		System.out.println("소요시간 : " + (System.currentTimeMillis()-startTime));

	}

}
