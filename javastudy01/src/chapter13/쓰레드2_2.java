package chapter13;

/**
 * *쓰레드의 실행 - start()
 * -쓰레드를 생성한 후에 start()를 호출해야 쓰레드가 작업을 시작함
 * Thread t1 = new Thread(); //쓰레드 t1을 생성
 * Thread t2 = new Thread(); //쓰레드 t2를 생성
 * t1.start(); //쓰레드 t1을 실행
 * t2.start(); //쓰레드 t2를 실행
 * t1을 먼저 실행했기 때문에 t1이 먼저 실행될 '확률이 높음'. 무조건 t1이 실행되진 않음 → 쓰레드를 start() 했을 시 실행 가능한 상태가 되는 것이지 바로 실행되지 않음 → OS의 스케줄러가 실행 순서 결정
 */

/**
 * *start()와 run()
 * -run을 구현하였지만 실행은 start()를 사용
 * -start()를 하면 새로운 호출 스택 생성 → 새로운 호출 스택에 run()이 올라감 → start() 종료 → main()과 run() 서로 독립적으로 작업 수행
 */

public class 쓰레드2_2 {

	public static void main(String[] args) {
		
	}

}
