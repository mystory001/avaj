package chapter06;

class Tv{
	//Tv �Ӽ�(�������)
	String color; //����
	boolean power; //��������
	int channel; //ä��
	
	//Tv ���(�޼���)
	void power() {
		power = !power;
	} //TV�� �Ѱų� ���� ����� �ϴ� �޼���
	
	void channelUp() {
		++channel;
	} //TV ä���� ���̴� ����� �ϴ� �޼���
	
	void channelDown() {
		--channel;
	} //TV ä���� ���ߴ� ����� �ϴ� �޼���
	
}

public class Study04Ex1 {

	public static void main(String[] args) {
		Tv tv = new Tv(); //Tv �ν��Ͻ��� �����ϱ� ���� ���� t�� Tv�ν��Ͻ��� ����
		tv.channel = 7;
		tv.channelUp();
		System.out.println("���� TV ä���� " + tv.channel + "�Դϴ�");
	}

}
