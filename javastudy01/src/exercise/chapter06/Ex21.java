package exercise.chapter06;

class MyTv1{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOff() {
		//isPowerOn�� ���� true�� false��, false�� true�� �ٲ�
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() { 
		//volume�� ���� MAX_VOLUME���� ���� ���� ���� 1 ����
		if(MAX_VOLUME>volume) {
			volume++;
		}
	}
	
	void volumeDown() {
		//volume�� ���� MIN_VOLUME���� Ŭ ���� ���� 1 ����
		if(MIN_VOLUME<volume) {
			volume--;
		}
	}
	
	void channelUp() {
		//channel�� ���� 1 ����
		//���� channel�� MAX_CHANNEL�̸�, channel�� ���� MIN_CHANNEL�� �ٲ�
		if(channel==MAX_CHANNEL) {
			channel=MIN_CHANNEL;
		} else {
			channel++;
		}
	}
	
	void channelDown() {
		//channel�� ���� 1 ����
		//���� channel�� MIN_CHANNEL�̸�, channel�� ���� MAX_CHANNEL�� �ٲ�
		if(channel<MIN_CHANNEL) {
			channel=MAX_CHANNEL;
		} else {
			channel--;
		}
	}
	
}

public class Ex21 {

	public static void main(String[] args) {
		
		MyTv1 t = new MyTv1();
		
		t.channel=100;
		t.volume=0;
		System.out.println("ä�� : " + t.channel + ", ���� : " + t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("ä�� : " + t.channel + ", ���� : " + t.volume);
		
		t.volume=100;
		t.channelUp();
		t.volumeUp();
		System.out.println("ä�� : " + t.channel + ", ���� : " + t.volume);

	}

}
