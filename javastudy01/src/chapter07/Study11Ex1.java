package chapter07;

class TVS11E1{
	boolean power; //��������
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
	String text; //�ڸ��� �����ֱ� ���� ���ڿ�
	void caption() {
		//������
	}
}


public class Study11Ex1 {

	public static void main(String[] args) {

		//Ÿ���� ��ġ
		TVS11E1 tvs11e1 = new TVS11E1();
		SmartTVS11E1 smartTVS11E1 = new SmartTVS11E1();
		
		//Ÿ�� ����ġ
		TVS11E1 t = new SmartTVS11E1();
		
	}
	
}
