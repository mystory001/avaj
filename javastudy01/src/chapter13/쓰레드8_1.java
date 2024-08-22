package chapter13;

/**
 * *join()
 * -지정된 시간동안 특정 쓰레드가 작업하는 것을 기다림
 * void join() //작업이 모두 끝날때까지 기다림
 * void join(long millis) //천분의 일초 동안
 * void join(long millis, int nanos) //천분의 일초 + 나노초 동안
 * -예외처리를 해야함(InterruptedException이 발생하면 작업 재개)
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

public class 쓰레드8_1 {
	static long startTime = 0; //시작 시간
	
	public static void main(String[] args) {
		Thread8_1a th1 = new Thread8_1a();
		Thread8_1b th2 = new Thread8_1b();
		
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();
		
		try {
			th1.join(); //main쓰레드가 th1의 작업이 끝날때까지 기다림
			th2.join(); //main쓰레드가 th2의 작업이 끝날때까지 기다림
		} catch (InterruptedException e) {
		}

		System.out.println("소요시간 : " + (System.currentTimeMillis()-startTime));
	}

}
