package chapter13;

class MyThread3a extends Thread{
	public void run() {
		for(int i =0; i<300;i++) {
			System.out.print("-");
		}
	}
}
class MyThread3b extends Thread{
	public void run() {
		for(int i =0; i<300;i++) {
			System.out.print("|");
		}
	}
}

public class 쓰레드3_2 {
	
	public static void main(String[] args) {
		//싱글쓰레드
		long startTime = System.currentTimeMillis();
		
		for(int i =0; i<300;i++) {
			System.out.print("-");
		}
		
		System.out.println("A작업 소요시간 : " + Math.abs(startTime-System.currentTimeMillis()));
		
		for(int i =0; i<300;i++) {
			System.out.print("|");
		}
		System.out.println("B 작업 소요시간 : " + Math.abs(startTime-System.currentTimeMillis()));
		
		System.out.println("============================");
		//멀티쓰레드
		MyThread3a th1 = new MyThread3a();
		MyThread3b th2 = new MyThread3b();
		th1.start();
		th2.start();
		
		
	}

}
