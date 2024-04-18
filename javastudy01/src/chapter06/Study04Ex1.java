package chapter06;

class Tv{
	//Tv 속성(멤버변수)
	String color; //색상
	boolean power; //전원상태
	int channel; //채널
	
	//Tv 기능(메서드)
	void power() {
		power = !power;
	} //TV를 켜거나 끄는 기능을 하는 메서드
	
	void channelUp() {
		++channel;
	} //TV 채널을 높이는 기능을 하는 메서드
	
	void channelDown() {
		--channel;
	} //TV 채널을 낮추는 기능을 하는 메서드
	
}

public class Study04Ex1 {

	public static void main(String[] args) {
		Tv tv = new Tv(); //Tv 인스턴스를 참조하기 위한 변수 t에 Tv인스턴스를 대입
		tv.channel = 7;
		tv.channelUp();
		System.out.println("현재 TV 채널은 " + tv.channel + "입니다");
	}

}
