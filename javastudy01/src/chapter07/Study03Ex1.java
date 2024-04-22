package chapter07;

class TV1{
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class DVD{
	boolean power;
	
	void power() {
		power = !power;
	}
	void play() {}
	void stop() {}
	void rew() {}
	void ff() {}
}

class TvDVD extends TV1{
	DVD dvd = new DVD();
	
	void play() {
		dvd.play();
	}
	
	void stop() {
		dvd.stop();
	}
	
	void rew() {
		dvd.rew();
	}
	
	void ff() {
		dvd.ff();
	}
	
}

public class Study03Ex1 {

}
