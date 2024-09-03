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
		//isPowerOn의 값이 true면 false로, false면 true로 바꿈
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() { 
		//volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가
		if(MAX_VOLUME>volume) {
			volume++;
		}
	}
	
	void volumeDown() {
		//volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소
		if(MIN_VOLUME<volume) {
			volume--;
		}
	}
	
	void channelUp() {
		//channel의 값을 1 증가
		//만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꿈
		if(channel==MAX_CHANNEL) {
			channel=MIN_CHANNEL;
		} else {
			channel++;
		}
	}
	
	void channelDown() {
		//channel의 값을 1 감소
		//만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꿈
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
		System.out.println("채널 : " + t.channel + ", 음량 : " + t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("채널 : " + t.channel + ", 음량 : " + t.volume);
		
		t.volume=100;
		t.channelUp();
		t.volumeUp();
		System.out.println("채널 : " + t.channel + ", 음량 : " + t.volume);

	}

}
