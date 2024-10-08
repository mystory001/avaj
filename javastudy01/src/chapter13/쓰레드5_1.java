package chapter13;

/**
 * *데몬쓰레드
 * -일반 쓰레드(non-daemon thread)의 작업을 돋는 보조적인 역할을 수행
 * -일반 쓰레드가 모두 종료되면 자동적으로 종료됨
 * -가비지 컬렉터, 자동저장, 화면 자동갱신 등에 사용됨
 * -무한루프와 조건문을 이용해서 실행 후 대기하다가 특정조건이 만족되면 작업을 수행하고 다시 대기하도록 작성함
 */
//public void run() {
//	while(true) {
//		try {
//			Thread.sleep(3*1000); //3초마다
//		} catch(InterruptedException e) {}
//		
//		if(autoSave) {
//			autoSave();
//		}
//	}
//}
//boolean isDaemon() //쓰레드가 데몬 쓰레드인지 확인. 데몬 쓰레드이면 true를 반환
//void setDaemon(boolean on) //쓰레드를 데몬 쓰레드로 또는 사용자 쓰레드로 변경. 매개변수 on을 true로 지정하면 데몬쓰레드가 됨
////※setDaemon(boolean on)은 반드시 start()를 호출하기 전에 실행되어야 함. 그렇지 않으면 IllegalThreadStateException이 발생


public class 쓰레드5_1 implements Runnable{
	static boolean autoSave = false;
	
	

	public static void main(String[] args) {
		//main 쓰레드(일반 쓰레드)
		Thread t = new Thread(new 쓰레드5_1());
		t.setDaemon(true); //이 부분이 없을 시 종료가 되지 않음
		t.start();
		
		for(int i =1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			System.out.println(i);
			if(i==5) {
				autoSave = true;
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}
	
	//데몬쓰레드
	@Override
	public void run() {
		while(true) { //자동종료 - 일반쓰레드가 하나도 없을 때
			try {
				Thread.sleep(3000); //3초마다
			} catch (InterruptedException e) {
			}
			if(autoSave) {
				autoSave();
			}
		}
		
	}
	
	public void autoSave() {
		System.out.println("작업 파일이 자동 저장되었습니다.");
	}
	
}
