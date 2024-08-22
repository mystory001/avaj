package chapter13;

/**
 * *suspend()
 * -쓰레드의 실행을 일시정지 시킴
 * void suspend() 쓰레드를 일시정지 시킴
 * *resume()
 * -쓰레드의 실행을 재개 시킴
 * void resume() suspend()에 의해 일시정지된 쓰레드를 실행대기상태로 만듦
 * *stop()
 * -쓰레드의 실행을 완전정지 시킴
 * void stop()쓰레드를 즉시 종료시킴
 * 
 */

//class Ex implements Runnable{
//	boolean suspended = false; //일시정지
//    boolean stopped = false; //정지
//    
//    public void run(){
//    	while(!stopped){
//        	if(!suspended){
//            	/* 쓰레드가 수행할 코드 */
//            }
//        }
//    }
//    public void suspend(){suspended = true;}
//    public void resume(){suspended = false;}
//    public void stop(){stopped = true;}
//}

class MyThread7_1 implements Runnable{
	volatile boolean suspended = false; //volatile 변수값이 쉽게 바뀜. 복사본 사용X
	volatile boolean stopped = false;
	
	Thread th;
	
	MyThread7_1(String name){
		th = new Thread(this, name); //Thread(Runnable r, String name)
	}
	
	void start() {
		th.start();
	}
	
	void stop() {
		stopped = true;
	}
	
	void suspend() {
		suspended = true;
	}
	
	void resume() {
		suspended = false;
	}
	
	@Override
	public void run() {
		while(!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
			
		}
			
	}
}	

public class 쓰레드7_1 {

	public static void main(String[] args) {
		MyThread7_1 th1 = new MyThread7_1("*");
		MyThread7_1 th2 = new MyThread7_1("**");
		MyThread7_1 th3 = new MyThread7_1("***");
		
		th1.start();
		th2.start();
		th3.start();

		try {
			Thread.sleep(2000);
			th1.suspend(); //쓰레드 th1을 잠시 중단
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume(); //쓰레드 th1을 재개
			Thread.sleep(3000);
			th1.stop(); //쓰레드 th1을 강제종료
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {
		}
	}

}
