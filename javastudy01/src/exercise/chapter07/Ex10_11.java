package exercise.chapter07;

class MyTv10{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setVolume(int volume) {
		//매개변수가 있는 메소드는 반드시 유효성검사가 필요함
		if(volume>MAX_VOLUME||volume<MIN_VOLUME)
			return;
		
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setChannel(int channel) {
		//매개변수가 있는 메소드는 반드시 유효성검사가 필요함
		if(channel>MAX_CHANNEL|| channel<MIN_CHANNEL)
			return;
		
		prevChannel = this.channel;
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}

	//Ex11 이전 체널로 이동하는 기능의 메소드를 추가
	public void gotoPrevChannel(){
		setChannel(prevChannel);
	}

	//	public boolean isPowerOn() {
//		return isPowerOn;
//	}
//
//	public void setPowerOn(boolean isPowerOn) {
//		this.isPowerOn = isPowerOn;
//	}
	
}

public class Ex10_11 {

	public static void main(String[] args) {
		
		MyTv10 t = new MyTv10();
		t.setChannel(52);
		System.out.println("CH : " + t.getChannel());
		t.setVolume(30);
		System.out.println("CH : " + t.getVolume());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		
	}

}
