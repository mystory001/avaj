package chapter13;

/**
 * *쓰레드의 구현과 실행
 * -Thread 클래스를 상속
 * -Runnable 인터페이스를 구현 → 더 나음
 */

//Thread 클래스를 상속
//class MyThread extends Thread{ //자바는 단일 상속만 가능
//	public void run(){ //Thead 클래스의 run()을 오버라이딩
//		/* 작업 내용 */    
//    }
//}
//쓰레드 생성과 실행
//MyThread t = new MyThread();
//t.start();


//Runnable 인터페이스를 구현
//class MyThread2 implements Runnable{
//	public void run(){ //Runnable 인터페이스의 추상메소드 run()을 구현
//    	/* 작업 내용 */
//    }
//}
//쓰레드 생성과 실행
//Runnable r = new MyThread2();
//Thread t = new Thread(r); //Thread(Runnable r)
////위의 두 줄 Thread t = new Thread(new MyThread2());
//t.start();

//Thread 클래스를 상속해서 쓰레드를 구현
class Thread1_1 extends Thread{
	public void run() {
		for(int i = 0; i < 500;i++) {
			System.out.print(0); //조상 Thread의 getName() 호출
		}
	}
}

//Runnable 인터페이스를 구현해서 쓰레드를 구현
class Thread1_2 implements Runnable{
	public void run() {
		for(int i = 0; i<500;i++) {
			System.out.print(1); //Thread.currentThread() 현재 실행중인 Thread를 반환
		}
	}
}

public class 쓰레드2_1 {
	
	public static void main(String[] args) {

		Thread1_1 t1 = new Thread1_1();
		t1.start();

		Runnable r = new Thread1_2();
		Thread t2 = new Thread(r);
		t2.start();
	}

}
