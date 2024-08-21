package chapter13;

/**
 * *쓰레드의 우선순위(priority of thread)
 * -작업의 중요도에 따라 쓰레드의 우선순위를 다르게 하여 특정 쓰레드가 더 많은 작업시간을 갖게 할 수 있음
 * void setPriority(int newPriority) //쓰레드의 우선순위를 지정한 값으로 변경
 * int getPriority() // 쓰레드의 우선순위를 반환
 * public static final int MAX_PRIORITY = 10; //최대 우선순위
 * public static final int MIN_PRIORITY = 1; //최소 우선순위
 * public static final int NORM_PRIORITY = 5; //보통 우선순위(기본적)
 * 우선순위를 정해주면 반드시 우선순위에 따라 작동하는 것은 아님. 무조건 OS 스케줄러에 따라서 작업이 수행됨
 */

class ThreadEx4_1a extends Thread{
	public void run() {
		for(int i = 0; i<300;i++) {
			System.out.print("-");
			for(int x = 0; x<10000000;x++); //시간지연용 for문
		}
	}
}
class ThreadEx4_1b extends Thread{
	public void run() {
		for(int i = 0; i<300;i++) {
			System.out.print("|");
			for(int x = 0; x<10000000;x++);
		}
	}
}


public class 쓰레드4_1 {

	public static void main(String[] args) {
		ThreadEx4_1a th1 = new ThreadEx4_1a();
		ThreadEx4_1b th2 = new ThreadEx4_1b();
		
		th2.setPriority(7);
		System.out.println("th1의 우선순위(-) " + th1.getPriority());
		System.out.println("th2의 우선순위(|) " + th2.getPriority());

		th1.start();
		th2.start();
	}

}
