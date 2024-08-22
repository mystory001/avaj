package chapter13;

/**
 * sleep()
 * -현재 쓰레드를 지정된 시간동안 멈추게 함
 * static void sleep(long millis)
 * -예외처리를 해야함(InterruptedException(Exception의 자손)이 발생하면 깨어남)
 * try{
 * 	Thread.sleep(1000); //쓰레드를 1초동안 멈추게 함
 * } catch(InterruptedException e){}
 * => void delay(long millis){
 * 	try{
 *     	Thread.sleep(millis);
 *     } catch(InterruptedException e){}
 *  }
 *  -특정 쓰레드를 지정해서 멈추게 하는 것은 불가능함
 *  try{
 *  	th1.sleep(1000);
 *  } catch(InterruptedException e){}
 *  =>
 *  try{
 *  	Thread.sleep(1000); //클래스 이름(static 메소드)
 *  } catch(InterruptedException e){}
 */

class 쓰레드6_1a extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++) System.out.print("-");
		System.out.println("<<th1>>종료");
	}
}
class 쓰레드6_1b extends Thread{
	public void run() {
		for(int i = 0; i < 300; i++) System.out.print("|");
		System.out.println("[[th2]]종료");
	}
}


public class 쓰레드6_1 {

	public static void main(String[] args) {

		쓰레드6_1a th1 = new  쓰레드6_1a();
		쓰레드6_1b th2 = new  쓰레드6_1b();
		
		th1.start();
		th2.start();
		
//		try {
////			th1.sleep(2000); //th1이 잠자는 것이 아닌 main 쓰레드가 잠자기
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//		}
		delay(2000);
		
		System.out.println("((main))종료");
		
	}
	
	static void delay(long millis) {
	try {
//		th1.sleep(2000); //th1이 잠자는 것이 아닌 main 쓰레드가 잠자기
		Thread.sleep(2000);
	} catch (InterruptedException e) {
	}
}	


}
