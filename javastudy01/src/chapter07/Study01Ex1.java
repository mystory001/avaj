package chapter07;

class TV{
	boolean power; //전원상태(on/off)
	int channel; //채널
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	//부모 멤버 5개
}

class SmartTV extends TV{ //SmartTV는 TV에 자막을 보여주는 기능
	boolean caption; //자막상태(on/off)
	void displayCation(String text) {
		if(caption) { //자막 상태가 on(true)일 때 text를 보여줌
			System.out.println(text);
		}
	}
	//자식 멤버 2개
}
public class Study01Ex1 {

	public static void main(String[] args) {

		SmartTV smartTV = new SmartTV();
		smartTV.channel = 10; //조상 클래스로부터 상속받은 멤버
		smartTV.channelUp(); //조상 클래스로부터 상속받은 멤버
		System.out.println(smartTV.channel);
		smartTV.displayCation("Hello World");
		smartTV.caption = true;
		smartTV.displayCation("Hello world");
		
		
	}

}
