package chapter07;

class TVS11E1{
	boolean power; //전원상태
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

class SmartTVS11E1 extends TVS11E1{
	String text; //자막을 보여주기 위한 문자열
	void caption() {
		//구현부
	}
}


public class Study11Ex1 {

	public static void main(String[] args) {

		//타입이 일치
		TVS11E1 tvs11e1 = new TVS11E1();
		SmartTVS11E1 smartTVS11E1 = new SmartTVS11E1();
		
		//타입 불일치
		TVS11E1 t = new SmartTVS11E1();
		
	}
	
}
