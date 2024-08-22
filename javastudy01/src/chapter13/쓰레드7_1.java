package chapter13;

/**
 * *suspend()
 * -�������� ������ �Ͻ����� ��Ŵ
 * void suspend() �����带 �Ͻ����� ��Ŵ
 * *resume()
 * -�������� ������ �簳 ��Ŵ
 * void resume() suspend()�� ���� �Ͻ������� �����带 ��������·� ����
 * *stop()
 * -�������� ������ �������� ��Ŵ
 * void stop()�����带 ��� �����Ŵ
 * 
 */

//class Ex implements Runnable{
//	boolean suspended = false; //�Ͻ�����
//    boolean stopped = false; //����
//    
//    public void run(){
//    	while(!stopped){
//        	if(!suspended){
//            	/* �����尡 ������ �ڵ� */
//            }
//        }
//    }
//    public void suspend(){suspended = true;}
//    public void resume(){suspended = false;}
//    public void stop(){stopped = true;}
//}

class MyThread7_1 implements Runnable{
	volatile boolean suspended = false; //volatile �������� ���� �ٲ�. ���纻 ���X
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

public class ������7_1 {

	public static void main(String[] args) {
		MyThread7_1 th1 = new MyThread7_1("*");
		MyThread7_1 th2 = new MyThread7_1("**");
		MyThread7_1 th3 = new MyThread7_1("***");
		
		th1.start();
		th2.start();
		th3.start();

		try {
			Thread.sleep(2000);
			th1.suspend(); //������ th1�� ��� �ߴ�
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume(); //������ th1�� �簳
			Thread.sleep(3000);
			th1.stop(); //������ th1�� ��������
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {
		}
	}

}
