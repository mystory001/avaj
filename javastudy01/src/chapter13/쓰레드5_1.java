package chapter13;

/**
 * *���󾲷���
 * -�Ϲ� ������(non-daemon thread)�� �۾��� ���� �������� ������ ����
 * -�Ϲ� �����尡 ��� ����Ǹ� �ڵ������� �����
 * -������ �÷���, �ڵ�����, ȭ�� �ڵ����� � ����
 * -���ѷ����� ���ǹ��� �̿��ؼ� ���� �� ����ϴٰ� Ư�������� �����Ǹ� �۾��� �����ϰ� �ٽ� ����ϵ��� �ۼ���
 */
//public void run() {
//	while(true) {
//		try {
//			Thread.sleep(3*1000); //3�ʸ���
//		} catch(InterruptedException e) {}
//		
//		if(autoSave) {
//			autoSave();
//		}
//	}
//}
//boolean isDaemon() //�����尡 ���� ���������� Ȯ��. ���� �������̸� true�� ��ȯ
//void setDaemon(boolean on) //�����带 ���� ������� �Ǵ� ����� ������� ����. �Ű����� on�� true�� �����ϸ� ���󾲷��尡 ��
////��setDaemon(boolean on)�� �ݵ�� start()�� ȣ���ϱ� ���� ����Ǿ�� ��. �׷��� ������ IllegalThreadStateException�� �߻�


public class ������5_1 implements Runnable{
	static boolean autoSave = false;
	
	

	public static void main(String[] args) {
		//main ������(�Ϲ� ������)
		Thread t = new Thread(new ������5_1());
		t.setDaemon(true); //�� �κ��� ���� �� ���ᰡ ���� ����
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
		System.out.println("���α׷��� �����մϴ�.");

	}
	
	//���󾲷���
	@Override
	public void run() {
		while(true) { //�ڵ����� - �Ϲݾ����尡 �ϳ��� ���� ��
			try {
				Thread.sleep(3000); //3�ʸ���
			} catch (InterruptedException e) {
			}
			if(autoSave) {
				autoSave();
			}
		}
		
	}
	
	public void autoSave() {
		System.out.println("�۾� ������ �ڵ� ����Ǿ����ϴ�.");
	}
	
}
