package chapter13;

/**
 * *쓰레드의 상태
 * -NEW	: 쓰레드가 생성되고 아직 start()가 호출되지 않은 상태
 * -RUNNABLE : 실행 중 또는 실행 가능한 상태
 * -BLOCKED : 등기화블럭에 의해서 일시정지된 상태(lock이 풀릴 때까지 기다리는 상태)
 * -WAITING, TIMED_WAITTING : 쓰레드의 작업이 종료되지는 않았지만 실행가능하지 않은(unrunnable) 일시정지 상태. TIMED_WAITTING은 일시정지시간이 지정된 경우를 의미
 * -TERMINATED : 쓰레드의 작업이 종료된 상태
 */

/**
 * *쓰레드의 실행제어
 * -쓰레드의 실행을 제어할 수 있는 메소드가 제공됨
 * static void sleep(long millis[,int nanos])  
 * void join([long millis, int nanos])
 * void interrupt()
 * void stop()
 * void suspend()
 * void resume()
 * static void yield()
 */

public class 쓰레드5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
