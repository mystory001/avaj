package chapter07;

class TV{
	boolean power; //��������(on/off)
	int channel; //ä��
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	//�θ� ��� 5��
}

class SmartTV extends TV{ //SmartTV�� TV�� �ڸ��� �����ִ� ���
	boolean caption; //�ڸ�����(on/off)
	void displayCation(String text) {
		if(caption) { //�ڸ� ���°� on(true)�� �� text�� ������
			System.out.println(text);
		}
	}
	//�ڽ� ��� 2��
}
public class Study01Ex1 {

	public static void main(String[] args) {

		SmartTV smartTV = new SmartTV();
		smartTV.channel = 10; //���� Ŭ�����κ��� ��ӹ��� ���
		smartTV.channelUp(); //���� Ŭ�����κ��� ��ӹ��� ���
		System.out.println(smartTV.channel);
		smartTV.displayCation("Hello World");
		smartTV.caption = true;
		smartTV.displayCation("Hello world");
		
		
	}

}
